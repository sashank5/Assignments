// Bank_Loan_Interest_Calculator

import java.util.Scanner;//Import Scanner class to get input from user
/* create a class bank_loan that contains details of which banks available and
   type of loans available.
*/
public class bank_loan {
    int bank_name;
    int loan_option;
    double grams;
    Scanner s = new Scanner(System.in);
    void get_bank(){
        System.out.println("Banks Available: ");
        System.out.println("1.Axis Bank");
        System.out.println("2.State Bank of India");
        System.out.println("3.Bank of Maharastra");
        System.out.println("4.HDFC Bank");
        System.out.println("Select a bank: ");
        bank_name=s.nextInt();//get the input of bank name
        if(bank_name==1){
            System.out.println("You have selected: Axis Bank");
        }
        if(bank_name==2){
            System.out.println("You have selected: State Bank of India");
        }
        if(bank_name==3){
            System.out.println("You have selected: Bank of Maharastra");
        }
        if(bank_name==4){
            System.out.println("You have selected: HDFC Bank");
        }
        
    }
    void get_loan_type(){// get the input of type of loan
        System.out.println("Types of Loans Available: ");
        System.out.println("1.Personal Loan");
        System.out.println("2.Housing Loan");
        System.out.println("3.Educational Loan");
        System.out.println("4.Gold Loan");
        System.out.println("Select Type of Loan: ");
        loan_option = s.nextInt();
        if(loan_option==1){
            System.out.println("You have selected: Personal Loan");
        }
        if(loan_option==2){
            System.out.println("You have selected: Housing Loan");
        }
        if(loan_option==3){
            System.out.println("You have selected: Educational Loan");
        }
        /* For gold loan alone we need input of number of grams of gold
           as gold loan is provided as per the grams of gold.
        */
        if(loan_option==4){
            System.out.println("You have selected: Gold Loan");
            System.out.println("Enter the number of grams: ");
            grams=s.nextDouble();
            System.out.println("Number of grams: "+grams);
        }
    }
}

