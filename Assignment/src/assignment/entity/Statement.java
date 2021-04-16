/**
 * 
 */
package assignment.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */

@Entity
@Table(name = "statement")
public class Statement {
	
	@Id
    @Column(name = "ID")
    private int id;
	
	@Column(name = "ACCOUNT_ID")
    private String accountId;

	@Column(name = "AMOUNT")
    private double amount;
	
	@Column(name = "DATEFIELD")
    private Calendar dateField;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	/**
	 * @return the dateField
	 */
	public Calendar getDateField() {
		return dateField;
	}

	/**
	 * @param dateField the dateField to set
	 */
	public void setDateField(Calendar dateField) {
		this.dateField = dateField;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("( ID: " + getId())
		.append(", ")
		.append("Account ID: " + accountId)
		.append(", ")
		.append("Amount: " + getAmount())
		.append(", ")
		.append("Date Filed: " + dateField.getTime());
		
		return sb.toString();
	}

}
