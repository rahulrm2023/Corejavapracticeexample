package com.rt;

public class Day3 {

	public static void main(String[] args) {
		int i=90;
		i++; // 90 & 91
		int j = i + 9; // 100
		System.out.println(i++); // 91
		--j; // 99
		System.out.println(j * i); // 99
		i++; // 91 & 92
		--i; // 91
		System.out.println(--i); // 91
		System.out.println(j + 3); // 102
		j--; // 102 & 101
		++j; // 102
		System.out.println(j + 7); // 106
		j--; // 99 & 98
		i++; // 92 & 93
		--i; // 92
		System.out.println(i + j); // 190
		System.out.println(i);// 92
		System.out.println(j);// 98
	}

}
