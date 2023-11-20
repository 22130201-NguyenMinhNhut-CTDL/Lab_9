package Task_2;

public class Chuong {
	private String tieuDe;
	private int soTrang;

	public Chuong(String tieuDe, int soTrang) {
		this.tieuDe = tieuDe;
		this.soTrang = soTrang;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public String toString() {
		return "ChuongSach [tieuDe=" + tieuDe + ", soTrang=" + soTrang + "]";
	}

}
