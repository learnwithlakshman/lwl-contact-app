package com.lwl.lcp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NumberServiceTest {

	@Autowired
	private NumberService numberService;
	
	@Test
	void biggestFirstElementAsBigTest() {
			int expected = 15;
			int actual = numberService.biggest(15, 12, 11);
			assertEquals(expected, actual);
	}
	
	@Test
	 void biggestThree1ElementAsBigTest() {
			int expected = 18;
			int actual = numberService.biggest(15, 11, 18);
			assertEquals(expected, actual);
	}

	@Test
	 void biggestSecondElementAsBigTest() {
		int expected = 15;
		int actual = numberService.biggest(12, 15, 11);
		assertEquals(expected, actual);
	}
	@Test
	 void biggestThirdElementAsBigTest() {
		int expected = 15;
		int actual = numberService.biggest(11, 12, 15);
		assertEquals(expected, actual);
	}
}
