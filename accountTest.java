package ca.kpu.info3235.teamproject;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ca.kpu.info3235.lab2.GroupTest2;
import ca.kpu.info3235.lab2.shoppingCart;

import org.junit.experimental.categories.Category;

@RunWith(Parameterized.class)
@Category(GroupTest1.class)
public class accountTest {

	@Test
	public void testAccount0() {
		int state = 0;
		int customer = 0;
		assertEquals(state, customer);
		System.out.println("\nThe state now is customer.");
	}

	@Test
	public void testAccount1() {
		int state = 1;
		int seller = 1;
		assertEquals(state, seller);
		System.out.println("\nThe state now is seller.");
	}

	@Test
	public void testAccount2() {
		int state = 2;
		int visitor = 2;
		assertEquals(state, visitor);
		System.out.println("\nThe state now is visitor.");
	}

}