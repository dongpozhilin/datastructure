package com.hunau;

import java.util.Arrays;

public class Test1 {
	public static void merge(int[] A, int m, int[] B, int n) {
		for (int i = m, j = 0; i < m + n; i++, j++) {
			A[i] = B[j];
		}

		Arrays.sort(A);
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
