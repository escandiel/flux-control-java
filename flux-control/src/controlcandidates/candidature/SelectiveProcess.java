package controlcandidates.candidature;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
    public static void main(String[] args) {
        String[] candidates = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidate : candidates) {
            callingCandidate(candidate);
        }
    }

    static void callingCandidate(String candidate) {
        int attemptsMade = 1;
        boolean keepTrying = true;
        boolean answered = false;
        do {
            answered = answerCall();
            keepTrying = !answered;
            if (keepTrying) {
                attemptsMade++;
            } else {
                System.out.println("CONNECTED WITH SUCCESS");
            }

        } while (keepTrying && attemptsMade < 3);
        if (answered) {
            System.out.println("WE MADE CONTACT WITH " + candidate + " ON ATTEMPT " + attemptsMade);
        } else {
            System.out.println("WE COULDN'T MAKE CONTACT WITH " + candidate + ", MAX NUMBER OF TRIES " + attemptsMade);
        }
    }

    static boolean answerCall() {
        return new Random().nextInt(3) == 1;
    }

    static void printSelected() {
        String[] candidates = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Printing the candidates list informing the index of the element");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println("The candidate of number " + (i + 1) + " is " + candidates[i]);
        }
    }

    static void SelectionCandidates() {
        String[] candidates = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int selectedCandidates = 0;
        int actualCandidate = 0;
        double baseSalary = 2000.0;

        while (selectedCandidates < 5 && actualCandidate < candidates.length) {

            String candidate = candidates[actualCandidate];
            double intendedSalary = intendedValue();
            System.out.println("THE CANDIDATE " + candidate + " REQUESTED THIS SALARY VALUE " + intendedSalary);

            if (baseSalary >= intendedSalary) {
                System.out.println("THE CANDIDATE " + candidate + " WAS REQUESTED TO THE JOB");
                selectedCandidates++;
            }

            actualCandidate++;
        }
    }

    static double intendedValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
