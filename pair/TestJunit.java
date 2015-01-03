package sibisoft.code.pair;

import static org.junit.Assert.*;

import org.junit.Test;

import sibisoft.code.pair.WasRun;

public class TestJunit {
	
	public static void main(String args[]) throws Exception{

		WasRun wasRun = new WasRun("testMethod");
		System.out.println(wasRun.wasRun);
		wasRun.run();
		System.out.println(wasRun.wasRun);
	}
	
	
	@Test
	public void testWasRun() throws Exception{

		WasRun wasRun = new WasRun("testMethod");
		assertFalse(wasRun.wasRun);
		wasRun.run();
		assertTrue(wasRun.wasRun);
	}
}
