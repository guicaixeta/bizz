package biz;

import static org.junit.Assert.*;

import org.junit.Test;

public class BizTest {

	@Test
	public void testFizz() {
		assert(Biz.jogar(24) == "Fizz");
	}

	@Test
	public void testBuzz() {
		assert(Biz.jogar(40) == "Buzz");
	}
	
	
	@Test
	public void testFizzBuzz() {
		assert(Biz.jogar(60) == "FizzBuzz");
	}
	
	@Test
	public void testContinua() {
		assert(Biz.jogar(26) == "Continua");
	}
}
