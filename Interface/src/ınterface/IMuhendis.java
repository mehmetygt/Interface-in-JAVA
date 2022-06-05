
package ınterface;

public interface IMuhendis {
  /*--interface oluşturulurken class değil inter face seçiyoruz
    --interfaceler metodların sadece tanımını barındırıır gövdeyi kalıtım verdiği class doldururr
    --bir nrvi method taslağı bulundurur
    --kalıtım alan classta mutlaka interface in bütün methodları bulunur
    ama clasllar ek method da kullanabilirler
    --interfaceteki methodlarda erişimbelirleyici yazılmaz
    
 */   
    
    void askerlik_durumu_sorgula();
    String mezuniyet_ortalaması(double derece);
    void adli_sicil_sorgula();
    void is_tecrübesi(String[] array);
}
