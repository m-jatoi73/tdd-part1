package sibisoft.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	@Test
	public void testSimpleAddition() {
		Money five= Money.dollar(5);
		Expression sum= five.plus(five);
		Bank bank= new Bank();
		Money reduced= bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduced);
	}
}
