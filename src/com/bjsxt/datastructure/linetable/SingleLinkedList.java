package com.bjsxt.datastructure.linetable;

public class SingleLinkedList implements List {

	private Node head = new Node();// 头结点，不存储数据，为了编程方便

	private int size;// 一共有几个结点

	@Override
	public int size() {

		return size;
	}

	@Override
	public Object get(int i) {
		// 可就和顺序表不一样了,不能通过索引直接计算定位，而需要从头结点开始进行查找
		Node p = head;
		for (int j = 0; j <= i; j++) {
			p = p.next;
		}
		return p.data;
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	@Override
	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(int i, Object e) {
		// 如果i位置错误报异常
		if (i < 0 || i > size) {
			throw new MyArrayIndexOutOfBoundsException("数组指针越界异常：" + i);
		}

		// 找到前一个结点，从head结点开始
		Node p = head;
		for (int j = 0; j < i; j++) {
			p = p.next;
		}
		// 新创建一个结点
		// Node newNode = new Node(e);
		Node newNode = new Node();
		newNode.data = e;
		// newNode.next = null;
		// 指明新结点的直接后继结点，newNode的后继指针指向p的后继结点，如果添加到末尾，p的后继结点为空
		newNode.next = p.next;

		// 指明新结点的直接前驱结点，p的后继指针指向newNode
		p.next = newNode;

		// size++
		size++;
	}

	@Override
	public void add(Object e) {
		this.add(size, e);

	}

	@Override
	public boolean addBefore(Object obj, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int i) {
		// 如果i位置错误报异常
		if (i < 0 || i >= size) {
			throw new MyArrayIndexOutOfBoundsException("数组指针越界异常：" + i);
		}
		Node p = head;
		for (int j = 0; j < i; j++) {
			p = p.next;
		}
		Object z = (int) p.next.data;
		// q指向p的后继结点
		Node q = p.next;
		// p的后继指针指向q的后继结点
		p.next = q.next;
		size--;
		return z;
	}

	@Override
	public boolean remove(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object replace(int i, Object e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Node p = head.next;
		for (int i = 0; i < size; i++) {
			if (i != size - 1) {
				builder.append(p.data + ",");
			} else {
				builder.append(p.data);
			}
			// 移动指针到下一个结点
			p = p.next;

		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void reverseList() {
		// 遍历反转法
		Node pre = head;// 上一结点
		Node cur = head.next;// 当前结点
		Node tmp;// 临时结点，用于保存当前结点的指针域（即下一结点）
		while (cur != null) {// 当前结点为null，说明位于尾结点
			tmp = cur.next;
			cur.next = pre;// 反转指针域的指向

			// 指针往下移动
			pre = cur;
			cur = tmp;
		}
		// 当cur为null时，pre为反转后的链表的首结点
		// 最后将原链表的头节点的指针域置为null，即原链表的尾结点
		head.next = null;
		// 重新置head为头结点，pre为首结点，此时为一个循环链表
		head.next = pre;

		// 递归反转法
//		if (head == null || head.next == null)
//			return head;
//		Node next = head.next;
//		Node new_head = reverseList(next);
//		next.next = head;
//		head.next = null;
//		return new_head;
	}
}
