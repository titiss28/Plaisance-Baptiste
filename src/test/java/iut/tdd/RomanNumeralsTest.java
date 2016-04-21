package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_I_when_1 () {
		//Given
		String input = "I";
		String expected = "1";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	public void should_return_I_when_2 () {
		//Given
		String input = "2";
		String expected = "II";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
}
