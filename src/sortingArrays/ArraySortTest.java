package sortingArrays;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static sortingArrays.ArraySort.sort;
import static org.junit.Assert.assertArrayEquals;

public class ArraySortTest {

    @Test
    public void testSingleElement() {
        assertArrayEquals(
                new String[]{"7"},
                sort(new String[]{"7"})
        );
    }
    @Test
    public void testEmpty(){
        assertArrayEquals(new String[]{},
                sort(new String[]{})
        );
    }
    @Test
    public void testNullArrays(){
        assertNull(sort(null));
    }
    @Test
    public void testTwoElements(){
        assertArrayEquals(new String[]{"outorder"},sort(new String[]{"out","order"}));
    }
}
