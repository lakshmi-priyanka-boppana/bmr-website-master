package io.bmrproject.startprojectstep1.primary;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// class deals with rest request
@RestController
public class primaryController {
	
	//default method for get
	@RequestMapping("/primary")
	public String sayHi() {
		return "HI";
	}

}
