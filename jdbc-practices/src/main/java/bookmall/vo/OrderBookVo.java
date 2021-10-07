package bookmall.vo;

public class OrderBookVo {
	private int bookNo;
	private int quantity;
	private int orderNo;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	@Override
	public String toString() {
		return "orderBookVo [bookNo=" + bookNo + ", quantity=" + quantity + ", orderNo=" + orderNo
				+ "]";
	}
	
}
