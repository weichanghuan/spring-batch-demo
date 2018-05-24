package demo;

import org.springframework.batch.item.ItemProcessor;


public class ProcessorImpl implements ItemProcessor<AuthReconTxnList, AuthReconTxnList> {

    @Override
    public AuthReconTxnList process(AuthReconTxnList authReconTxnList) throws Exception {

        // 模拟下发命令给设备
        System.out.println("交易金额" + authReconTxnList.getAuthAmt());



        // 返回命令对象
        return authReconTxnList;

    }

}
