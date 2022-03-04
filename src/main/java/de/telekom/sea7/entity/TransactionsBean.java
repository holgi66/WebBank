package de.telekom.sea7.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import de.telekom.sea7.repository.TransactionsRepository;


@Component
public class TransactionsBean implements ApplicationContextAware {

	@Autowired
	private TransactionsRepository transactionsRepository;
	public TransactionsBean() {
		System.out.println(transactionsRepository);
	}

	@PostConstruct
	public void init() {
		System.out.println("#### TransactionsBean startet ####");
		System.out.println(transactionsRepository);
	}

	@PreDestroy
	public void destroy() {
		System.out.println("#### TransactionsBean endet ####");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		applicationContext.getBean("TransactionRepository");
	}
}
