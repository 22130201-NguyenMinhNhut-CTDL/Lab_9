package Task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		List<AnPham> a1 = new ArrayList<>();
		
		List<Chuong> a = new ArrayList<>();
		a.add(new Chuong("Cây cam ngọt của tôi", 184));
		a.add(new Chuong("Tiếng anh cho người bắt đầu", 365));
		
		TapChi t1 = new TapChi("Kỹ năng sống", 50, 2023, "Hae Min", 30, "Hoàng tử bé");
		TapChi t2 = new TapChi("Kỷ luật tự giác", 53, 1990, "Trọng Phụng", 30, "Tết ở làng");
		TapChi t3 = new TapChi("Như sao trời", 90, 2006, "Nhã Nam", 30, "Bắc âu");
		a1.add(t1);
		a1.add(t2);
		a1.add(t3);
		
		
		SachThamKhao s1 = new SachThamKhao("Sự im lặng của bầy cừu", 389, 2019, "Nhã Nam", 250, "tiểu thuyết", a);
		SachThamKhao s2 = new SachThamKhao("Ghi chép pháp y", 100, 2023, "Liêu Tiểu Đao", 65, "trinh thám", a);
		SachThamKhao s3 = new SachThamKhao("Người trong muôn nghề", 60, 2010, "Tiểu Dã", 90, "nghệ thuật", a);
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
// Phương thức kiểm tra loại của ấn phẩm
		String loaiAnPham1 = s1.loaiAnPham();
		String loaiAnPham2 = t1.loaiAnPham();
		System.out.println("Loại ấn phẩm: " + loaiAnPham1);
		System.out.println("Loại ấn phẩm: " + loaiAnPham2);
		
// Phương thức kiểm tra ấn phẩm là tạp chí và có thời gian xuất bản cách đây 10 năm
		boolean b1 = t2.kiemTraXuatBanVaTapChi();
		boolean b2 = s3.kiemTraXuatBanVaTapChi();
		System.out.println("Là tạp chí xuất bản cách đây 10 năm: " + b2);
		System.out.println("Là tạp chí xuất bản cách đây 10 năm: " + b1);
		

// Phương thức kiểm tra 2 ấn phẩm có cùng loại và cùng tác giả không
		boolean cungLoaiVaTacGia = t1.kiemTraCungLoaiCungTacGia(t2);
		boolean cungLoaiVaTacGia2 = s1.kiemTraCungLoaiCungTacGia(s3);
		System.out.println("Ấn phẩm có cùng loại và tác giả: " + cungLoaiVaTacGia);
		System.out.println("Ấn phẩm có cùng loại và tác giả: " + cungLoaiVaTacGia2);
		

// Phương thức tính tổng tiền của các ấn phẩm trong nhà sách
		DanhMucAnPham apham = new DanhMucAnPham(a1);
		int tongTien = apham.tongTien();
		System.out.println("Tổng tiền ấn phẩm trong nhà sách: "+ tongTien);

// Phương thức tìm sách tham khảo có chương nhiều trang nhất
		SachThamKhao soTrangLonNhat = apham.getNhieuTrangNhat();
		System.out.println("Quyển có chuwonng nhiều trang nhất:" + soTrangLonNhat);
		
// Phưong thức tìm trong danh sách ấn phẩm có chứa tạp chí nào có tên cho trước hay không	
		boolean coTenChoTruoc = apham.tapChi("Tuoi hoc tro");
		boolean coTenChoTruoc1 = apham.tapChi("Da bong so 1");
		System.out.println("Ấn phẩm có chứa tạp chí có tên cho trước: "+ coTenChoTruoc);
		System.out.println("Ấn phẩm có chứa tạp chí có tên cho trước: "+ coTenChoTruoc1);

// Phương thức lấy ra danh sách các tạp chí xuất bản từ 1 năm trước
		int namChoTruoc = 2014;
		List<AnPham> tapChi = apham.xuatBan1NamTrc(namChoTruoc);
		System.out.println("Danh sách tạp chí xuất bản từ 1 năm trước: " + Arrays.toString(tapChi.toArray()));
		

// Phương thức sắp xếp ấn phẩm tăng dần theo tiêu đề và giảm dần theo năm xuất bản
		Collections.sort(a1);
		System.out.println("Danh sách các ấn phẩm được sắp xếp: " + Arrays.toString(a1.toArray()));

// Phương thức thống kê số lượng ấn phẩm theo năm xuất bản
		System.out.println("Thống kê ấn phẩm theo năm:");
		Map<Integer, Integer> thongKe = apham.anPhamTheoNam();
		
		
	}

}

