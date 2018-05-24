package demo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class AuthReconTxnList implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 内部编号
	 */

	private Long id;

	/**
	 * 对账批次编号
	 */
	private Integer reconBatchId;

	/**
	 * 卡号（加密）
	 */
	private String encCardNo;

	/**
	 * 短卡号
	 */
	private String shortCardNo;

	/**
	 * 授权交易类型
	 */
	private String authTxnType;

	/**
	 * 授权交易时间
	 */
	private Date authTxnTime;

	/**
	 * 授权币别
	 */
	private String authCur;

	/**
	 * 授权金额
	 */
	private BigDecimal authAmt;

	/**
	 * 授权交易手续费币别
	 */
	private String authTxnFeeCur;

	/**
	 * 授权交易手续费
	 */
	private BigDecimal authTxnFee;

	/**
	 * 授权结算币别
	 */
	private String authSettleCur;

	/**
	 * 授权结算金额
	 */
	private BigDecimal authSettleAmt;

	/**
	 * 收单机构编号
	 */
	private String acquirerId;

	/**
	 * 授权商户编号
	 */
	private String authMerchantId;

	/**
	 * 授权商户名称
	 */
	private String authMerchantName;

	/**
	 * 授权终端编号
	 */
	private String authTerminalId;

	/**
	 * 授权方终端交易跟踪号
	 */
	private String authTermTraceNo;

	/**
	 * 授权方终端批次号
	 */
	private String authTermBatchNo;

	/**
	 * 授权方交易参考号
	 */
	private String authRef;

	/**
	 * 授权码
	 */
	private String authCode;

	/**
	 * 授权交易标志
	 */
	private String authTxnFlag;

	/**
	 * 授权方应答代码
	 */
	private String authRespCode;

	/**
	 * 对账标志
	 */
	private String reconFlag;

	/**
	 * 对账时间
	 */
	private Date reconTime;

	/**
	 * 授权交易编号
	 */
	private String authTxnId;

	/**
	 * 原授权交易编号
	 */
	private String origAuthTxnId;

	/**
	 * 交易编号
	 */
	private String txnId;

	/**
	 * 原交易编号
	 */
	private String origTxnId;

	/**
	 * 扩展参数
	 */
	private String extAttrs;

	/**
	 * 扩展金额
	 */
	private BigDecimal extAmt1;

	/**
	 * 扩展金额
	 */
	private BigDecimal extAmt2;

	private String extAttr1;

	private String extAttr2;

	private String extAttr3;

	private String extAttr4;

	private String extAttr5;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getReconBatchId() {
		return reconBatchId;
	}

	public void setReconBatchId(Integer reconBatchId) {
		this.reconBatchId = reconBatchId;
	}

	public String getEncCardNo() {
		return encCardNo;
	}

	public void setEncCardNo(String encCardNo) {
		this.encCardNo = encCardNo;
	}

	public String getShortCardNo() {
		return shortCardNo;
	}

	public void setShortCardNo(String shortCardNo) {
		this.shortCardNo = shortCardNo;
	}

	public String getAuthTxnType() {
		return authTxnType;
	}

	public void setAuthTxnType(String authTxnType) {
		this.authTxnType = authTxnType;
	}

	public Date getAuthTxnTime() {
		return authTxnTime;
	}

	public void setAuthTxnTime(Date authTxnTime) {
		this.authTxnTime = authTxnTime;
	}

	public String getAuthCur() {
		return authCur;
	}

	public void setAuthCur(String authCur) {
		this.authCur = authCur;
	}

	public BigDecimal getAuthAmt() {
		return authAmt;
	}

	public void setAuthAmt(BigDecimal authAmt) {
		this.authAmt = authAmt;
	}

	public String getAuthTxnFeeCur() {
		return authTxnFeeCur;
	}

	public void setAuthTxnFeeCur(String authTxnFeeCur) {
		this.authTxnFeeCur = authTxnFeeCur;
	}

	public BigDecimal getAuthTxnFee() {
		return authTxnFee;
	}

	public void setAuthTxnFee(BigDecimal authTxnFee) {
		this.authTxnFee = authTxnFee;
	}

	public String getAuthSettleCur() {
		return authSettleCur;
	}

	public void setAuthSettleCur(String authSettleCur) {
		this.authSettleCur = authSettleCur;
	}

	public BigDecimal getAuthSettleAmt() {
		return authSettleAmt;
	}

	public void setAuthSettleAmt(BigDecimal authSettleAmt) {
		this.authSettleAmt = authSettleAmt;
	}

	public String getAcquirerId() {
		return acquirerId;
	}

	public void setAcquirerId(String acquirerId) {
		this.acquirerId = acquirerId;
	}

	public String getAuthMerchantId() {
		return authMerchantId;
	}

	public void setAuthMerchantId(String authMerchantId) {
		this.authMerchantId = authMerchantId;
	}

	public String getAuthMerchantName() {
		return authMerchantName;
	}

	public void setAuthMerchantName(String authMerchantName) {
		this.authMerchantName = authMerchantName;
	}

	public String getAuthTerminalId() {
		return authTerminalId;
	}

	public void setAuthTerminalId(String authTerminalId) {
		this.authTerminalId = authTerminalId;
	}

	public String getAuthTermTraceNo() {
		return authTermTraceNo;
	}

	public void setAuthTermTraceNo(String authTermTraceNo) {
		this.authTermTraceNo = authTermTraceNo;
	}

	public String getAuthTermBatchNo() {
		return authTermBatchNo;
	}

	public void setAuthTermBatchNo(String authTermBatchNo) {
		this.authTermBatchNo = authTermBatchNo;
	}

	public String getAuthRef() {
		return authRef;
	}

	public void setAuthRef(String authRef) {
		this.authRef = authRef;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthTxnFlag() {
		return authTxnFlag;
	}

	public void setAuthTxnFlag(String authTxnFlag) {
		this.authTxnFlag = authTxnFlag;
	}

	public String getAuthRespCode() {
		return authRespCode;
	}

	public void setAuthRespCode(String authRespCode) {
		this.authRespCode = authRespCode;
	}

	public String getReconFlag() {
		return reconFlag;
	}

	public void setReconFlag(String reconFlag) {
		this.reconFlag = reconFlag;
	}

	public Date getReconTime() {
		return reconTime;
	}

	public void setReconTime(Date reconTime) {
		this.reconTime = reconTime;
	}

	public String getAuthTxnId() {
		return authTxnId;
	}

	public void setAuthTxnId(String authTxnId) {
		this.authTxnId = authTxnId;
	}

	public String getOrigAuthTxnId() {
		return origAuthTxnId;
	}

	public void setOrigAuthTxnId(String origAuthTxnId) {
		this.origAuthTxnId = origAuthTxnId;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getOrigTxnId() {
		return origTxnId;
	}

	public void setOrigTxnId(String origTxnId) {
		this.origTxnId = origTxnId;
	}

	public String getExtAttrs() {
		return extAttrs;
	}

	public void setExtAttrs(String extAttrs) {
		this.extAttrs = extAttrs;
	}

	public BigDecimal getExtAmt1() {
		return extAmt1;
	}

	public void setExtAmt1(BigDecimal extAmt1) {
		this.extAmt1 = extAmt1;
	}

	public BigDecimal getExtAmt2() {
		return extAmt2;
	}

	public void setExtAmt2(BigDecimal extAmt2) {
		this.extAmt2 = extAmt2;
	}

	public String getExtAttr1() {
		return extAttr1;
	}

	public void setExtAttr1(String extAttr1) {
		this.extAttr1 = extAttr1;
	}

	public String getExtAttr2() {
		return extAttr2;
	}

	public void setExtAttr2(String extAttr2) {
		this.extAttr2 = extAttr2;
	}

	public String getExtAttr3() {
		return extAttr3;
	}

	public void setExtAttr3(String extAttr3) {
		this.extAttr3 = extAttr3;
	}

	public String getExtAttr4() {
		return extAttr4;
	}

	public void setExtAttr4(String extAttr4) {
		this.extAttr4 = extAttr4;
	}

	public String getExtAttr5() {
		return extAttr5;
	}

	public void setExtAttr5(String extAttr5) {
		this.extAttr5 = extAttr5;
	}

}
