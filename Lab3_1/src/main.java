
import java.util.Iterator;
import java.util.Scanner;

public class main {
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n;
			System.out.println("Nhập só lượng sách: ");
			n = scn.nextInt();
			SACH sach[] = new SACH[n];
			for(int i=0; i<n ; i++) {
				    System.out.println("Nhập cuốn sách thứ : "+(i+1));
					sach[i] = new SACH();
					sach[i].NHAPSACH();
			}
			for(int i=0; i<n ; i++) {
			    System.out.println("Thông tin cuốn sách thứ : "+(i+1));
				sach[i].INSACH();;
		    }
		}
	}
