
package ınterface;


public class PcMuhendisi implements IMuhendis{
    private boolean askerlik;
    private boolean sicil;

    public PcMuhendisi(boolean askerlik, boolean sicil) {
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
        System.out.println("şuralarda çalıştım : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
            
        }
    
}
