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
		String s1 = "{\\r\\n  \\\"queryType\\\" : \\\"topN\\\",\\r\\n  \\\"dataSource\\\" : \\\"wikipedia\\\",\\r\\n  \\\"intervals\\\" : [\\\"2015-09-12/2015-09-13\\\"],\\r\\n  \\\"granularity\\\" : \\\"all\\\",\\r\\n  \\\"dimension\\\" : \\\"page\\\",\\r\\n  \\\"metric\\\" : \\\"count\\\",\\r\\n  \\\"threshold\\\" : 10,\\r\\n  \\\"aggregations\\\" : [\\r\\n    {\\r\\n      \\\"type\\\" : \\\"count\\\",\\r\\n      \\\"name\\\" : \\\"count\\\"\\r\\n    }\\r\\n  ]\\r\\n}";

		System.out.println("Hi S1==> "+s1);
		
		String s2="Hello \\n \"There\"";
		System.out.println("s2= "+s2);
	}
}
