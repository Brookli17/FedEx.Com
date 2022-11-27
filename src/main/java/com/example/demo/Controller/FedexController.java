package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.Fedex;
import com.example.demo.Service.FedexServices;

@Controller
public class FedexController {
	
	@Autowired
	private FedexServices fedexservices;
	
	@RequestMapping("/")
	public String Index(Model model) {
		model.addAttribute("Customerlist" , this.fedexservices.getAllCustoemr());
		return "index.html";
	}
	
	@GetMapping("/addCustomer")
	public String addCustomer(Model model) {
		Fedex newCustomer = new Fedex();
		model.addAttribute("newCustomer", newCustomer);
		return "addCustomer.html";
		
	}
	
	@PostMapping("/addCustomer")
	public String addNewCustomerNow(@ModelAttribute Fedex newCustomer) {
		this.fedexservices.addCustomer(newCustomer);
		return "redirect:";
		
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam Integer CustomerId) {
		this.fedexservices.deleteCustomer(CustomerId);
		return "redirect:";
		
	}
	
	@GetMapping("/updateCustomer/{CustomerId}")
	public String updateCustomer(@PathVariable Integer CustomerId , Model model) {
		Fedex FoundCustomer = this.fedexservices.getCustomerById(CustomerId);
		model.addAttribute("FoundCustomer", FoundCustomer);
		return "updateCustomer.html";
	
	}
	
	@PostMapping("/updateCustomer/{CustomerId}")
	public String updateCustomer(@PathVariable  Integer CustomerId, @ModelAttribute Fedex updateCustomer) {
		this.fedexservices.updateCustomer(CustomerId, updateCustomer);
		return "redirect:/";
		
	}

}



