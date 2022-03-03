package de.telekom.sea7.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class IbanBean implements ApplicationContextAware {

	@Autowired
	private Iban iban;

	private Iban ibanEnd;

	private ApplicationContext applicationContext;

	public IbanBean() {
		System.out.println(iban);
	}

	@PostConstruct
	public void init() {
		System.out.println("#### IbanBean startet ####");
		System.out.println(iban);
	}

	@PreDestroy
	public void destroy() {
		System.out.println("#### IbanBean endet ####");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		ibanEnd = (Iban) applicationContext.getBean("Iban");
	}
}
