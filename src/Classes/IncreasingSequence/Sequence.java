
package Classes.IncreasingSequence;

import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Sequence extends ArrayList<Integer> {

    public int GetUselessElementsCount() {
        int[] sequences = GetSequenceLengths();
        OptionalInt max = IntStream.of(sequences).max();
        return this.size() - max.getAsInt();
    }

    private int[] getInitializedLengthsArray (){
        int[] lengths = new int[this.size()];
        for (int i = 0; i < this.size(); i++ )
            lengths[i] = 1;
        return lengths;
    }

    private int[] GetSequenceLengths() {
        int[] lengths = getInitializedLengthsArray();

        for (int i = 1; i < this.size(); i++ )
            for (int j = 0; j < i; j++ )
                if ( this.get(i) > this.get(j) && lengths[i] < lengths[j] + 1)
                    lengths[i] = lengths[j] + 1;
        return lengths;
    }

}
