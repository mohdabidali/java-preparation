package SplitWiseDesignPattern.Expense;

import java.util.List;

import SplitWiseDesignPattern.Balance.BalanceController;
import SplitWiseDesignPattern.Expense.Split.ExpenseSplit;
import SplitWiseDesignPattern.Expense.Split.Split;
import SplitWiseDesignPattern.Users.User;

public class ExpenseController {
    
    BalanceController balanceSheetController;
    public ExpenseController(){
        balanceSheetController = new BalanceController();
    }
public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){
        ExpenseSplit expenseSplit = SplitFactory.getSplitObejct(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);
        
        Expense expense = new Expense(expenseId, expenseAmount, description, paidByUser, splitType, splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);
        
        return expense;
    }

}
