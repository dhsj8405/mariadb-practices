package bookmall.dao.test;

import bookmall.dao.CartDao;
import bookmall.vo.CartVo;

public class CartDaoTest {
	public static void main(String[] args) {
		insertTest();
	}
	
	private static void insertTest() {
		CartVo vo = null;
		CartDao dao = new CartDao();
	
		vo = new CartVo();
		vo.setBookNo(5);
		vo.setMember_no(1);
		vo.setQuantity(4);
		dao.insert(vo);
		
		vo = new CartVo();
		vo.setBookNo(4);
		vo.setMember_no(2);
		vo.setQuantity(2);
		dao.insert(vo);
	}
}
