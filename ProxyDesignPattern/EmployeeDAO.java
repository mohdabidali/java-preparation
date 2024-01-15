package ProxyDesignPattern;

public interface EmployeeDAO {
  void create(String client, EmployeeDao obj)throws Exception;  
  void delete(String client, Integer employeeId)throws Exception;    
  EmployeeDao getClient(String client, Integer employeeId)throws Exception;      
}
