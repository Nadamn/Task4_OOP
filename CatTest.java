import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;


public class CatTest extends TestCase {

@Test
public void testMeow(){

	Cat bessa = new Cat(2,"male","bessa","siamese");
	String bessaName = bessa.getAnimalName();	
	Assert.assertEquals(bessaName,"bessa");
}

}
