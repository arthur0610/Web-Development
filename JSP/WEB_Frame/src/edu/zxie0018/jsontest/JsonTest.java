package edu.zxie0018.jsontest;

import com.alibaba.fastjson.JSON;

import edu.zxie0018.model.Good;

public class JsonTest {
	public static void main(String[] args) {
		Good good = new Good("Apple", "Great Apple", 10, 100);
		String jsonString = JSON.toJSONString(good);
		System.out.println(jsonString);
		
		String s = "{\"goodDescrition\":\"Great Apple\",\"goodName\":\"Apple\",\"inventory\":100,\"price\":10}";
		Good g = JSON.parseObject(s, Good.class);
		System.out.println(g.getGoodName());
		System.out.println(g.getGoodDescrition());
		System.out.println(g.getPrice());
		System.out.println(g.getInventory());
	}
}
