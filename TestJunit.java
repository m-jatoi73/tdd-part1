package sibisoft.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	@Test
	public void testReduceMoneyDifferentCurrency() {
		Bank bank= new Bank();
		bank.addRate("CHF", "USD", 2);
		Money result= bank.reduce(Money.franc(2), "USD");
		assertEquals(Money.dollar(1), result);
	}
}
