package Task_2;

import java.util.List;

public class SachThamKhao extends AnPham {
	private String linhVuc;
	private List<Chuong> danhSachChuong;

	public SachThamKhao(String tieuDe, int soTrang, int namXuatBan, String tacGia, int gia, String linhVuc,
			List<Chuong> danhSachChuong) {
		super(tieuDe, soTrang, namXuatBan, tacGia, gia);
		this.linhVuc = linhVuc;
		this.danhSachChuong = danhSachChuong;
	}

	public String loaiAnPham() {
		return "Sách tham khảo";
	}

	public int getChuongLonNhat() {
		int soChuongLonNhat = -1;
		for (Chuong chuongSach : danhSachChuong) {
			if (chuongSach.getSoTrang() > soChuongLonNhat) {
				soChuongLonNhat = chuongSach.getSoTrang();
			}
		}
		return soChuongLonNhat;
	}

	@Override
	public String toString() {
		return "SachThamKhao [linhVuc=" + linhVuc + ", dsChuong=" + danhSachChuong + "]";
	}

}
