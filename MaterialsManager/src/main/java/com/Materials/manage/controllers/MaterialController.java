package com.Materials.manage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Materials.manage.model.Material;

@Controller
public class MaterialController {

	@RequestMapping(value="/create")
	public String showCreate() {
		System.out.println("method Called");
		return "cmaterial";
	}
	@RequestMapping("/saved")
	public String saveMaterial(@ModelAttribute("material")Material mat) {
		return "cmaterial";
	}
}
