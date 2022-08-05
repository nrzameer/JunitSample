package com.test.junitsample;

import org.junit.Assert;
import org.junit.Test;

//import static org.junit.Assert.assertEquals;


public class TestCase {
	@Test
	   public void testAdd() {
	      String str = "Junit is working fine";
	      Assert.assertEquals(str, "te");
	   }
	
	@Test
	public void testSecond() {
		String txt = "Testing";
		Assert.assertEquals(txt, "Testing");
	}
}
