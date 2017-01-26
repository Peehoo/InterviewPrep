package arrays;

import junit.framework.Assert;

import org.junit.Test;

public class StringCompressionTest {

	@Test
	public void test() {
		StringCompression sc = new StringCompression();
		Assert.assertEquals("a2b1c5a3", sc.compressString("aabcccccaaa"));
	}
	
	@Test
	public void testEqual() {
		StringCompression sc = new StringCompression();
		Assert.assertEquals("a2b1c3a2", sc.compressString("aabcccaa"));
	}
	
	@Test
	public void testSmall() {
		StringCompression sc = new StringCompression();
		Assert.assertEquals("abccaa", sc.compressString("abccaa"));
	}

}
