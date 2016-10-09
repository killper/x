package com.lz.xxx;


import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
//		ArrayList<String> list3 = new ArrayList<String>();
//		list.add("a");
//		list.add("c");
//		list.add("adsd");
//		list3 = v(list);
//		for(String s : list3){
//			System.out.println(s);
//		}
//		Man man = new Man();
//		User user = new User();
//		user = (User)man;
//		System.out.println(user);
//		
//		User user1 = new Man();
//		Man man1 = (Man) user1;
//		man1 = (Man) user1;
//		
//		String s = null;
//		if(null == s || s.trim().length() <= 0){
//			System.out.println("x");
//		}else{
//			System.out.println("y");
//		}
		
		List<String> list = new ArrayList<String>();
		System.out.println(list.size());
	}

	private static ArrayList<String> v(ArrayList<String> list) {
		ArrayList<String> list2 = new ArrayList<String>();
		for(String s : list){
			list2.add(s.toUpperCase());
		}
		return list2;
	} 
}
