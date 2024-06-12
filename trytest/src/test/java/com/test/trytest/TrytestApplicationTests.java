package com.test.trytest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class TrytestApplicationTests {

	@Test
	void contextLoads() {
		Calculatrice calc = new Calculatrice();

		Integer expected;
		Integer result;

		expected = 10;
		result = calc.Add(3,7);

		assertEquals(expected,result);
	}

	@Test
	public void testDivisibleByThreeAndFive() {
		assertEquals("FizzBuzz", FizzBuzz.getOutput(15));
		assertEquals("FizzBuzz", FizzBuzz.getOutput(30));
	}

	@Test
	public void testDivisibleByThreeOnly() {
		assertEquals("Fizz", FizzBuzz.getOutput(3));
		assertEquals("Fizz", FizzBuzz.getOutput(9));
	}

	@Test
	public void testDivisibleByFiveOnly() {
		assertEquals("Buzz", FizzBuzz.getOutput(5));
		assertEquals("Buzz", FizzBuzz.getOutput(20));
	}

	@Test
	public void testNotDivisibleByThreeOrFive() {
		assertEquals("1", FizzBuzz.getOutput(1));
		assertEquals("7", FizzBuzz.getOutput(7));
	}

	@Test
	public void testEdgeCases() {
		assertEquals("Fizz", FizzBuzz.getOutput(999));
		assertEquals("Buzz", FizzBuzz.getOutput(995));
	}

	@Test
	public void testNumberThousand() {
		assertThrows(IllegalArgumentException.class, () -> {
			FizzBuzz.getOutput(1000);
		});
	}

	@Test
	public void testNumberGreaterThanThousand() {
		assertThrows(IllegalArgumentException.class, () -> {
			FizzBuzz.getOutput(1001);
		});
	}

	@Test
	public void testNegativeNumbers() {
		assertEquals("Fizz", FizzBuzz.getOutput(-3));
		assertEquals("Buzz", FizzBuzz.getOutput(-5));
		assertEquals("FizzBuzz", FizzBuzz.getOutput(-15));
		assertEquals("-7", FizzBuzz.getOutput(-7));
	}
}
