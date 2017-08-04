package br.com.beblue.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.beblue.StackBeblue;

public class BeblueTest {

	@BeforeClass
	public static void runOnceBeforeClass() {
		System.out.println("@BeforeClass - runOnceBeforeClass");
	}

	@Before
	public void push() {
		System.out.println("@Before - runBeforeTestMethod");

		StackBeblue.push(2147483647);
		StackBeblue.push(-2147483647);
		StackBeblue.push(100);
		StackBeblue.push(80);
		StackBeblue.push(2090);
		StackBeblue.push(10);
		StackBeblue.push(-10);
		StackBeblue.push(555);
		StackBeblue.push(444);
		StackBeblue.push(2342);
		StackBeblue.push(8080);
	}

	@Test
	public void removeElementTop() {
		StackBeblue.pop();
	}

	@Test
	public void removeObject() {
		// espera um retorno false
		Assert.assertTrue(!StackBeblue.removeObject(-8888));

		// espera um retorno true
		Assert.assertTrue(StackBeblue.removeObject(-2147483647));
	}

	@Test
	public void minimumValue() {

		// espera um retorno true
		Assert.assertTrue(StackBeblue.min() == -2147483647);
	}

	@After
	public void runAfterTestMethod() {
		System.out.println("@After - runAfterTestMethod");

		StackBeblue.removeObject(100);
		StackBeblue.removeObject(80);
		StackBeblue.removeObject(2090);
		StackBeblue.removeObject(10);
		StackBeblue.removeObject(-10);
		StackBeblue.removeObject(555);
		StackBeblue.removeObject(444);
		StackBeblue.removeObject(2342);
		StackBeblue.removeObject(8080);
	}

	@AfterClass
	public static void runOnceAfterClass() {
		System.out.println("@AfterClass - runOnceAfterClass");
	}
}
