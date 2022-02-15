package de.telekom.sea7.impl;

import java.util.List;

import org.springframework.stereotype.Controller;

@Controller
public interface BaseObject {

	int getId();

	Object getParent();
	
	List<String> getValues();

	List<String> getPropertyNames();
}