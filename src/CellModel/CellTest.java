package CellModel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellTest {
	public static Cell celltest = new Cell(50,50);

	@Before
	public void setUp() throws Exception {
		celltest.deleteAllCell();
	}

	@Test
	public void testCell() {
		Cell celltest2=new Cell(50,50);
		assertNotEquals(celltest,celltest2);
		//fail("Not yet implemented");
	}

	
	
	@Test
	public void testgetNeighborCount() {
		int num;
		num=celltest.getNeighborCount(10,10);
		assertEquals(num,2);
	    
	}

}
