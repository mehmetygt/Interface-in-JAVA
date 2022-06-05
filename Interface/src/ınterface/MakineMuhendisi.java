
package ınterface;


public class MakineMuhendisi implements IMuhendis,ICalısma{
    /*BURADA görüldüğü gibi bir class iki interfaceten implement edebilir ama ikisinin de methodlarını almak zorunda*/
 private boolean askerlik;
    private boolean sicil;

    public MakineMuhendisi(boolean askerlik, boolean sicil) {
        this.askerlik = askerlik;
        this.sicil = sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik) {
            System.out.println("askerlik yaptım");
            
        }
        else{System.out.println("henüz askerlik yapmadım");}
    }

    @Override
    public String mezuniyet_ortalaması(double derece) {
        return "ortalama : "+derece;
    }

    @Override
    public void adli_sicil_sorgula() {
         if (askerlik) {
            System.out.println("sicil kaydım var");
            
        }
        else{System.out.println("sicil kaydım yok");}
    }

    @Override
    public void is_tecrübesi(String[] array) {
        if (array.length==0) {
            System.out.println("iş tecrübem yok");
        }else{
            System.out.println("şuralarda çalıştım: ");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
                
            }
}
 
        }
    
       /* burada görüldüğü gibi implement ettiğimiz interface ,n methodları dışında methodlarda ekleyip kullanabiliyoruz
    ama aiterface referans olursa bu method çalışmaz */
   
    public void refeerans_getir(String[] array){
       if (array.length==0) {
            System.out.println("referansım yok");
        }else{
            System.out.println("referanslarım: ");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
                
            }
}}

    @Override// ICalışmadan implement edilen method
    public void calısıyormu() {
        System.out.println("bu mühendis çalışıyor");
    }
    
}
