package ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDAO {
 EmployeeDAO employeeDAO;
 
 EmployeeDaoProxy(){
    employeeDAO =new EmployeeDAOImpl();
 }

public void create(String client, EmployeeDao obj)throws Exception{
    if (client.equals("ADMIN")){
        employeeDAO.create(client, obj);
        return;
    }
    throw new Exception("Access Denied");
}
 public void delete(String client, Integer employeeId)throws Exception{
    if(client.equals("ADMIN")){
        employeeDAO.delete(client, employeeId);
        return;
    }
    throw new Exception("Access Denied");
 }
 public EmployeeDao get(String client, Integer employeeId)throws Exception{ 
if(client.equals("ADMIN")|| client.equals("USER")){
 return employeeDAO.getClient(client, employeeId);
}
throw new Exception("Access Denied");
}
