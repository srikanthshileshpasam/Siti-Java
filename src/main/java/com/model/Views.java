package com.model;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

public class Views {
	public ModelAndView view;
	public ModelAndView getView() {
		return view;
	}
	public void setView(ModelAndView view) {
		this.view = view;
	}
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public String viewName;
	
}
