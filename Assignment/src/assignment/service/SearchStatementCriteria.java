/**
 * 
 */
package assignment.service;

/**
 * @author Administrator
 *
 */
public class SearchStatementCriteria {
	
	private int accountId;
	private String dateFrom;
	private String dateTo;
	private String amountFrom;
	private String amountTo;
	
	/**
	 * @return the accountId
	 */
	public int getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the dateFrom
	 */
	public String getDateFrom() {
		return dateFrom;
	}
	/**
	 * @param dateFrom the dateFrom to set
	 */
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	/**
	 * @return the dateTo
	 */
	public String getDateTo() {
		return dateTo;
	}
	/**
	 * @param dateTo the dateTo to set
	 */
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	/**
	 * @return the amountFrom
	 */
	public String getAmountFrom() {
		return amountFrom;
	}
	/**
	 * @param amountFrom the amountFrom to set
	 */
	public void setAmountFrom(String amountFrom) {
		this.amountFrom = amountFrom;
	}
	/**
	 * @return the amountTo
	 */
	public String getAmountTo() {
		return amountTo;
	}
	/**
	 * @param amountTo the amountTo to set
	 */
	public void setAmountTo(String amountTo) {
		this.amountTo = amountTo;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("( Account ID: " + getAccountId())
		.append(", ")
		.append("AmountFrom: " + getAmountFrom())
		.append(", ")
		.append("AmountTo: " + getAmountTo())
		.append(", ")
		.append("Date from: " + getDateFrom())
		.append(", ")
		.append("Date to: " + getDateTo())
		.append(")");
		
		return sb.toString();
	}

}
