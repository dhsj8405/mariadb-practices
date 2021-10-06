package bookmall.dao.test;

import bookmall.dao.OrderBookDao;
import bookmall.vo.OrderBookVo;


public class OrderBookDaoTest {
	public static void main(String[] args) {
		insertTest();
	}
	
	private static void insertTest() {
		OrderBookVo vo = null;
		OrderBookDao dao = new OrderBookDao();
	
		vo = new OrderBookVo();
		vo.setBookNo(1);
		vo.setQuantity(1);
		vo.setPrice(111);
		vo.setOrderNo(1);
		dao.insert(vo);
	}
}
