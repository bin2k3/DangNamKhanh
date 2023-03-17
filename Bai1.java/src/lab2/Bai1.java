package lab2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method s	tub
		 Scanner nhaptubanphim = new  Scanner(System.in);
		 DecimalFormat decimalFormat = new DecimalFormat("#.##");
					System.out.println("Nhap vao so thu 1:  ");
	int s1 = nhaptubanphim.nextInt();
	System.out.println("Nhap vao so thu 2:  ");
	int s2 = nhaptubanphim.nextInt();
	int tong = s1 + s2;
	System.out.println("Tong cua 2 so vua nhap la: " + tong);
	int hieu = s1 - s2;
	System.out.println("Hieu cua 2 so vua nhap la: " + hieu);
	int tich = s1 * s2;
	System.out.println(" Tich cua 2 so vua nhap la: " + tich);  
    float thuong = (float) s1 / s2;
    System.out.println("Thuong cua 2 so vua nhap la: " + 
            decimalFormat.format(thuong));  
	int du = s1 % s2;
	System.out.println("Chia du cua 2 so vua nhap la: " + du);
	if(s1 == s2) {
		System.out.println("so sanh s1 va s2 thi s1 = s2");
	}
	else if(s1 > s2) {
		System.out.println("so sanh s1 va s2 thi s1 > s2");

	} else if(s1 < s2) {
		System.out.println("so sanh s1 va s2 thi s1  < s2");
	}
	
	}
}