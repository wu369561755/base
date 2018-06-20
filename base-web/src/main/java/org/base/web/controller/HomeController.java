package org.base.web.controller;

import javax.annotation.Resource;

import org.base.persistence.user.domain.UserDO;
import org.base.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
	@Resource
	private UserService userService;

	@RequestMapping(value="/login/{userId}",method = RequestMethod.GET)
	public String login(@PathVariable Long userId, Model model){
		//System.out.println("==========================================");
		LOGGER.info("userId:"+userId);
		UserDO user = userService.getUser(userId);
//		System.out.println("user:"+user);
		LOGGER.info("user:"+user);
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping(value="/add/{name}",method = RequestMethod.GET)
	@ResponseBody
	public String add(@PathVariable String name){
		try {
			LOGGER.info("==============name:"+name);
			UserDO userDO = new UserDO();
			userDO.setName(name);
			userService.insert(userDO);;
			return "操作成功！";
		} catch (Exception e) {
			LOGGER.error("新增出错", e);
			return "操作失败";
		}
	}
	
	@RequestMapping(value="/update/{id}/{name}",method = RequestMethod.GET)
	@ResponseBody
	public String update(@PathVariable Long id,@PathVariable String name){
		LOGGER.info("==============name:"+name+",id:"+id);
		UserDO user = userService.getUser(id);
		if (null == user) {
			return "用户不存在";
		}
		userService.update(id,name);
		return "操作成功！";
	}
}
