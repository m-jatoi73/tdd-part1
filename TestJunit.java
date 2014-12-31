package sibisoft.code;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestJunit {
	@Test
   public void testMultiplication() {
		Dollar five= new Dollar(5);
		Dollar product= five.times(2);
		assertEquals(new Dollar(10), product);
		product= five.times(3);
		assertEquals(15, product.amount);
   }
}
