package SplitWiseDesignPattern.Group;

import java.util.ArrayList;
import java.util.List;

import SplitWiseDesignPattern.Users.User;

public class GroupDetails {
    String groupId;
    String groupName;
    List<User> groupMembers;
    // @Autowired
    ExpenseController expenseController;
    List<Expense> expenseList;
   
    public GroupDetails() {
      
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
        groupMembers = new ArrayList<>();
   
    }

     //add member to group
     public void addGroupMember(User member){
        groupMembers.add(member);
     }

     public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                List<Split> splitDetails, ExpenseSplitType, splitType, User userPaidBy){
   
        Expsense expense = expenseController.create(expenseId,description,expenseAmount,splitDetails,splitType,userPaidBy);
        expenseList.add(expense);

    return expense;

}   
}
