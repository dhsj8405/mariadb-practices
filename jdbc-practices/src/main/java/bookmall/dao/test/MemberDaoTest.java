package bookmall.dao.test;

import bookmall.dao.MemberDao;
import bookmall.vo.MemberVo;

public class MemberDaoTest {
	public static void main(String[] args) {
		 insertTest();
	}
	private static void insertTest() {
		MemberVo vo = null;
		MemberDao dao = new MemberDao();
		
		vo = new MemberVo();
		vo.setName("둘리");
		vo.setEmail("abcd@abcd.com");
		vo.setPassword("1234");
		vo.setPhoneNumber("010-2316-8405");
		dao.insert(vo);
		
		vo = new MemberVo();
		vo.setName("마이콜");
		vo.setEmail("1234@1234.com");
		vo.setPassword("4567");
		vo.setPhoneNumber("010-2316-8405");
		dao.insert(vo);
		
	}
}
