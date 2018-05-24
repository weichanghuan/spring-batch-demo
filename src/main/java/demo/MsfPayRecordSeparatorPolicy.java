package demo;

import org.springframework.batch.item.file.separator.SimpleRecordSeparatorPolicy;

/**
 * @Author: wch
 * @Date 2018/5/24
 */
public class MsfPayRecordSeparatorPolicy extends SimpleRecordSeparatorPolicy {
    /**
     * 处理记录(一行数据),如果为空,则认为结束
     *
     * @param record
     * @return
     */
    @Override
    public String postProcess(String record) {
        if ("".equals(record)||null==record) {
            return null;
        }
        return super.postProcess(record);
    }
}
