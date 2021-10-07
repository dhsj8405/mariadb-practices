package bookmall.vo;

public class BookVo {
	private int no;
	private String title;
	private int price;
	private int categoryNum;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCategoryNum() {
		return categoryNum;
	}

	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}


	@Override
	public String toString() {
		return "BookVo [책 번호 = " + no + ", 책 이름 = " + title + ", 가격 = " + price + ", 카테고리번호 = " + categoryNum;
	}

	
}