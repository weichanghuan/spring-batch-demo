package demo;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * @Author: wch
 * @Date 2018/5/24
 */
public class MsfPayTxnItemMapper implements FieldSetMapper<AuthReconTxnList> {

    private final String[] extAttrNames = {"amountDate", "parentMerchantNo", "merchantNo", "payProduct",
            "txnType", "txnId", "txnDateTime", "txnAmt", "txnCharge", "postingAmt", "originTxnId", "originTxnDateTime", "remarks"};



    @Override
    public AuthReconTxnList mapFieldSet(FieldSet fieldSet) throws BindException {
        AuthReconTxnList authReconTxnList = new AuthReconTxnList();

        authReconTxnList.setAuthAmt(fieldSet.readBigDecimal("txnAmt").movePointLeft(2));

        authReconTxnList.setAuthTxnFee(fieldSet.readBigDecimal("txnCharge").movePointLeft(2));

        authReconTxnList.setAuthSettleAmt(fieldSet.readBigDecimal("postingAmt").movePointLeft(2));
        System.out.println(fieldSet);
        return authReconTxnList;
    }
}
