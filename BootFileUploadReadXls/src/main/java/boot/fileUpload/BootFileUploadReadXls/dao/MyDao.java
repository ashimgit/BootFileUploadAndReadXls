package boot.fileUpload.BootFileUploadReadXls.dao;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	@Autowired
	JdbcTemplate jdbcTmplate;
	
	public String insertDb(String kpsl_id,LocalDate entry_dt) {
		jdbcTmplate.update("INSERT INTO test.KPSL_UPLOAD(kpsl_id,entry_dt) VALUES (?,?)",new Object[] {new String(kpsl_id),entry_dt} );
		
		return "success";
	}

}
