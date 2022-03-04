package de.telekom.sea7.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import de.telekom.sea7.services.TransactionService;

@Component
public class TransactionBean implements ApplicationContextAware {

	@Autowired
	private TransactionService transactionService;

	private TransactionService transactionServiceEnd;

	private ApplicationContext applicationContext;

	public TransactionBean() {
		System.out.println(transactionService);
	}

	@PostConstruct
	public void init() {
		System.out.println("#### TransactionBean startet ####");
		System.out.println(transactionService);
	}

	@PreDestroy
	public void destroy() {
		System.out.println("#### TransactionBean endet ####");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		transactionServiceEnd = (TransactionService) applicationContext.getBean("TransactionService");
	}
}
