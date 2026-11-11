package tangGiaHuy;

public enum MonHoc {
	Lap_trinh_JAVA("lap trinh java",450_000f),
	CSDL("CSDL",450_000f),
	TOAN_RR("toan roi rac",400_000f);
	

	private final String tenMon;
	private final float donGia;
	
	MonHoc(String tenMon,float donGia){
		this.tenMon=tenMon;
		this.donGia=donGia;
	}

	public String getTenMon() {
		return tenMon;
	}

	public float getDonGia() {
		return donGia;
	}
	
	public static MonHoc fromTenMon(String tenMon) {
		for(MonHoc mh: values())
			if(mh.tenMon.equalsIgnoreCase(tenMon)) return mh;
		return null;
	}
	@Override
	public String toString() {
		return String.format("%s   (%,.0f VND/tin chi)", tenMon,donGia);
	}
	
	
}
