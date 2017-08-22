import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsTest {

	RomanNumerals romanNumeral;

	@Before
	public void setup() {
		romanNumeral = new RomanNumerals();
	}

	@Test
	public void arabicShouldReturnRoman() {
		Assert.assertEquals("1", "I", RomanNumerals.arabicToRoman(1));
		Assert.assertEquals("2", "II", RomanNumerals.arabicToRoman(2));
		Assert.assertEquals("3", "III", RomanNumerals.arabicToRoman(3));
	}
	
	@Test
	public void arabicShouldReturnRoman4() {
		Assert.assertEquals("4", "IV", RomanNumerals.arabicToRoman(4));
	}
	@Test
	public void arabicShouldReturnFive() {
	Assert.assertEquals("5", "V", RomanNumerals.arabicToRoman(5));	
	}
}
