package tangGiaHuy;

import java.time.LocalDate;

public class SVchinhquy extends SinhVien {
	private String hocTrucTiep;
	public SVchinhquy(String maSV, String hoTen, LocalDate ngaySinh, String lop,
			int sotinChi,MonHoc monHoc, String hocTrucTiep) {
		super(maSV, hoTen, ngaySinh, lop, sotinChi, monHoc);
		this.hocTrucTiep=hocTrucTiep;
	}
	
	 public String getHocTrucTiep() {
		return hocTrucTiep;
	}

	public void setHocTrucTiep(String hocTrucTiep) {
		this.hocTrucTiep = hocTrucTiep;
	}
	@Override
	public String getLoai(){
		return "chinh quy";
	}
	
	@Override
	public String getThongTinRieng() {
		return "Hoctructiep" + hocTrucTiep;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+getThongTinRieng();
	}


}
