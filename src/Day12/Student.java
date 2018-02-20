package Day12;

public class Student extends Person {
    private int[] testScores;


    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public Character calculate() {
        int sum = 0;
        int length = testScores.length;
        for (int i = 0; i < length; i++) {
            sum += testScores[i];
        }
        int average = sum / length;
        if (average < 40) return 'T';
        else if (average < 55) return 'D';
        else if (average < 70) return 'P';
        else if (average < 80) return 'A';
        else if (average < 90) return 'E';
        else return 'O';
    }
}
