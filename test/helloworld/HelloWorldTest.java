package helloworld;

import junit.framework.Assert;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void helloWorld() {
		HelloWorld hw = new HelloWorld();
		Assert.assertEquals("Hello World", hw.helloWorld());
	}
}
