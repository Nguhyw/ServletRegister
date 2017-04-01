package entity;

import java.util.Arrays;
import java.util.Date;

//用户实体类
public class Users {
	private String username; //用户名
	private String password; //密码
	private String confirmpassword; // 确认密码
	private String email; //邮箱
	private String sex; //性别
	private Date birthday; //出生日期
	private String[] interest; //兴趣爱好
	private String introduce; //自我介绍
	private Boolean flag; //是否接受协议
	
	
	
	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + ", email=" + email
				+ ", sex=" + sex + ", birthday=" + birthday + ", interest="
				+ Arrays.toString(interest) + ", introduce=" + introduce
				+ ", isAccpet=" + flag + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String[] getInterest() {
		return interest;
	}
	public void setInterest(String[] interest) {
		this.interest = interest;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	
	
	
	
}
