package com.bjsxt.datastructure.linetable;

public class TestArrayList {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(123);
		list.add(321);
		list.add(456);
		list.add(678);
		list.add(789);
		list.add(111);
		list.add(222);
		
		list.add(3, 666);
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.get(3));
		System.out.println(list.toString());
		//根据索引删除
		System.out.println(list.remove(0));
		System.out.println(list.toString());
		System.out.println(list.size());
		//根据索引替换值
		System.out.println(list.replace(0,111));
		System.out.println(list.toString());
	}

}
