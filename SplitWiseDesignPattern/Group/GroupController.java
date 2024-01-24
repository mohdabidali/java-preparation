package SplitWiseDesignPattern.Group;

import java.util.ArrayList;
import java.util.List;

import SplitWiseDesignPattern.Users.User;

public class GroupController {
    
    List<GroupDetails> groupList;

    public GroupController() {
        groupList = new ArrayList<>();
    }

    public void createGroup(String groupId,String groupName, User createByUser){
            GroupDetails groupDetails = new GroupDetails();
            groupDetails.setGroupId(groupId);
            groupDetails.setGroupName(groupName);

            groupList.add(groupDetails);
    }

    public GroupDetails getGroup(String groupId){
        for(GroupDetails groupDetails : groupList){
            if (groupDetails.getGroupId().equals(groupId));
                    return groupDetails;
        }
        return null;
    }
       
    
}
