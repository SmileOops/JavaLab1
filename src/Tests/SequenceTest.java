package Tests;

import Classes.IncreasingSequence.Sequence;
import org.junit.Assert;
import org.junit.Test;

public class SequenceTest {
    @Test
    public void getUselessElementsCount() throws Exception {
        Sequence sequence = new Sequence();
        sequence.add(20);
        sequence.add(40);
        sequence.add(10);
        sequence.add(12);
        sequence.add(13);
        sequence.add(11);
        sequence.add(12);
        sequence.add(13);
        sequence.add(14);
        sequence.add(5);

        Assert.assertEquals(5, sequence.GetUselessElementsCount());
    }

}