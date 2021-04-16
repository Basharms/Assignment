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
@Table(name = "user")
public class User {
	
	// User types: admin: 1, user: 2
	public static final String USER_TYPE_ADMIN = "1";
	public static final String USER_TYPE_USER = "2";
	
	@Id
    @Column(name = "ID")
    private int id;
	
	@Column(name = "USER_NAME")
    private String userName;
	
	@Column(name = "PASSWORD")
    private String password;
	
	@Column(name = "USER_TYPE")
    private String userType;
	
	@Column(name = "LOGOUT_TIME")
    private Calendar logoutTime;
	
	@Column(name = "LAST_LOGIN_TIME")
    private Calendar lastLoginTime;

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

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the logoutTime
	 */
	public Calendar getLogoutTime() {
		return logoutTime;
	}

	/**
	 * @param logoutTime the logoutTime to set
	 */
	public void setLogoutTime(Calendar logoutTime) {
		this.logoutTime = logoutTime;
	}

	/**
	 * @return the lastLoginTime
	 */
	public Calendar getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * @param lastLoginTime the lastLoginTime to set
	 */
	public void setLastLoginTime(Calendar lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("(ID :: " + getId());
		sb.append(", ")
		.append("User name :: " + userName)
		.append(", ")
		.append("Password :: " + password)
		.append(", ")
		.append("Login time :: " + lastLoginTime)
		.append(", ")
		.append("Logout time :: " + logoutTime)
		.append(")");
		return sb.toString();
	}
}
