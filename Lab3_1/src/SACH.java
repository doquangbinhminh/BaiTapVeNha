import java.util.Scanner;

public class SACH {
	private String ma , ten ,tg , loai , nxb;
	private int trang , tap , gia;


	public void NHAPSACH() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sách : ");
		ma = sc.nextLine();
		System.out.println("Nhập tên sách: ");
		ten = sc.nextLine();
		System.out.println("Nhập tên tác giả: ");
		tg = sc.nextLine();
		System.out.println("Nhập loại sách: ");
		loai = sc.nextLine();
		System.out.println("Nhập tên nxb: ");
		nxb = sc.nextLine();
		System.out.println("Nhập số trang: ");
		trang = sc.nextInt();
		System.out.println("Nhập tập: ");
		tap = sc.nextInt();
		System.out.println("Nhập giá: ");
		gia = sc.nextInt();
	}


	public void INSACH () {
		 System.out.println("SACH [ma=" + ma + ", ten=" + ten + ", tg=" + tg + ", loai=" + loai + ", nxb=" + nxb + ", trang=" + trang
				+ ", tap=" + tap + ", gia=" + gia + "]");
	}
	
}
