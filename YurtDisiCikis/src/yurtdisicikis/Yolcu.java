
package yurtdisicikis;

import java.util.Scanner;

public class Yolcu implements YurtDisiCikisKurallari{
   private int harc;
   private boolean siyasidurumu;
   private boolean vizedurumu;
   public Yolcu(){
       Scanner scanner=new Scanner(System.in);
       System.out.println("yatırdığınız harç bedeli : ");
       this.harc=scanner.nextInt();
       scanner.nextLine();
       System.out.println("herhangi bir siyasi yasağınız varmı?");
        String cevap=scanner.nextLine();
        if (cevap.equals("evet")) {
            this.siyasidurumu=true;
           
       }
        else{this.siyasidurumu=false;}
        
        System.out.println("vizeniz bulunuyor mu ?");
        String cevap1=scanner.nextLine();
         if (cevap1.equals("evet")) {
            this.vizedurumu=true;
           
       }
        else{this.vizedurumu=false;}
        
   }
    

    @Override
    public boolean yurtdisi_harciKontrol() {
        if (this.harc<15) {
            System.out.println("lütfen yurt dışı harcınızı tam yatırın");
       return false;
        }
        else{System.out.println("yurtdışı harcı işlemi tamam");
        return  true;}
    }

    @Override
    public boolean siyasi_yasakKontrol() {
        if (this.siyasidurumu==true) {
                 System.out.println("Siyasi yasağınız olduğundan yurtdışına çıkamazsınız");            
        return false;
            }
        else{System.out.println("siyasi yasağınız yokkkk yurtdışına çıkabilirsiniz");
        return true;}
    }

    @Override
    public boolean vize_durumKontrol() {
        if (this.vizedurumu==true) {System.out.println("vizeniz var yurt dışına çıkabilirsiniz.");
        return true;}
        
        else {System.out.println("vizeniz yok yurtdışına çıkamazsınız");
                return false;}    
        }
    }
    
    

