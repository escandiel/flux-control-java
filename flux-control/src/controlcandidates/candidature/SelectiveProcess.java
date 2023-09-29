package controlcandidates.candidature;
import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
    public static void main(String [] args) {
        printSelected();
        SelectionCandidates();

    }

    static void printSelected() {
        String [] candidates = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Printing the candidates list informing the index of the element");
        for(int i=0; i < candidates.length; i++){
            System.out.println("The candidate of number "+ (i+1) + "is " + candidates[i]);
        }


    }

    static void SelectionCandidates() {
        String [] candidates = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int selectedCandidates = 0;
        int actualCandidate = 0;
        double baseSalary = 2000.0;
          
        while(selectedCandidates < 5 && actualCandidate < candidates.length) {
            
            String candidate = candidates[actualCandidate];
            double intendedSalary = intendedValue();
            System.out.println("THE CANDIDATE " + candidate + " REQUESTED THIS SALARY VALUE " + intendedSalary);


            if(baseSalary >= intendedSalary) {
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