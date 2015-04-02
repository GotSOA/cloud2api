package com.sungardas.esb;

import com.sungardas.esb.Address;
import com.sungardas.esb.Order;
import com.sungardas.esb.CustomerContact;
import com.sungardas.esb.SgasContact;
import com.sungardas.esb.BillingAccount;

public class Customer {
	
	private long sgid;
	private long parentId;
	private String companyName;
	private String companyDomain;
	private Address address;
	private CustomerContact[] customerContact;
	private SgasContact[] sgasContact;
	private BillingAccount[] billingAccount;
	private Order[] order;
	private String customerType;
	
	// constructors
    public Customer() {
    }

    public Customer(String companyName, String companyDomain, String lastName, String firstName, String phoneNumber) {
        this.companyName = companyName;
        this.companyDomain = companyDomain;
        this.customerType = "EXISTING_CUSTOMER";
    }

	public long getSgid() {
		return sgid;
	}

	public void setSgid(long sgid) {
		this.sgid = sgid;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDomain() {
		return companyDomain;
	}

	public void setCompanyDomain(String companyDomain) {
		this.companyDomain = companyDomain;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public CustomerContact[] getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(CustomerContact[] customerContact) {
		this.customerContact = customerContact;
	}

	public SgasContact[] getSgasContact() {
		return sgasContact;
	}

	public void setSgasContact(SgasContact[] sgasContact) {
		this.sgasContact = sgasContact;
	}

	public BillingAccount[] getBillingAccount() {
		return billingAccount;
	}

	public void setBillingAccount(BillingAccount[] billingAccount) {
		this.billingAccount = billingAccount;
	}

	public Order[] getOrder() {
		return order;
	}

	public void setOrder(Order[] order) {
		this.order = order;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	
}
