package odev;

public class UserManager {
	public void add(User user) {
        System.out.println(user.getFirstname() + " " + user.getLastname() + " adlı kullanıcı eklendi.");
    }
	
	public void addMultiple(User[] users) {
        for (User user : users) {

            add(user);
            
        }
        	
        }
        	
        public void delete(User user) {
        	System.out.println(user.getFirstname() + " " + user.getLastname() + " adlı kullanıcı eklendi.");
        }
        
        
        public void deleteMultiple(User[] users) {
        	for (User user : users) {
        		delete(user);
        		
        	}
        }
        
        

}
