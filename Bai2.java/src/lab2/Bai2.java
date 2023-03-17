package lab2;

import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner nhaptubanphim= new  Scanner(System.in);
		System.out.println("Nhap vao 1 so nguyen: ");
		int s1 = nhaptubanphim.nextInt();
		if(s1 % 2 == 0) {
			System.out.println("Day la so nguyen chan! ");
		} else {
			System.out.println("Day la so nguyen le! ");

		}
	}

}