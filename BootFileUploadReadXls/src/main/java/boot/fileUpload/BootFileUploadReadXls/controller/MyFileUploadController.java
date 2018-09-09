package boot.fileUpload.BootFileUploadReadXls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.fileUpload.BootFileUploadReadXls.dao.MyDao;

@RestController
public class MyFileUploadController {
	
	@Autowired
	MyDao dao;
	
	@RequestMapping(value="/hello")
	public String sayHello() {
		System.out.println("Hello There");
		String s1 = "{\\r\\n  \\\"queryType\\\" : \\\"topN\\\",\\r\\n  \\\"dataSource\\\" : \\\"wikipedia\\\",\\r\\n  \\\"intervals\\\" : [\\\"2015-09-12/2015-09-13\\\"],\\r\\n  \\\"granularity\\\" : \\\"all\\\",\\r\\n  \\\"dimension\\\" : \\\"page\\\",\\r\\n  \\\"metric\\\" : \\\"count\\\",\\r\\n  \\\"threshold\\\" : 10,\\r\\n  \\\"aggregations\\\" : [\\r\\n    {\\r\\n      \\\"type\\\" : \\\"count\\\",\\r\\n      \\\"name\\\" : \\\"count\\\"\\r\\n    }\\r\\n  ]\\r\\n}";

		System.out.println("Hi S1==> "+s1);
		
		String s2="Hello \\n \"There\"";
		System.out.println("s2= "+s2);
		
		dao.insertDb("2", null);
		
		return s1;
	}
}
