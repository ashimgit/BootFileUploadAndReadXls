package boot.fileUpload.BootFileUploadReadXls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "boot.fileUpload.BootFileUploadReadXls" })
public class BootFileUploadReadXlsApplication {

	public static void main(String[] args) {
		System.out.println("Started . . . .");

		SpringApplication.run(BootFileUploadReadXlsApplication.class, args);

		System.out.println("Ended . . . .");
	}
}
