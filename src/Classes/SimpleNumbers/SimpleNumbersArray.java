package Classes.SimpleNumbers;

import java.util.ArrayList;

public class SimpleNumbersArray extends ArrayList<Integer> {

    public ArrayList<Integer> GetSimpleNumberIndices() {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            if (CheckIfNumberSimple(this.get(i))) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean CheckIfNumberSimple(int number) {
        if (number < 2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
