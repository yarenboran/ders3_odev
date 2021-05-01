package odev;

public class UserManager {
	public void add(User user) {
        System.out.println(user.getFirstname() + " " + user.getLastname() + " adlý kullanýcý eklendi.");
    }
	
	public void addMultiple(User[] users) {
        for (User user : users) {

            add(user);
            
        }
        	
        }
        	
        public void delete(User user) {
        	System.out.println(user.getFirstname() + " " + user.getLastname() + " adlý kullanýcý silindi.");
        }
        
        
        public void deleteMultiple(User[] users) {
        	for (User user : users) {
        		delete(user);
        		
        	}
        }
        
        

}
