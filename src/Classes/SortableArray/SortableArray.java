package Classes.SortableArray;

import java.util.ArrayList;

public class SortableArray extends ArrayList<Double> {

    public void sortByShell() {
        int i = 0;
        while (i < this.size() - 1) {
            if (this.get(i) <= this.get(i + 1)) {
                i++;
            } else {
                double temp = this.get(i);
                this.set(i, this.get(i + 1));
                this.set(i + 1, temp);
                if (i != 0) {
                    i--;
                }
            }
        }
    }
}
