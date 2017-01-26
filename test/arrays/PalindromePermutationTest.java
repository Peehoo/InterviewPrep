package arrays;

import junit.framework.Assert;

import org.junit.Test;

public class PalindromePermutationTest {

	@Test
	public void isPalincldromePermutation() {
		PalindromePermutation pp = new PalindromePermutation();
		Assert.assertEquals(true, pp.isPalindromePermutation("Tact Coa"));
	}
	
	@Test
	public void checkSpaces() {
		PalindromePermutation pp = new PalindromePermutation();
		Assert.assertEquals(true, pp.isPalindromePermutation("Tact       Coa    "));
	}
	
	@Test
	public void checkNegative() {
		PalindromePermutation pp = new PalindromePermutation();
		Assert.assertEquals(false, pp.isPalindromePermutation("Tact oa"));
	}

	@Test
	public void checkEmpty() {
		PalindromePermutation pp = new PalindromePermutation();
		Assert.assertEquals(true, pp.isPalindromePermutation(""));
	}
	
	@Test
	public void checkSmallest() {
		PalindromePermutation pp = new PalindromePermutation();
		Assert.assertEquals(true, pp.isPalindromePermutation("a"));
	}
	
	@Test
	public void checkSpace() {
		PalindromePermutation pp = new PalindromePermutation();
		Assert.assertEquals(true, pp.isPalindromePermutation(" "));
	}
}
