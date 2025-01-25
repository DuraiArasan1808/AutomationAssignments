package com.creatio.crm.language.basics;
public class ConditionalStatements {
    public static void main(String[] args) {
        // Input details
        String customerName = "John Doe";
        int creditScore = 720;
        double income = 55000.0;
        boolean isEmployed = true;
        double debtToIncomeRatio = 35.0;

        // Eligibility evaluation
        System.out.println("Loan Evaluation for: " + customerName);

        if (creditScore > 750) {
            System.out.println("Loan Approved: Credit score is above 750.");
        } else if (creditScore >= 650 && creditScore <= 750) {
            if (income >= 50000) {
                if (isEmployed) {
                    if (debtToIncomeRatio < 40) {
                        System.out.println("Loan Approved: All criteria met.");
                    } else {
                        System.out.println("Loan Denied: Debt-to-Income (DTI) ratio is 40% or greater.");
                    }
                } else {
                    System.out.println("Loan Denied: Customer is unemployed.");
                }
            } else {
                System.out.println("Loan Denied: Income is less than $50,000.");
            }
        } else {
            System.out.println("Loan Denied: Credit score is below 650.");
        }
    }
}
