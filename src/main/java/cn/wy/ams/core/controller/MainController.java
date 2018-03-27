package cn.wy.ams.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.wy.ams.core.service.TestService;

@Controller
public class MainController {
	@Autowired
    private TestService testService;
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
		//实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
        return "test";
    }
	
	@RequestMapping(value = "springtest", method = RequestMethod.GET)
    public String springTest(){
        return testService.test();
    }
	
	@RequestMapping(value = "savePerson", method = RequestMethod.GET)
    @ResponseBody
    public String savePerson(){
		testService.savePerson();
        return "success!";
    }
}
