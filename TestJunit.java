package sibisoft.code;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestJunit {
	@Test
   public void testMultiplication() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
   }
}
