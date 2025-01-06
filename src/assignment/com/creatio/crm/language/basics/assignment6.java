package assignment.com.creatio.crm.language.basics;


import java.util.Scanner;

public class assignment6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = scanner.nextInt();

        System.out.print("Enter Income: ");
        double income = scanner.nextDouble();

        System.out.print("Is Employed (true/false): ");
        boolean isEmployed = scanner.nextBoolean();

        System.out.print("Enter Debt-to-Income Ratio: ");
        double debtToIncomeRatio = scanner.nextDouble();

        String loanStatus = "Denied"; // Default to denied

        // Credit Score Check
        if (creditScore > 750) {
            loanStatus = "Approved (Credit score above 750)";
        } else if (creditScore >= 650) {
            // Income Check
            if (income >= 50000.0) {
                // Employment Check
                if (isEmployed) {
                    // DTI Ratio Check
                    if (debtToIncomeRatio < 40.0) {
                        loanStatus = "Approved (Passed all checks)";
                    } else {
                        loanStatus = "Denied (DTI ratio too high)";
                    }
                } else {
                    loanStatus = "Denied (Unemployed)";
                }
            } else {
                loanStatus = "Denied (Income below threshold)";
            }
        } 

        System.out.println(customerName + ": " + loanStatus);

        scanner.close(); // Close the scanner to release resources
    }
}