package bookmall.vo;

public class orderBookVo {
	private int bookNo;
	private int quantity;
	private int price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	@Override
	public String toString() {
		return "orderBookVo [bookNo=" + bookNo + ", quantity=" + quantity + ", price=" + price + ", orderNo=" + orderNo
				+ "]";
	}
	
}
