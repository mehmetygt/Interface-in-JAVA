
public interface InterfaceDetay {
    
 //private int a=5;  //  böyle bir kullanım interface te olmaz
 
    public  int a=5; // bu kullanım kabul edilir 

//public  int a;  
 /* bu kullanım da kabul edilmez çünnkü sonradan müdahale edip dğer veremeyiz
özellik oluşturulurken değeri kesinlikle veril melidir*/
  
  public final int b=6;// public olduktan sonra final ile de özellik kullanılabilir
  
  public final int c=7;// public olduktan sonra static ile de özellik kullanılabilir
  
  public static final int d=8;// public olduktan sonra static ve final özellik kullanılabilir
  /*
  interface ten nesne oluşturamadığımızdan psvm de bu özellikleri direk interface ismi ile çağırabilirizz_erişebiliriz
  */
  
  
  public  static void yaz(){
  /* normalde interfacelere gövdelimethod yazılamaz çünkü çağrılabilmesi için 
      önce nesne oluşturulmalıdır ve interfacelerden nesne  direk oluşturulamamaktadır.
      Ama Static metodlar ı çağırmada nesneye gerek olmadığından interface adı ile
      kullanabildiğimiz için interface'e yazılabilir*/
  
      System.out.println("Benim adım InterfaceDetay");
  
  
  
  }
  
}
