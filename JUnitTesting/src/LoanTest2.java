import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanTest2 {
	Loan loan;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@BeforeEach
	void setUp() throws Exception {
		loan= new Loan();
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
		loan=null;
	}

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
