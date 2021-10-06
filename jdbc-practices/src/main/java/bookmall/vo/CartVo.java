package bookmall.vo;

public class CartVo {
	private Long no;
	private int member_no;
	private int quantity;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "CartVo [no=" + no + ", member_no=" + member_no + ", quantity=" + quantity + "]";
	}
}
