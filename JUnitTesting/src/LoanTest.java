import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoanTest {

	@Test
	void testEmi() {
		//fail("Not yet implemented");
		Loan l = new Loan();
		int out=l.emi(1200);
		assertEquals(100,out);
	}

	@Test
	void testSum() {
		//fail("Not yet implemented");
		Loan l = new Loan();
		assertEquals(10,l.sum(7,3));
	}

}
