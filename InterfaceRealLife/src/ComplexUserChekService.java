
public class ComplexUserChekService implements IUserCheckService{

    @Override
    public boolean CheckUser(User user) {
     
        if (user.getAge()>=18&& user.getName().startsWith("m")) {
            return true;
            
        }
        else{
        return false;
        }
     }
    }
    
     
