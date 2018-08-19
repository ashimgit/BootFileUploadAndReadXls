package boot.fileUpload.BootFileUploadReadXls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFileUploadController {
	@RequestMapping(value="/hello")
	public String sayHello() {
		System.out.println("Hello There");
		return "Hello There";
	}
}
