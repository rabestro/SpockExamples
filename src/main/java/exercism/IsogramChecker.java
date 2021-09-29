package exercism;

public class IsogramChecker {
    public boolean isIsogram(final String phrase) {
        int set = 0;
        for (char symbol : phrase.toCharArray()) {
            int digit = Character.getNumericValue(symbol) - 10;
            if (digit >= 0) {
                if (0 < (set & 1 << digit)) {
                    return false;
                }
                set |= 1 << digit;
            }
        }
        return true;
    }
}
