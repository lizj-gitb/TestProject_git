package com.lzj;

import java.util.Scanner;

public class FirstDemo {
	static int x = 0;

	static short b = 2;
	static int a = 1000;
	static int c = 3000;
	static float e = 23.9f;

	public static void main(String[] args) {
		// System.out.println("Hello World��");

		System.out.println("aԭ����ֵ��" + a);
		System.out.println("bԭ����ֵ��" + b);

		a = b; // С��λת�ɴ�λ
		b = (short) c; // ��λת��С��λ����Ҫǿ������ת����
		b = (short) e;

		System.out.println("a���ڵ�ֵ��" + a);
		System.out.println("b���ڵ�ֵ��" + b);

		// xunhuan();
		// tianjian();
		// println();

		// multiplicationPrint();
		number();

	}

	/**
	 * ��ͬ�·�������������������
	 */
	private static void number() {
		long s1 = 1;
		long s2 = 1;
		int count;
		long temp;
		boolean isLoop = true;
		while (isLoop) {

			Scanner in = new Scanner(System.in);
			System.out.println("�������·�(����)");
			count = in.nextInt();
			for (int i = 1; i <= count; i++) {
				if (i == 1) {
					System.out.println("��" + i + "���µ����Ӷ�����" + s1);
					continue;
				} else if (i == 2) {
					System.out.println("��" + i + "���µ����Ӷ�����" + s2);
					continue;
				} else {
					temp = s2;
					s2 = s1 + s2;
					s1 = temp;
					System.out.println("��" + i + "���µ����Ӷ�����" + s2);
				}

			}
			Scanner is = new Scanner(System.in);
			System.out.println("�Ƿ���������·�(�·�)��Y ���� N");
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
		for (int i = 1; i <= 9; i++) { // ��ʾ��ֱ��������� 9��
			for (int j = 1; j <= i; j++) { // ��ʾÿһ�е����� 9��
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
			System.out.println("���");
		}
		System.out.print("��ӡ��ɣ�");
	}

	public static void tianjian() {
		if (x == 3) {
			System.out.print("�����ֵΪ��" + x);
		} else if (x == 0) {
			System.out.println("�����ֵΪ��" + x);
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
