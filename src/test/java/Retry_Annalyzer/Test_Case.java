package Retry_Annalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case {

	@Test
	void test1()
	{
		Assert.assertEquals(10, 10);
	}
	@Test
	void test2()
	{
		Assert.assertEquals(1, 10);
	}
	@Test
	void test3()
	{
		Assert.assertEquals(10, 37);
	}
	@Test
	void test4()
	{
		Assert.assertEquals(10, 10);
	}
	@Test
	void test5()
	{
		Assert.assertEquals(87, 69);
	}
	@Test
	void test6()
	{
		Assert.assertEquals(66, 1);
	}
	@Test
	void test7()
	{
		Assert.assertEquals(10, 10);
	}
	@Test
	void test8()
	{
		Assert.assertEquals(31, 10);
	}
	@Test
	void test9()
	{
		Assert.assertEquals(10, 10);
	}
	@Test
	void test10()
	{
		Assert.assertEquals(90, 80);
	}
	
}
