
public class AgeUserCheckService implements IUserCheckService{
    // Method

  
    @Override
    public boolean CheckUser(User user){
        if (user.getAge()>=18) {
            return true;
            
        }
        else{
        return false;
        }
    }


}
