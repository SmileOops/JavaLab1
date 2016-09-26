package Classes.IncreasingSequence;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sequence extends ArrayList<Integer> {

    public int GetUselessElementsCount() {
        int[] sequences = GetSequencesLength();
        OptionalInt max = IntStream.of(sequences).max();
        return this.size() - max.getAsInt();
    }

    private int[] GetSequencesLength(){
        int[] result = new int[this.size()];
        for (int i = 0; i < this.size() - 1; i++) {
            result[i] = 1;
            int interruptionIndex = 0;
            boolean isInterrupted = false;
            for (int j = i; j < this.size() - 1; j++) {
                if (!isInterrupted) {
                    if (this.get(j) < this.get(j + 1)) {
                        result[i]++;
                    }
                    else {
                        interruptionIndex = j;
                        isInterrupted = true;
                    }
                }
                else {
                    if (this.get(interruptionIndex) < this.get(j + 1)) {
                        isInterrupted = false;
                        result[i]++;
                    }
                }
            }
        }

        return result;
    }
}
