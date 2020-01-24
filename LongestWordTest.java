import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

/**
 * 
 */

/**
 * @author sande
 *
 */
class LongestWordTest {

	LongestWord obj;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		 obj = new LongestWord();
	}

	/**
	 * Test method for {@link LongestWord#getLongestWord(java.lang.String)}.
	 */
	@SuppressWarnings("deprecation")
	@Test
	void testGetLongestWord() {
		Assert.assertEquals("7 an Sandeep", obj.getLongestWord("Sandeep Pathak"));
	}

}
