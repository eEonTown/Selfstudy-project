package com.yh.controller;

import java.util.ArrayList;

import com.yh.model.service.ProductService;
import com.yh.model.vo.Product;
import com.yh.view.ProductMenu;

public class ProductController {
	
	public void productList() {
		
		ArrayList<Product> list = new ProductService().productList();
		
		if(list.isEmpty()) {
			new ProductMenu().alert("조회된 결과가 없습니다.");
		}else {
			new ProductMenu().productList(list);
		}
	}
}
