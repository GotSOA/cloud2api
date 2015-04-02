/**
 * 
 */
package com.sungardas.esb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.sungardas.esb.Customer;
import com.sungardas.esb.Product;
import com.sungardas.esb.CustomerContact;
import com.sungardas.esb.SgasContact;
import com.sungardas.esb.Order;
import com.sungardas.esb.BillingAccount;
import com.sungardas.esb.Usage;

/**
 * @author sri.vellala
 *
 */
public class CDR implements ApplicationContextAware, InitializingBean,
		DisposableBean {
	private Customer customer;
	private Product product;
	private CustomerContact contact;
	private Order order;
	private BillingAccount billingAccount;
	private SgasContact sgasContact;

	private ApplicationContext context = null;

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CustomerContact getContact() {
		return contact;
	}

	public void setContact(CustomerContact contact) {
		this.contact = contact;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public BillingAccount getBillingAccount() {
		return billingAccount;
	}

	public void setBillingAccount(BillingAccount billingAccount) {
		this.billingAccount = billingAccount;
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	@PostConstruct
	public void myInit() throws Exception {
		System.out.println("myInit init method called for CDR.");

	}

	@PreDestroy
	public void myCleanUp() throws Exception {
		System.out.println("myCleanUp destroy method called for CDR.");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

}
