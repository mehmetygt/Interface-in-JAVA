
package yurtdisicikis;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        
        
        System.out.println("Sabiha Gökçen Hava Limanına Hoşgeldiniz");
        String sartlar="\t yurtdışı şıkış kuralları \n"
                + "- Herhangi bir siyasi yasağınızın bulunmaması gerekiyor \n"
                + "- 15 TL Harç bedelini tamamen yatırmanız gerekiyor \n"
                + "- Gideceğiniz ülkeye vizenizin olması gerekiyor";
       String mesaj="Yurtdışı çıkış koşullarınız hepsini sağlamanız gerekiyor";
       
        while (true) {  
            
            System.out.println("*******************");
            System.out.println(mesaj);
            System.out.println("********************");
            System.out.println(sartlar);
            
            
            Yolcu yolcu=new Yolcu();
            System.out.println("harç bedeli kontrol ediliyor");
            Thread.sleep(3000);
            if (yolcu.yurtdisi_harciKontrol()==false) {
                System.out.println(mesaj);
                continue;
                
                
            }
             System.out.println("siyasi durum kontrol ediliyor");
              Thread.sleep(3000);
            if (yolcu.siyasi_yasakKontrol()==false) {
                System.out.println(mesaj);
                continue;
                
            }
             System.out.println("vize durumu kontrol ediliyor");
              Thread.sleep(3000);
            if (yolcu.siyasi_yasakKontrol()==false) {
                System.out.println(mesaj);
                continue;
                
            }
            System.out.println("işlemleriniz tamam :) Yurtdışına çıkabilirsiniz");
            break;
            
        }

       
       
    }
    
}
