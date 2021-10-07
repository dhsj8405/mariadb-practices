package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrderDao;
import bookmall.vo.OrderVo;

public class OrderDaoTest {
	public static void main(String[] args) {
//		insertTest();
		findAlltest();
	}
	public static void findAlltest() {		
		List<OrderVo> list = new OrderDao().findAll();
		for(OrderVo vo : list) {
			System.out.println(vo);
		}
	}
	public static void insertTest() {
		OrderVo vo = null;
		OrderDao dao = new OrderDao();
	
		vo = new OrderVo();
		vo.setName("둘리");		//member테이블의 no를 받아와서 해당되는 이름 넣어줘야함
		vo.setPayment(1000);
		vo.setAddress("부산광역시 금정구");
		vo.setMemberNo(1);
		dao.insert(vo);
		
		vo = new OrderVo();
		vo.setName("마이콜");		//member테이블의 no를 받아와서 해당되는 이름 넣어줘야함
		vo.setPayment(4000);
		vo.setAddress("서울특별시 서초구");
		vo.setMemberNo(2);
		dao.insert(vo);
	}
	
}
