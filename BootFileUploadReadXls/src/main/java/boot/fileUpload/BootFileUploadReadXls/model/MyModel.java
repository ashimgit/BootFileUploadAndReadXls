package boot.fileUpload.BootFileUploadReadXls.model;

import java.time.LocalDate;

public class MyModel {
	String kpsl_id;
	LocalDate entry_dt;

	public MyModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyModel(String kpsl_id, LocalDate entry_dt) {
		super();
		this.kpsl_id = kpsl_id;
		this.entry_dt = entry_dt;
	}

	public String getKpsl_id() {
		return kpsl_id;
	}

	public void setKpsl_id(String kpsl_id) {
		this.kpsl_id = kpsl_id;
	}

	public LocalDate getEntry_dt() {
		return entry_dt;
	}

	public void setEntry_dt(LocalDate entry_dt) {
		this.entry_dt = entry_dt;
	}

}
