package ng.bayue.panshe.controller;

import ng.bayue.panshe.common.ResultMessage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "test")
public class TestController extends BaseController{

	@RequestMapping(value = "list", method = {RequestMethod.POST})
	public ResultMessage list(){
		
		return ResultMessage.success();
	}
	
}
