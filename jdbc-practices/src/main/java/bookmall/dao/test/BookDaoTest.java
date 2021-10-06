package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;
import bookshop.dao.AuthorDao;
import bookshop.vo.AuthorVo;

public class BookDaoTest {
	public static void main(String[] args) {
		 insertTest();
//		findAllTest();

	}
//	private static void findAllTest() {
//		List<BookDao> list = new BookDao().findAll();
//		for(AuthorVo vo : list) {
//			System.out.println(vo);
//		}
//	}
	private static void insertTest() {
		BookVo vo = null;
		BookDao dao = new BookDao();
		
		vo = new BookVo();
		vo.setTitle("구운몽");
		vo.setPrice(5500);
		vo.setCategoryNum(1);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("운영전");
		vo.setPrice(5500);
		vo.setCategoryNum(1);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("수호지");
		vo.setPrice(5500);
		vo.setCategoryNum(1);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("햇빛은 찬란하고 인생은 귀하니까요");
		vo.setPrice(1000);
		vo.setCategoryNum(2);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("인생은 실전이다");
		vo.setPrice(2000);
		vo.setCategoryNum(2);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("작은 별이지만 빛나고 있어");
		vo.setPrice(2500);
		vo.setCategoryNum(2);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("html");
		vo.setPrice(5500);
		vo.setCategoryNum(3);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("javaScript");
		vo.setPrice(5500);
		vo.setCategoryNum(3);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("CSS");
		vo.setPrice(5500);
		vo.setCategoryNum(3);
		dao.insert(vo);

	}
}
