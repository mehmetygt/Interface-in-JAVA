
public class SignUpManager {
    
    private IUserCheckService iUserCheckService;
    
    public SignUpManager(IUserCheckService iUserCheckService){
    this.iUserCheckService=iUserCheckService;}
    
    
    
    public void signUp(User user){
        if (iUserCheckService.CheckUser(user)) {
            System.out.println("kullanıcı kayıt oldu : "+user.getName()); 
            
        }
        else{   System.out.println("kullanıcı kayıt olamdaı");}
   }
   
  
}
