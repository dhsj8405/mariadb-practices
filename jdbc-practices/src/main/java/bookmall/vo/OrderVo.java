package bookmall.vo;

public class OrderVo {
	private int no;
	private String name;
	private int payment;
	private String address;
	private int memberNo;

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
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	@Override
	public String toString() {
		return "주문 리스트 [주문번호 = " + no + ", 이름 = " + name + ", 총금액 = " + payment + ", 주소 = " + address+"]";
	}
	
}
