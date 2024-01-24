package SplitWiseDesignPattern.Users;

import SplitWiseDesignPattern.Balance.UserExpenseBalanceSheet;

public class User {
    
    String userId;
    String userName;
    UserExpenseBalanceSheet userBalanceSheet;
   
    public User(String userId, String userName, UserExpenseBalanceSheet userBalanceSheet) {
        this.userId = userId;
        this.userName = userName;
        this.userBalanceSheet = userBalanceSheet;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public UserExpenseBalanceSheet getUserBalanceSheet() {
        return userBalanceSheet;
    }

    
}
