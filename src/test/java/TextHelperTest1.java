import static org.junit.Assert.*;

import org.junit.Test;

public class TextHelperTest1 {

	

		MyClass helper = new MyClass();
		
		@Test

		public void testSwapLastTwoCharacters() {
			assertEquals("",helper.swapLastTwoCharacters(""));
			assertEquals("A",helper.swapLastTwoCharacters("A"));
			assertEquals("BA",helper.swapLastTwoCharacters("AB"));
			assertEquals("RANI",helper.swapLastTwoCharacters("RAIN"));
			assertEquals("COURSE",helper.swapLastTwoCharacters("COURES"));
			assertEquals("Lidor",helper.swapLastTwoCharacters("Lidro"));
		}

		@Test
		//@Disabled
		public void testTruncateAInFirst2Positions() {
			assertEquals("",helper.truncateAInFirst2Positions(""));
			assertEquals("BCD",helper.truncateAInFirst2Positions("ABCD"));
			assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
			assertEquals("BCD",helper.truncateAInFirst2Positions("BACD"));
			assertEquals("BBAA",helper.truncateAInFirst2Positions("BBAA"));
			assertEquals("pple",helper.truncateAInFirst2Positions("Apple"));
			assertEquals("BBA",helper.truncateAInFirst2Positions("ABBA"));
			assertEquals("vri",helper.truncateAInFirst2Positions("Aavri"));
			assertEquals("Airplane",helper.truncateAInFirst2Positions("AAAirplane"));
			
			
		}
	


}
