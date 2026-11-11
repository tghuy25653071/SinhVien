package tangGiaHuy;

import java.time.LocalDate;

public class SVtuxa extends SinhVien{
	private String nenTang;
	public SVtuxa(String maSV, String hoTen, LocalDate ngaySinh, String lop, int sotinChi,MonHoc monHoc,String nenTang) {
		super(maSV, hoTen, ngaySinh, lop, sotinChi, monHoc);
		this.nenTang=nenTang;
	}
	
	public String getNenTang() {
		return nenTang;
	}

	public void setNenTang(String nenTang) {
		this.nenTang = nenTang;
	}
	public String getLoai() {
		return "online";
	}
	
	public String getThongTinRieng() {
		return nenTang;
	}
	@Override
	public double thanhTien() {
		return super.thanhTien()*0.9;
	}

	@Override
	public String toString() {
		return super.toString() + getThongTinRieng();
	}
	
}
