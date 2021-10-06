package bookmall.dao.test;

import bookmall.dao.CategoryDao;
import bookmall.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
		insertTest();
//		findAlltest();
	}
	
	private static void insertTest() {
		CategoryVo vo = null;
		CategoryDao dao = new CategoryDao();
	
		vo = new CategoryVo();
		vo.setName("소설");
		dao.insert(vo);
		
		vo = new CategoryVo();
		vo.setName("수필");
		dao.insert(vo);
		
		vo = new CategoryVo();
		vo.setName("컴퓨터/IT");
		dao.insert(vo);
		
		
	}
}
