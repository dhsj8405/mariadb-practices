package bookmall.vo;

public class CartVo {
	private int bookNo;
	private int member_no;
	private int quantity;
	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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
		return "CartVo [no=" + bookNo + ", member_no=" + member_no + ", quantity=" + quantity + "]";
	}
}
