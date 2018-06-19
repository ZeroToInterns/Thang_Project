import static org.junit.Assert.assertEquals;

import org.junit.*;

public class Tester {

	private LoopFun obj; 
	@Before
	public void setUp() {
		obj = new LoopFun();
	}
	
	@Test
	public void testPermutation() {
			//testing permutation method
			assertEquals(obj.getPermutationCount(8), 40320);
			assertEquals(obj.getPermutationCount(0), 0);
			assertEquals(obj.getPermutationCount(-1), 0);
			assertEquals(obj.getPermutationCount(10), 3628800);	
	}

	@Test
	public void testRemoveDup() {
		//testing removeDuplicates method
		assertEquals(obj.removeDuplicates("Jaaaammeesss"), "James");
		assertEquals(obj.removeDuplicates("seeped"), "sepd");
		assertEquals(obj.removeDuplicates("woorrdd"), "word");
		
	}
	
	@Test(expected = NullPointerException.class)
	public void testRemoveDup2() {
		obj.removeDuplicates("");
	}
	
	@Test
	public void testSumSeries() {
		
	}

}
