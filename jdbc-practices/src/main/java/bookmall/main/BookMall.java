package bookmall.main;

import bookmall.dao.test.BookDaoTest;
import bookmall.dao.test.CartDaoTest;
import bookmall.dao.test.CategoryDaoTest;
import bookmall.dao.test.MemberDaoTest;
import bookmall.dao.test.OrderBookDaoTest;
import bookmall.dao.test.OrderDaoTest;
public class BookMall {

	public static void main(String[] args) {
			
		System.out.println("====================== 카테고리 리스트 ======================");
//		CategoryDaoTest.insertTest();
		CategoryDaoTest.findAlltest();
		
		System.out.println("====================== 책 리스트 ======================");
//		BookDaoTest.insertTest();
		BookDaoTest.findAlltest();
		
		System.out.println("====================== 회원 리스트 ======================");
//		MemberDaoTest.insertTest();
		MemberDaoTest.findAlltest();
		
		System.out.println("====================== 카트 리스트 ======================");
//		CartDaoTest.insertTest();
		CartDaoTest.findAlltest();
		
		System.out.println("====================== 주문 리스트 ======================");
		//오더
//		OrderDaoTest.insertTest();
		OrderDaoTest.findAlltest();
		System.out.println("====================== 주문 도서 리스트 ======================");
//		OrderBookDaoTest.insertTest();
		OrderBookDaoTest.findAlltest();
	}

}
