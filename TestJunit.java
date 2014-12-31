package sibisoft.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	@Test
	public void testDifferentClassEquality() {
		assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
	}
}
