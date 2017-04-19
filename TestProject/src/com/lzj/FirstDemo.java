package com.lzj;

import java.util.Scanner;

public class FirstDemo {
	static int x = 0;

	static short b = 2;
	static int a = 1000;
	static int c = 3000;
	static float e = 23.9f;

	public static void main(String[] args) {
		// System.out.println("Hello World！");

		System.out.println("a原来的值：" + a);
		System.out.println("b原来的值：" + b);

		a = b; // 小单位转成大单位
		b = (short) c; // 大单位转成小单位（需要强制类型转换）
		b = (short) e;

		System.out.println("a现在的值：" + a);
		System.out.println("b现在的值：" + b);

		// xunhuan();
		// tianjian();
		// println();

		// multiplicationPrint();
		number();

	}

	/**
	 * 不同月份兔子数量的增加数量
	 */
	private static void number() {
		long s1 = 1;
		long s2 = 1;
		int count;
		long temp;
		boolean isLoop = true;
		while (isLoop) {

			Scanner in = new Scanner(System.in);
			System.out.println("请输入月份(整数)");
			count = in.nextInt();
			for (int i = 1; i <= count; i++) {
				if (i == 1) {
					System.out.println("第" + i + "个月的兔子对数：" + s1);
					continue;
				} else if (i == 2) {
					System.out.println("第" + i + "个月的兔子对数：" + s2);
					continue;
				} else {
					temp = s2;
					s2 = s1 + s2;
					s1 = temp;
					System.out.println("第" + i + "个月的兔子对数：" + s2);
				}

			}
			Scanner is = new Scanner(System.in);
			System.out.println("是否继续输入月份(月份)：Y 或者 N");
			String str = is.next();
			if ("Y".equals(str) || "y".equals(str)) {
				isLoop = true;
			} else {
				isLoop = false;
			}
		}

	}

	public static void multiplicationPrint() {
		int sum = 0;
		for (int i = 1; i <= 9; i++) { // 表示垂直方向的行数 9行
			for (int j = 1; j <= i; j++) { // 表示每一行的列数 9列
				sum = i * j;
				System.out.print(j + "*" + i + "=" + sum);
				System.out.print(" ");
			}
			// System.out.print("i+" + "j=" + sum);
			System.out.println();
		}
		// System.out.println();

	}

	public static void xunhuan() {
		for (int i = 0; i < 5; i++) {
			System.out.println("你好");
		}
		System.out.print("打印完成！");
	}

	public static void tianjian() {
		if (x == 3) {
			System.out.print("输出的值为：" + x);
		} else if (x == 0) {
			System.out.println("输出的值为：" + x);
		}
	}

	public static void println() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		for (int x = 1; x <= 17; x++) {

			if (x == 7 | x == 8 | x == 9) {
				System.out.print("***      ***");
			} else if (x == 5 | x == 6 | x == 10 | x == 11) {
				System.out.print("************");
			} else {
				System.out.print("     **     ");
			}
			// for (int y = 0; y < 12; y++) {
			// System.out.print("*");
			// }

			System.out.println();
		}
	}

}
