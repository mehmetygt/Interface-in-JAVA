
public class Main {
    public static void main(String[] args) {
        SignUpManager signUpManager=new SignUpManager(new AgeUserCheckService());
        signUpManager.signUp(new User(1, "ahmet", 18));
  
        SignUpManager signUpManager1=new SignUpManager(new ComplexUserChekService());
        signUpManager1.signUp(new User(2, "mehmet", 19));
    }

   
    }
    

