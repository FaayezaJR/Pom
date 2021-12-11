package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	private Home_Page hp;
	private Login_Page lp;
	private T_Shirts T;	
	private Tshirt_Img Ti;
	private Frame f;
	private Add_Cart A;
	private Checkout pc;
	private Checkout_1 pc1 ;
	private Checkout_2 pc2;
	private Checkout_3 pc3;
	private Checkout_4 pc4;
	private Checkout_5 pc5;
	private Checkout_11 pc11;

	
public Page_Object_Manager (WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

public Home_Page getInstanceHp() {
	if(hp==null) {
		hp=new Home_Page(driver);

	}
	return hp;
}


public Login_Page getInstanceLp() {
	if(lp==null) {
		lp=new Login_Page(driver);

	}
	return lp;
}

public T_Shirts getInstanceT() {
	if(T==null) {
		T=new T_Shirts(driver);

	}
	return T;
}
public Tshirt_Img getInstanceTi() {
	if(Ti==null) {
		Ti=new Tshirt_Img(driver);

	}
	return Ti;
}

public Frame getInstancef() {
	if(f==null) {
		f=new Frame(driver);

	}
	return f;
}

public Add_Cart getInstanceA() {
	if(A==null) {
		A=new Add_Cart(driver);

	}
	return A;
}

public Checkout getInstancepc() {
	if(pc==null) {
		pc=new Checkout(driver);

	}
	return pc;
}

public Checkout_1 getInstancepc1() {
	if(pc1==null) {
		pc1=new Checkout_1(driver);

	}
	return pc1;
}

public Checkout_2 getInstancepc2() {
	if(pc2==null) {
		pc2=new Checkout_2(driver);

	}
	return pc2;
}

public Checkout_3 getInstancepc3() {
	if(pc3==null) {
		pc3=new Checkout_3(driver);

	}
	return pc3;
}
public Checkout_4 getInstancepc4() {
	if(pc4==null) {
		pc4=new Checkout_4(driver);

	}
	return pc4;
}

public Checkout_5 getInstancepc5() {
	if(pc5==null) {
		pc5=new Checkout_5(driver);

	}
	return pc5;
}

public Checkout_11 getInstancepc11() {
	if(pc11==null) {
		pc11=new Checkout_11(driver);

	}
	return pc11;
}
}
