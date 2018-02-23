package com.spmvc.java;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spmvc.models.Adress;
import com.spmvc.models.Employee;
import com.spmvc.services.AdressService;
import com.spmvc.services.EmployeeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	EmployeeService service;
	
	@Autowired
	AdressService adrService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		List<Employee> employees=service.findAll();
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("employees", employees);	
		System.out.println(model);
		return "home";
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		Employee em=new Employee();
		System.out.println("this is an employee instance "+em);
    	return mav;
	}
	
	@RequestMapping(value="/employees/add",method=RequestMethod.GET)
	public String empForm(Model model) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("employees/add");
		model.addAttribute("adresses", adrService.findAll());
		return "employees/add";
	}
	@RequestMapping(value="/employees/index",method=RequestMethod.POST)
	public String empIndex(
			@RequestParam("name") String name, 
			@RequestParam("adress")Long adress,
			Model model) {
		Employee em=new Employee();
		em.setName(name);
		em.setAdress(adress);
		//service.save(em);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("employees/add");
		model.addAttribute("adresses", adrService.findAll());
		return "employees/add";
	}
	
	@RequestMapping("/adresses/add")
	public ModelAndView adrForm() {
		return new ModelAndView("adresses/add","adress", new Adress());
	}
	
	@RequestMapping(value="/adresses/index")
	public String adrIndex(@ModelAttribute("adress")Adress adress,BindingResult result,ModelMap model) {
		System.out.println(adress.getTown());
		if(result.hasErrors()) {
			for(ObjectError error:result.getAllErrors()) {
				System.out.println(error.getCode()+" "+error.getDefaultMessage());
			}
			System.out.println(result.getErrorCount());
			return "adresses/add";
		}
		return "adresses/index";
	}
	

}
