package com.capg.paymentwallet.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capg.paymentwallet.bean.AccountBean;
import com.capg.paymentwallet.bean.CustomerBean;
import com.capg.paymentwallet.exception.CustomerException;
import com.capg.paymentwallet.service.AccountServiceImpl;
import com.capg.paymentwallet.service.IAccountService;

public class AccountServiceImplTest {

	private static IAccountService service = null;
@BeforeClass	
public static void createInstance() {
	service = new AccountServiceImpl();
}
@Test(expected = CustomerException.class)
public void testEidForFirstNameLengtghNegative() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName("pu");
	bean.setLastName("radha");
	bean.setEmailId("puja19@gmail.com");
	bean.setPhoneNo("6302088199");
	bean.setPanNum("HDDSFH1234");
	bean.setAddress("CHENNAI");
	AccountBean accountBean = new AccountBean();
	accountBean.setAccountId(101);
	accountBean.setBalance(5000);
	accountBean.setDateOfOpening(new Date());
	accountBean.setInitialDeposit(1000);
	accountBean.setCustomerBean(bean);
	//boolean isValid = service.validations(accountBean);
	boolean result=service.createAccount(accountBean);
	assertFalse(result);
	
}
@Test(expected = CustomerException.class)
public void testEidForFirstNameNotNullNegative() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName(" ");
	bean.setLastName("radha");
	bean.setEmailId("puja19@gmail.com");
	bean.setPhoneNo("6302088199");
	bean.setPanNum("HDDSFH1234");
	bean.setAddress("CHENNAI");
	AccountBean accountBean = new AccountBean();
	accountBean.setAccountId(101);
	accountBean.setBalance(5000);
	accountBean.setDateOfOpening(new Date());
	accountBean.setInitialDeposit(1000);
	accountBean.setCustomerBean(bean);
	boolean isValid = service.validations(accountBean);
	boolean result=service.createAccount(accountBean);
	assertFalse(result);
	
}
@Test
public void testEidForFirstNamePositive() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName("puja");
	bean.setLastName("radha");
	bean.setEmailId("puja19@gmail.com");
	bean.setPhoneNo("6302088199");
	bean.setPanNum("HDDSFH1234");
	bean.setAddress("CHENNAI");
	AccountBean accountBean = new AccountBean();
	accountBean.setAccountId(101);
	accountBean.setBalance(5000);
	accountBean.setDateOfOpening(new Date());
	accountBean.setInitialDeposit(1000);
	accountBean.setCustomerBean(bean);
	//boolean isValid = service.validations(accountBean);
	boolean result=service.createAccount(accountBean);
	assertTrue(result);
}
}