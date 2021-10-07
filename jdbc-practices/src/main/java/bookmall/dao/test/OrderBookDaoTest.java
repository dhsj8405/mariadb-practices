package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrderBookDao;
import bookmall.vo.OrderBookVo;


public class OrderBookDaoTest {
	public static void main(String[] args) {
//		insertTest();
		findAlltest();
	}
	public static void findAlltest() {		
		List<OrderBookVo> list = new OrderBookDao().findAll();
		for(OrderBookVo vo : list) {
			System.out.println(vo);
		}
	}
	public static void insertTest() {
		OrderBookVo vo = null;
		OrderBookDao dao = new OrderBookDao();
	
		vo = new OrderBookVo();
		vo.setBookNo(1);
		vo.setQuantity(1);
		vo.setOrderNo(1);
		dao.insert(vo);
		
		
		vo = new OrderBookVo();
		vo.setBookNo(2);
		vo.setQuantity(2);
		vo.setOrderNo(2);
		dao.insert(vo);
	}
}
