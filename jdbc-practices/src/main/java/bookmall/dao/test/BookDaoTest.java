package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;


public class BookDaoTest {
	public static void main(String[] args) {
//		 insertTest();
		findAlltest();

	}
	public static void findAlltest() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}
	public static void insertTest() {
		BookVo vo = null;
		BookDao dao = new BookDao();
		
		vo = new BookVo();
		vo.setTitle("구운몽");
		vo.setPrice(1000);
		vo.setCategoryNum(1);
		dao.insert(vo);
		

		vo = new BookVo();
		vo.setTitle("인생은 실전이다");
		vo.setPrice(2000);
		vo.setCategoryNum(2);
		dao.insert(vo);

		
		vo = new BookVo();
		vo.setTitle("javaScript");
		vo.setPrice(3000);
		vo.setCategoryNum(3);
		dao.insert(vo);

	}
}
