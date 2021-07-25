package ca.kpu.info3235.teamproject;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ca.kpu.info3235.lab2.shoppingCart;

@RunWith(Parameterized.class)
@Category(GroupTest2.class)
public class pgMenuTest {

	private boolean input1;
	private boolean input2;
	private boolean input3;
	private boolean input4;
	private boolean input5;

	@Parameters
	public static Collection getParameters2() {
		return Arrays.asList(new Object[][] {
			{true, false, false, false, false},
			{false, true, false, false, false},
			{false, false, true, false, false},
			{false, false, false, true, false},
			{false, false, false, false, true}
		});
	}

	public pgMenuTest (boolean input1, boolean input2, boolean input3, boolean input4, boolean input5) {
		this.input1 = input1;
		this.input2 = input2;
		this.input3 = input3;
		this.input4 = input4;
		this.input5 = input5;
	}

	@Test
	public void testpgMenu1() {
		pgMenu level01 = new pgMenu();
		assertEquals(true, level01.conditions(input1, input2, input3, input4, input5));
	}

	@Test
	public void testpgMenu2() {
		pgMenu level02 = new pgMenu();
		assertEquals(true, level02.conditions(input1, input2, input3, input4, input5));
	}

	@Test
	public void testpgMenu3() {
		pgMenu level03 = new pgMenu();
		assertEquals(true, level03.conditions(input1, input2, input3, input4, input5));
	}

	@Test
	public void testpgMenu4() {
		pgMenu level04 = new pgMenu();
		assertEquals(true, level04.conditions(input1, input2, input3, input4, input5));
	}

	@Test
	public void testpgMenu5() {
		pgMenu level05 = new pgMenu();
		assertEquals(true, level05.conditions(input1, input2, input3, input4, input5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testdepositNoNegative() throws Exception{
		pgMenu level00 = new pgMenu();
		level00.depositNoNegative(0);
	}

}
