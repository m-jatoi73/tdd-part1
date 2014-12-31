package sibisoft.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
}
