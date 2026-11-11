package tangGiaHuy;

import java.time.LocalDate;

public class SinhVien {
	protected String maSV;
	protected String hoTen;
	protected LocalDate ngaySinh;
	protected String lop;
	protected int SotinChi;
	protected MonHoc monHoc;

	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public int getSotinChi() {
		return SotinChi;
	}
	public void setSotinChi(int sotinChi) {
		SotinChi = sotinChi;
	}
	public MonHoc getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}
	
	public SinhVien(String maSV, String hoTen, LocalDate ngaySinh, String lop, int sotinChi, MonHoc monHoc) {
		
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
		SotinChi = sotinChi;
		this.monHoc = monHoc;
	}
	public double thanhTien()
	{
		return SotinChi*monHoc.getDonGia();
	}
	public String getLoai() {
		return "Sinh Vien";
	}
	public String getThongTinRieng() {
		return "";
	}
	@Override
	public String toString() {
		return String.format("%s  %s   %s   %s    %s   %d x %0,.f     %,.0f", maSV, hoTen, lop,ngaySinh,
				monHoc.getTenMon(),SotinChi,monHoc.getDonGia(),thanhTien());
	}
	
	
}
