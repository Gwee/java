import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by guy on 14/01/2016.
 */
public class GayTest {

    @Test
    public void numberExistsTest() {
        int[] gayArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        assertTrue("Couldn't find a number on the entire range", Program.isInArray(gayArray, 3, 0, 9));
        assertTrue("Couldn't find the minimal number on the entire range", Program.isInArray(gayArray, 1, 0, 9));
        assertTrue("Couldn't find the maximal number on the entire range", Program.isInArray(gayArray, 10, 0, 9));
        assertTrue("Couldn't find the minimal number in a partial range", Program.isInArray(gayArray, 6, 5, 9));
        assertTrue("Could't find the maximal number in a partial range", Program.isInArray(gayArray, 10, 5, 9));
    }

    @Test
    public void numberDoesNotExistTest() {
        assertFalse(Program.isInArray(new int[]{1,2,3,4,5,6,7,8,9,10}, 11, 0, 9));
    }


}
