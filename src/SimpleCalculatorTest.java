import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {

	SimpleCalculator calc = new SimpleCalculator();
	double firstNumber, secondNumber;
	int count;
	
	@Before
	public void setRandomValues() {
		
		firstNumber = (int)(Math.random() * 100);
		secondNumber = (int)(Math.random() * 100);
	}
	
	@Test
	public void shouldThrowErrorIfSummingIsNotCorrect() {
	
		double result = firstNumber + secondNumber;
		
		assertEquals(result, calc.sum(firstNumber, secondNumber));
	}
	
	@Test
	public void shouldThrowErrorIfSubbingIsNotCorrect() {
	
		double result = firstNumber - secondNumber;
		
		assertEquals(result, calc.sub(firstNumber, secondNumber));
	}
	
	@Test
	public void shouldThrowErrorIfDividingIsNotCorrect() {
	
		double result = (int)((firstNumber / secondNumber) * 10) / 10;
		
		assertEquals(result, calc.divide(firstNumber, secondNumber));
	}
	
	@Test
	public void shouldThrowErrorIfMultiplyingIsNotCorrect() {
	
		double result = firstNumber * secondNumber;
		
		assertEquals(result, calc.multiply(firstNumber, secondNumber));
	}
}
