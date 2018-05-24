package demo;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.transaction.PlatformTransactionManager;


public class Demo {


    public static void main(String[] args) throws Exception {
        // 加载上下文
        String[] configLocations = {"applicationContext.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocations);

        // 获取任务启动器
        JobLauncher jobLauncher = applicationContext.getBean(JobLauncher.class);
        JobRepository jobRepository = applicationContext.getBean(JobRepository.class);
        PlatformTransactionManager transactionManager = applicationContext.getBean(PlatformTransactionManager.class);

        Resource resource=new FileSystemResource("src/main/resources/batch-data-source.txt");
        Resource[] resources={resource};

        String[] names = {"amountDate", "parentMerchantNo", "merchantNo", "payProduct",
                "txnType", "txnId", "txnDateTime", "txnAmt", "txnCharge", "postingAmt", "originTxnId", "originTxnDateTime", "remarks"};


        FlatFileItemReader flatFileItemReader=new FlatFileItemReader();
        DefaultLineMapper defaultLineMapper=new DefaultLineMapper();
        DelimitedLineTokenizer delimitedLineTokenizer=new DelimitedLineTokenizer();
        MultiResourceItemReader multiResourceItemReader=new MultiResourceItemReader();

        delimitedLineTokenizer.setDelimiter("|");
        delimitedLineTokenizer.setNames(names);

        defaultLineMapper.setFieldSetMapper(new MsfPayTxnItemMapper());
        defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);

        flatFileItemReader.setLineMapper(defaultLineMapper);
        flatFileItemReader.setEncoding("UTF-8");
        flatFileItemReader.setLinesToSkip(1);

        multiResourceItemReader.setResources(resources);
        multiResourceItemReader.setDelegate(flatFileItemReader);

        // 创建processor
        ProcessorImpl processor=new ProcessorImpl();

        // 创建writer
        FlatFileItemWriter<AuthReconTxnList> flatFileItemWriter = new FlatFileItemWriter<>();
        flatFileItemWriter.setResource(new FileSystemResource("src/main/resources/batch-data-target.txt"));
        flatFileItemWriter.setLineAggregator(new LineAggregatorImpl());


        // 创建Step
        StepBuilderFactory stepBuilderFactory = new StepBuilderFactory(jobRepository, transactionManager);
        Step step = stepBuilderFactory.get("step")
                .<DeviceCommand, DeviceCommand>chunk(1)
                .reader(multiResourceItemReader)       // 读操作
                .processor(processor)    // 处理操作
                .writer(flatFileItemWriter)       // 写操作
                .build();

        // 创建Job
        JobBuilderFactory jobBuilderFactory = new JobBuilderFactory(jobRepository);
        Job job = jobBuilderFactory.get("job")
                .start(step)
                .build();

        // 启动任务
        jobLauncher.run(job, new JobParameters());


    }


}
