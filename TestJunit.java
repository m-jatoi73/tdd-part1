package sibisoft.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	@Test
	public void testReduceMoney() {
		Bank bank= new Bank();
		Money result= bank.reduce(Money.dollar(1), "USD");
		assertEquals(Money.dollar(1), result);
	}
}
