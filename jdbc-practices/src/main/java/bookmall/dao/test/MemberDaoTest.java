package bookmall.dao.test;

import java.util.List;

import bookmall.dao.MemberDao;
import bookmall.vo.MemberVo;

public class MemberDaoTest {
	public static void main(String[] args) {
//		 insertTest();
		findAlltest();
	}
	
	private static void findAlltest() {		
		List<MemberVo> list = new MemberDao().findAll();
		for(MemberVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void insertTest() {
		MemberVo vo = null;
		MemberDao dao = new MemberDao();
		
		vo = new MemberVo();
		vo.setName("둘리");
		vo.setEmail("abcd@abcd.com");
		vo.setPassword("1122");
		vo.setPhoneNumber("01011112222");
		dao.insert(vo);
		
		vo = new MemberVo();
		vo.setName("마이콜");
		vo.setEmail("ABCD@ABCD.com");
		vo.setPassword("3344");
		vo.setPhoneNumber("01033334444");
		dao.insert(vo);
		
	}
}
