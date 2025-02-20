
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class VoterValidatorTest {
	VoterValidator v= new VoterValidator();
	@Test
public	void testValidateVoterAge() throws Exception{
		    Exception e =assertThrows(Exception.class,()->{
		    	v.validateVoterAge(-1);
		    } );
		    assertEquals("Invalid age", e.getMessage());
		  
	    }
	
	@ParameterizedTest
	@ValueSource(ints = { 19,20,45,78})
	public void validateVoterAgeTestParameter123(int age) throws Exception {
		
		Assertions.assertTrue(v.validateVoterAge(age));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {3,1,16,15})
	public void validateVoterAgeTest_UnderAge(int age) throws Exception{
		Assertions.assertFalse(v.validateVoterAge(age));
	}
}