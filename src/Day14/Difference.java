package Day14;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int max = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = 1; j < elements.length; j++) {
                int difference = Math.abs(elements[i] - elements[j]);
                max = Math.max(difference, max);
            }
        }
        maximumDifference = max;
    }
}
