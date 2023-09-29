package controlcandidates.candidature;

public class SelectiveProcess {
    public static void main(String [] args) {
        analyzeCandidate(1900.0);
        analyzeCandidate(2200.0);
        analyzeCandidate(2000.0);
    }
    static void analyzeCandidate(double intendedSalary) {
        double baseSalary = 2000.0;
        if(baseSalary > intendedSalary) {
            System.out.println("CALL TO THE CANDIDATE");
        }else if(baseSalary == intendedSalary) {
            System.out.println("CALL THE CANDIDATE WITH A COUNTER PROPOSAL");
        }else {
            System.out.println("WAITING THE RESULT FOR THE REST OF THE CANDIDATES");
        }
    }
}
