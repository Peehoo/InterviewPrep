package arrays;

import org.junit.Assert;
import org.junit.Test;

public class OneAwayTest {

	@Test
	public void remove() {
		OneAway oa = new OneAway();
		Assert.assertEquals(true, oa.isOneAway("pale", "ple"));
	}
	
	@Test
	public void insert() {
		OneAway oa = new OneAway();
		Assert.assertEquals(true, oa.isOneAway("pales", "pale"));
	}

	@Test
	public void replace() {
		OneAway oa = new OneAway();
		Assert.assertEquals(true, oa.isOneAway("pale", "bale"));
	}
	
	@Test
	public void negative() {
		OneAway oa = new OneAway();
		Assert.assertEquals(false, oa.isOneAway("pale", "bake"));
	}
	
}
