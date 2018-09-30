package com.hyc.ssh.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jbpm.api.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hyc.ssh.user.entity.User;
import com.hyc.ssh.user.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;

	@RequestMapping("new")
	public ModelAndView _new(ModelMap model ,HttpServletRequest request,HttpServletResponse response) {
		User user = new User();
		model.put("entity", user);
		return  new ModelAndView("user/form", model);
	}
	@RequestMapping("create")
//	@ResponseBody
	public String create(User entity ,HttpServletRequest request,HttpServletResponse response) {
		userService.create(entity);
		return "redirect:/user/list.html";
	}
	
	@RequestMapping("list")
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response) {
		System.out.println(taskService.findPersonalTasks("a").size());
		List<User> list = userService.list();
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("userList",  list);
		return new ModelAndView("user/list", model);
	}
	
	@RequestMapping("delete")
	public String delete(User entity ,HttpServletRequest request,HttpServletResponse response) {
		userService.delete(entity);
		return "redirect:/user/list.html";
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(ModelMap model ,User entity ,HttpServletRequest request,HttpServletResponse response) {
		User user = userService.get(entity.getId());
		model.put("entity", user);
		return  new ModelAndView("user/form", model);
	}
	
	@RequestMapping("update")
	public String update(User entity ,HttpServletRequest request,HttpServletResponse response) {
		userService.create(entity);
		return "redirect:/user/list.html";
	}
}
