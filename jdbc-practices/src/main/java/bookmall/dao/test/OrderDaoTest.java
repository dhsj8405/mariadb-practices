package bookmall.dao.test;

import bookmall.dao.OrderDao;
import bookmall.vo.CartVo;
import bookmall.vo.OrderVo;

public class OrderDaoTest {
	public static void main(String[] args) {
		insertTest();
	}
	
	private static void insertTest() {
		OrderVo vo = null;
		OrderDao dao = new OrderDao();
	
		vo = new OrderVo();
		vo.setName("희동이");		//member테이블의 no를 받아와서 해당되는 이름 넣어줘야함
		vo.setPayment(50000);
		vo.setAddress("test@test.com");
		vo.setMemberNo(2);
		dao.insert(vo);
	}
	
}
