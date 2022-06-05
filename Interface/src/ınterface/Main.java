
package ınterface;

public class Main{

    public static void main(String[] args) {
        
     /* ŞU İKİ kullanım yapılamaz: Ç ÜNKÜ İNTERFACELERDEN OBJE OLUŞTURAMAYIZ 
       IMuhendis munendis=new IMuhendis(true, true);
       PcMuhendis munendis=new IMuhendis(true, true);*/
     /* şu iki kullanım olur çünkü implement ettiği class  İÇİN eferans oluşturabilir,
        IMuhendis muhendis=new PcMuhendisi(true, false);
     
        PcMuhendisi muhendis=new PcMuhendisi(true, false);
        
        
        muhendis.askerlik_durumu_sorgula();
        muhendis.adli_sicil_sorgula();
        muhendis.mezuniyet_ortalaması(3.18); 
        
        String[] tecrubbbe={"softtec","intertech"};
        
        muhendis.is_tecrübesi(tecrubbbe);*/
     
     
     /*
     aşağıdaki gibi interface dışında bir method eklediğimizden, artıkaaşıdaki kullanımı yaparsak ek method hata verir
     
     IMuhendis muhendis=new MakineMuhendisi(true, false);*/
     
    MakineMuhendisi muhendis=new MakineMuhendisi(true, false);
      muhendis.askerlik_durumu_sorgula();
        muhendis.adli_sicil_sorgula();
        muhendis.mezuniyet_ortalaması(3.18); 
        
        String[] tecrubbbe={"softtec","intertech"};
        muhendis.is_tecrübesi(tecrubbbe);
        
        String[] referans={"ilhan aydın","rojhat toppp"};
        muhendis.refeerans_getir(referans); // burası hata verecektir
        //ikinci interfaceden implement edilen method;
        muhendis.calısıyormu();
     
        

    }
    
}
