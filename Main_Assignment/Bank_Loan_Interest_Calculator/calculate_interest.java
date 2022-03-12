import java.util.Scanner;// Import Scanner class to take input from user      
/* Create a class loan_amount and get the input
    of loan amount required.
*/
class loan_amount{
    Scanner s = new Scanner(System.in);
    double principal_amount;
    void get_loan_amount(){
        System.out.println("Enter Loan Amount: ");
        principal_amount=s.nextDouble();
        System.out.println("Amount Requested: "+principal_amount);
    }
}
/*create a class to calculate the emi and interest rates that inherits the loan_amount class
  create objects for classes and perform the operations to calculate emi
*/
public class calculate_interest extends loan_amount {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double emi,p,i,interest_per_month,gold_grams,amount;
        int n,loan_per_gram;
        calculate_interest cal = new calculate_interest();
        bank_loan b = new bank_loan();
        b.get_bank();
        b.get_loan_type();
        System.out.println("Enter number of months(tenure)");// get the input of tenure period
        n=s.nextInt();
        if((b.bank_name==1 && b.loan_option==1)){// if we select bank 1 and loan 1 perform this likewise below code
            i=7.35/1200;
            cal.get_loan_amount();
            p = cal.principal_amount;
            interest_per_month = i*p;
            emi = (p * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(p+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==1 && b.loan_option==2)){
            i=6.75/1200;
            cal.get_loan_amount();
            p = cal.principal_amount;
            interest_per_month = i*p;
            emi = (p * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(p+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==1 && b.loan_option==3)){
            i=10.70/1200;
            cal.get_loan_amount();
            p = cal.principal_amount;
            interest_per_month = i*p;
            emi = (p * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(p+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==1 && b.loan_option==4)){
            i=7.65/1200;
            gold_grams = b.grams;
            loan_per_gram=2685;
            amount=loan_per_gram*gold_grams;
            interest_per_month = i*amount;
            emi = (amount * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Loan You can get: "+amount);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(amount+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==2 && b.loan_option==1)){
            i=8.25/1200;
            cal.get_loan_amount();
            p = cal.principal_amount;
            interest_per_month = i*p;
            emi = (p * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(p+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==2 && b.loan_option==2)){
            i=7.25/1200;
            cal.get_loan_amount();
            p = cal.principal_amount;
            interest_per_month = i*p;
            emi = (p * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(p+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==2 && b.loan_option==3)){
            i=11.35/1200;
            cal.get_loan_amount();
            p = cal.principal_amount;
            interest_per_month = i*p;
            emi = (p * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(p+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==2 && b.loan_option==4)){
            i=8.45/1200;
            gold_grams = b.grams;
            loan_per_gram=2628;
            amount=loan_per_gram*gold_grams;
            interest_per_month = i*amount;
            emi = (amount * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Loan You can get: "+amount);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(amount+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==3 && b.loan_option==1)){
            i=6.85/1200;
            cal.get_loan_amount();
            p = cal.principal_amount;
            interest_per_month = i*p;
            emi = (p * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(p+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==3 && b.loan_option==2)){
            i=6.35/1200;
            cal.get_loan_amount();
            p = cal.principal_amount;
            interest_per_month = i*p;
            emi = (p * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(p+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==3 && b.loan_option==3)){
            i=10.20/1200;
            cal.get_loan_amount();
            p = cal.principal_amount;
            interest_per_month = i*p;
            emi = (p * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(p+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==3 && b.loan_option==4)){
            i=7.25/1200;
            gold_grams = b.grams;
            loan_per_gram=2869;
            amount=loan_per_gram*gold_grams;
            interest_per_month = i*amount;
            emi = (amount * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Loan You can get: "+amount);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(amount+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==4 && b.loan_option==1)){
            i=8.75/1200;
            cal.get_loan_amount();
            p = cal.principal_amount;
            interest_per_month = i*p;
            emi = (p * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(p+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==4 && b.loan_option==2)){
            i=7.45/1200;
            cal.get_loan_amount();
            p = cal.principal_amount;
            interest_per_month = i*p;
            emi = (p * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(p+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==4 && b.loan_option==3)){
            i=11.65/1200;
            cal.get_loan_amount();
            p = cal.principal_amount;
            interest_per_month = i*p;
            emi = (p * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(p+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
        if((b.bank_name==4 && b.loan_option==4)){
            i=7.50/1200;
            gold_grams = b.grams;
            loan_per_gram=2743;
            amount=loan_per_gram*gold_grams;
            interest_per_month = i*amount;
            emi = (amount * i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
            System.out.println("Loan You can get: "+amount);
            System.out.println("Interest amount per month: "+interest_per_month);
            System.out.println("Amount to be paid per month: "+emi);
            System.out.println("Total amount to be paid: "+(amount+interest_per_month*n));
            System.out.println("Tenure(months): "+n);
        }
       
         
    }
}
