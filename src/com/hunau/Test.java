package com.hunau;

/*
 * 问题：给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。初始化 A 和 B 的元素数量分别为 m 和 n。
 * 思路：因为数组A和数组B都是从小到大有序排列的，所以先从两数组的末端元素倒序开始比较，确保A和B中最大的元素排在后面   
 * 比如 在 A=[4,5,6,0,0,0],m=3;B=[1,2,3],n=3 的情况下，
 * ①A的末端6的 B的末端3 比较后，此时A=[4,5,6,0,0,6]
 * ②A的末端5和 B的末端3 比较后，此时A=[4,5,6,0,5,6]
 * ③A的末端4和 B的末端3 比较后，此时A=[4,5,6,4,5,6]
 * ④复制B中剩余的元素到A中，此时A=[1,2,3,4,5,6]
 */
public class Test {
	public static void merge(int[] A, int m, int[] B, int n) {
		int indexA = m - 1; // A数组中末端元素的索引
		int indexB = n - 1; // B数组中末端元素的索引
		int indexMerged = m + n - 1; // A数组的最大索引
		// 从数组A与B的末端元素倒序开始比较,大的元素先被排在后面
		while (indexA >= 0 && indexB >= 0) {
			if (A[indexA] > B[indexB]) {
				A[indexMerged] = A[indexA];
				indexMerged--;
				indexA--;
			} else {
				A[indexMerged] = B[indexB];
				indexMerged--;
				indexB--;
			}
		}
		// 确保复制B中剩余的元素到A中，不需要复制A中的剩余元素，因为那些元素原本就在A中，
		while (indexB >= 0) {
			A[indexMerged] = B[indexB];
			indexMerged--;
			indexB--;
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
