package testservice.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 10:02 18/6/11.
 * @modify by:
 */
@RestController
public class TestController2 {
	private final Logger logger = Logger.getLogger(getClass());

	@RequestMapping(value = "/testController2", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
	public String testController2(){
		logger.info("===call testController2===");
		return "TestService2";
	}
}
