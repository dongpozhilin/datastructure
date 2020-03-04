package com.bjsxt.datastructure.linetable;

import java.util.LinkedList;

public class TestSingleLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(147);
		System.out.println("lst :" + lst.toString());

		List list = new SingleLinkedList();

		list.add(123);
		list.add(321);
		list.add(456);
		list.add(678);
		list.add(789);
		list.add(111);
		list.add(222);

		list.add(5, 666);

		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.get(5));
		System.out.println(list.toString());
		System.out.println(list.remove(1));
		System.out.println(list.toString());
		System.out.println(list.size());
		list.reverseList();
		System.out.println(list.toString());
	}

}
