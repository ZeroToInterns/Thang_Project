import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Tester {
//	public static void main(String[] args) {
//		ControlFlowPractice testing = new ControlFlowPractice();
//		System.out.println(testing.calculateCost(51));
//		System.out.println(testing.calculateCost(35));
//		System.out.println(testing.calculateCost(6));
//		testing.rollDice(1);
//		testing.rollDice(2);
//		testing.rollDice(3);
//		testing.rollDice(4);
//		testing.rollDice(5);
//		testing.rollDice(6);
//		System.out.println(testing.findLetterAt("o", "Hello World"));
//		
//		
//	}
//}
	private ControlFlowPractice testing;
	
	@Before
	public void setUp()
	{
		 testing = new ControlFlowPractice();
	}
	
	@Test
	public void testCalculateCost()
	{
		assertTrue(testing.calculateCost(51) == 100.0);
	}
	@Test
	public void testCalculateCost2()
	{
		
		assertTrue(testing.calculateCost(27) == 50.0);
	}
	@Test
	public void testCalculateCost3()
	{
		
		assertTrue(testing.calculateCost(42) == 50.0);
	}
	@Test
	public void testCalculateCost4()
	{
		
		assertTrue(testing.calculateCost(12) == 10.0);
	}

}