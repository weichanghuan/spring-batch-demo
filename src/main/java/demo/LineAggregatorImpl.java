package demo;

import org.springframework.batch.item.file.transform.LineAggregator;


public class LineAggregatorImpl implements LineAggregator<AuthReconTxnList> {

    @Override
    public String aggregate(AuthReconTxnList authReconTxnList) {

        StringBuffer sb = new StringBuffer();
        sb.append(authReconTxnList.getAuthAmt());
        sb.append(",");
        sb.append(authReconTxnList.getAuthTxnFee());
        return sb.toString();

    }

}
