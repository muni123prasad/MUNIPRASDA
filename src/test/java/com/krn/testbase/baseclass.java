package com.krn.testbase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class baseclass {
  @BeforeClass
  public void openbrowser () {
	  System.out.println("openbrowser");
  }
  @AfterClass
  public void closebrowser () {
	  System.out.println("closebrowser");
  }
}
