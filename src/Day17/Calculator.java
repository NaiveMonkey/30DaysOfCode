package Day17;

public class Calculator {

    public int power(int n, int p) throws Exception {
        if (n >= 0 && p >= 0) {
            int answer = n;
            for (int i = 0; i < p; i++) {
                answer *= answer;
            }
            return answer;
        } else {
            throw new Exception("n and p should be non-negative");
        }
    }
}
