package Task_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DanhMucAnPham {
	List<AnPham> danhSachAnPham;

	
	public DanhMucAnPham(List<AnPham> danhSachAnPham) {
		this.danhSachAnPham = danhSachAnPham;
	}
	public int tongTien() {
		int tongTien = 0;
		for(AnPham anPham : danhSachAnPham) {
			tongTien += anPham.getGia();
		}
		return tongTien;
	}
	
	public SachThamKhao getNhieuTrangNhat () {
		SachThamKhao nhieuTrangNhat = null;
		int maxSoTrang = -1;
		
		for(AnPham apham : danhSachAnPham) {
			if(apham instanceof SachThamKhao) {
				SachThamKhao sach = (SachThamKhao) apham;
				int soChuongTrangLonNhat = sach.getChuongLonNhat();
				
				if(soChuongTrangLonNhat > maxSoTrang) {
					maxSoTrang = soChuongTrangLonNhat;
					nhieuTrangNhat = sach;
				}
			}
		}
		return nhieuTrangNhat;
		
	}
	public boolean tapChi(String tenTapChi) {
		for (AnPham apham: danhSachAnPham) {
			if(apham instanceof TapChi) {
				TapChi tapChi = (TapChi) apham;
				if(tapChi.getTen().equals(tenTapChi)) {
					return true;
				}
			}
		}
		return false;
	}
	public List<AnPham> xuatBan1NamTrc(int nam){
		List<AnPham> result = new ArrayList<>();
		if(danhSachAnPham != null) {
			for(AnPham apham : danhSachAnPham) {
				if( apham instanceof TapChi) {
					TapChi tapChi = (TapChi) apham;
					if(tapChi.getNamXuatBan() == nam) {
						result.add(tapChi);
					}
				}
			}
		}
		return result;
		
	}
	public Map<Integer, Integer> anPhamTheoNam() {
		Map<Integer, Integer> thongKe = new HashMap<>();
		for(AnPham apham : danhSachAnPham) {
			int namXuatBan = apham.getNamXuatBan();
			thongKe.put(namXuatBan, thongKe.getOrDefault(namXuatBan, 0) +1);
			
		}
		for( Map.Entry<Integer, Integer> entry : thongKe.entrySet()) {
			System.out.println("NÄƒm" +entry.getKey()+": " + entry.getValue()+ " áº¥n pháº©m");
		}
		return thongKe;
	}
	@Override
	public String toString() {
		return "DanhMucAnPham [dsAnPham=" + danhSachAnPham + "]";
	}
	

}