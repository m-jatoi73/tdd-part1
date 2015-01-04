
import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	@Test
	public void testPlusSameCurrencyReturnsMoney() {
		Expression sum= Money.dollar(1).plus(Money.dollar(1));
		assertTrue(sum instanceof Money);
	}
}
