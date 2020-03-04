package com.hunau;

public class BubbleSortTest {
	public static void merge(int[] A, int m, int[] B, int n) {
		for (int i = m, j = 0; i < m + n; i++, j++) {
			A[i] = B[j];
		}
		// 冒泡排序
		// 一共几轮比较
		for (int i = 0; i < A.length - 1; i++) {
			// 每一轮比较几次
			for (int j = 0; j < A.length - i - 1; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int m = 3, n = 3;
		// 开辟长度为6的数组A
		int[] A = new int[6];
		A[0] = 4;
		A[1] = 5;
		A[2] = 6;
		System.out.print("A数组合并排序前：");
		// 输出合并排序前 A数组的所有元素
		for (int i = 0; i < m + n; i++) {
			System.out.print(A[i] + " ");
		}
		// 静态初始化定义数组B
		int[] B = { 1, 2, 3 };
		// 调用merge()合并排序函数
		merge(A, 3, B, 3);
		// 输出合并排序后A数组的所有元素
		System.out.print("A数组合并排序后：");
		for (int i = 0; i < m + n; i++) {
			System.out.print(A[i] + " ");
		}
	}
}
