package Login;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generics.BaseClass;
import Generics.ItestListnerUtility;

@Listeners(ItestListnerUtility.class)
public class Demo extends BaseClass{
	@Test
	public void demo1() {
		assertTrue(true);
	}

	
}
