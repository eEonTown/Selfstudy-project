package com.yh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.yh.model.vo.Product;

public class ProductMenu {
	
	public void main() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("===== 상품 관리 프로그램 =====");
			System.out.println("1. 상품 전체 조회");
			System.out.println("2. 상품 추가");
			System.out.println("3. 상품 수정");
			System.out.println("4. 상품 삭제");
			System.out.println("5. 상품 검색");
			System.out.println("0. 프로그램 종료하기");
			System.out.print("메뉴선택 : ");
			String select = sc.nextLine();
			
			switch(select) {
			case "1" : 
				productList();
				break;
			case "2" : 
			case "3" : 
			case "4" : 
			case "5" : 
			case "0" : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못 입력 했습니다. 다시 입력하세요.");
			}
		}
	}
	
	

	public void alert(String message) {
		System.out.println("알림 : " + message);
	}
	
	
	
	public void productList(ArrayList<Product> list) {
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
