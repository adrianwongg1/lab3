import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testListReverse(){
    int[] input1 = {1,2,3,4,5,6,7};
    assertArrayEquals(new int[]{7,6,5,4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testListReverseInPlace(){
    int[] input1 = {1,2,3,4,5,6,7};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{7,6,5,4,3,2,1}, input1);
  }

  @Test
  public void testAverageWithoutLowestSameNumbers(){
    double[] input1 = {3.0,3.0,3.0,3.0};
    double expectedOutput = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(3.0, expectedOutput, 0);
  }

  @Test
  public void testAverageWithoutLowestNumbers(){
    double[] input1 = {1.0,2.0,6.0,7.0};
    double expectedOutput = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(5.0, expectedOutput, 0);
  }


}
