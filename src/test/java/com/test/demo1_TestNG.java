package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class demo1_TestNG {
  @Test(priority=1)
  public void f(){
	  System.out.println("This is first Annotation");
  }
  @Test(priority=2) 
  public void a() {
	  System.out.println("This is second Annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method test Annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method test Annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is befor class test Annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class test Annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is  befor test Annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test Annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite test Annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite Annotation");
  }

}
