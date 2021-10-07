package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.dao.CartDao;
import bookmall.vo.CartVo;

public class CartDaoTest {
	public static void main(String[] args) {
//		insertTest();
		findAlltest();
	}
	public static void findAlltest() {
		List<CartVo> list = new CartDao().findAll();
		for(CartVo vo : list) {
			System.out.println(vo);
		}
	}
	public static void insertTest() {
		CartVo vo = null;
		CartDao dao = new CartDao();
	
		vo = new CartVo();
		vo.setBookNo(1);
		vo.setMember_no(1);
		vo.setQuantity(1);
		dao.insert(vo);
		
		vo = new CartVo();
		vo.setBookNo(2);
		vo.setMember_no(2);
		vo.setQuantity(2);
		dao.insert(vo);
	}
}
