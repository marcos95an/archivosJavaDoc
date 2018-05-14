import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circulo_MANTest {

	@Test
	public void valorPositivo() {
		Circulo_MAN c1=new Circulo_MAN(7, "Circulo");
		assertEquals(c1.area(),7*7*3.1416);
	}

	@Test
	public void valorCero() {
		Circulo_MAN c1=new Circulo_MAN(0, "Circulo");
		assertEquals(c1.area(),0*0*3.1416);
	}
	@Test
	public void valorNegativo() {
		Circulo_MAN c1=new Circulo_MAN(-3, "Circulo");
		assertEquals(c1.area(),-3*-3*3.1416);
	}
}
