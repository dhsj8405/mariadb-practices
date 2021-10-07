package bookmall.vo;

public class MemberVo {
	private int no;
	private String name;
	private String email;
	private String password;
	private String phoneNumber;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "회원리스트 [회원번호 = " + no + ", 이름 = " + name + ", email = " + email + ", password = " + password
				+ ", phoneNumber = " + phoneNumber + "]";
	}
	
}
