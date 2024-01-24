package SplitWiseDesignPattern.Balance;

import java.util.List;

import SplitWiseDesignPattern.Expense.Split.Split;
import SplitWiseDesignPattern.Users.User;

public class BalanceController {
    
    public void updateUserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount){
        UserExpenseBalanceSheet paidByUserExpenseBalanceSheet = expensePaidBy.getUserBalanceSheet();
        paidByUserExpenseBalanceSheet.setTotalPayment(totalExpenseAmount + paidByUserExpenseBalanceSheet.getTotalPayment());
    
        for(Split split:splits){

            User userOwe = split.getUser();
            UserExpenseBalanceSheet oweUserExpenseBalanceSheet = userOwe.getUserBalanceSheet();
            double oweAmount = split.getAmountOwe();

            if(expensePaidBy.getUserId().equals(userOwe.getUserId())){
                paidByUserExpenseBalanceSheet.setTotalYourExpense(paidByUserExpenseBalanceSheet.getTotalYourExpense()+oweAmount);
            }
            else{
                // update the balance of paid user
                paidByUserExpenseBalanceSheet.setTotalYourExpense(paidByUserExpenseBalanceSheet.getTotalYouGetBack()+oweAmount);
            }
        }
    }
}
