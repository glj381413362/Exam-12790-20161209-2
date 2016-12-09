package com;

import java.util.Scanner;

/**
 * Title: App.java Description: �������˰��
 * 
 * @author ������
 * @created Dec 9, 2016 7:50:41 PM
 */
public class App {
	public static void main(String[] args) {
		System.out.print(" �����빤��:");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(getResult(Integer.parseInt(string)));
	}

	public static int getResult(int money) {
		int res = 0;
		if (money<=1500) {
			res+=getOne(money);
		}
		if (money>1500&&money<=4500) {
			res+=getTwo(money);
		}
		if (money>4500&&money<=9000) {
			res+=getThree(money);
		}
		if (money>9000&&money<=35000) {
			res+=getFour(money);
		}
		if (money>35000&&money<=55000) {
			res+=getFive(money);
		}
		if (money>55000&&money<=80000) {
			res+=getSix(money);
		}
		if (money>80000) {
			res+=getSeven(money);
		}
		return res;
	}

	/**
	 * @discription ����С��1500
	 * @author ������
	 * @created Dec 9, 2016 7:58:37 PM
	 * @param i
	 * @return
	 */
	public static int getOne(int i) {
		return (int) (i * 0.03);
	}

	/**
	 * @discription ������1500-4500
	 * @author ������
	 * @created Dec 9, 2016 7:59:44 PM
	 * @param i
	 * @return
	 */
	public static int getTwo(int i) {
		return (int) ((i - 1500) * 0.1);
	}

	/**
	 * @discription ������4500-9000
	 * @author ������
	 * @created Dec 9, 2016 7:59:44 PM
	 * @param i
	 * @return
	 */
	public static int getThree(int i) {
		return (int) ((i - 4500) * 0.2);
	}

	/**
	 * @discription ������9000-35000
	 * @author ������
	 * @created Dec 9, 2016 8:02:40 PM
	 * @param i
	 * @return
	 */
	public static int getFour(int i) {
		return (int) ((i - 9000) * 0.25);
	}


	/**
	 * @discription ������35000-55000
	 * @author ������
	 * @created Dec 9, 2016 8:02:40 PM
	 * @param i
	 * @return
	 */
	public static int getFive(int i) {
		return (int) ((i - 35000) * 0.3);
	}

	/**
	 * @discription ������55000-80000
	 * @author ������
	 * @created Dec 9, 2016 8:02:40 PM
	 * @param i
	 * @return
	 */
	public static int getSix(int i) {
		return (int) ((i - 55000) * 0.35);
	}
	/**
	 * @discription ������80000����
	 * @author ������
	 * @created Dec 9, 2016 8:02:40 PM
	 * @param i
	 * @return
	 */
	public static int getSeven(int i) {
		return (int) ((i - 80000) * 0.45);
	}

}
