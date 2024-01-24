package SplitWiseDesignPattern.Expense;

import SplitWiseDesignPattern.Expense.Split.EqualExpenseSplit;
import SplitWiseDesignPattern.Expense.Split.ExpenseSplit;
import SplitWiseDesignPattern.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {
    
    public static ExpenseSplit getSplitObejct(ExpenseSplitType object){

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new ExpenseSplit();
            default:
                return null;
        }
    }
}
