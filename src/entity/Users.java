package entity;

import java.util.Arrays;
import java.util.Date;

//�û�ʵ����
public class Users {
	private String username; //�û���
	private String password; //����
	private String confirmpassword; // ȷ������
	private String email; //����
	private String sex; //�Ա�
	private Date birthday; //��������
	private String[] interest; //��Ȥ����
	private String introduce; //���ҽ���
	private Boolean flag; //�Ƿ����Э��
	
	
	
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
