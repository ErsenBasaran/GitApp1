import org.w3c.dom.ls.LSOutput;

public class Runner {
    public static void main(String[] args) {

        // versiyon 1
        System.out.println("helloGIT");
        System.out.println("git add . TÜM komutları staging areaya alır ");
        // terminale git add . yazdım. komutları staging area'ya almış oldum

        // terminale git status yazınca hangi komut working space'te hangisi staging area'da hangisi commit'te gösterir
        // terminalde bu noktada kırmızı klasör görünüyorsa onu da staging area'ya almak için şunu yaparız:
        // terminale git add ve dosyanın adını uzantısıyla yazarız
        // örnek : git add src/main/java/Runner.java
        // böylece bu dosyayı da staging are'ya aldık

        // terminali temizlemek için cls yazarız. bu sadece görüntü olarak temizler
        // önceki komutlarımız geçerliliğini korur

// git commit -m"v1" yazarsak commit area'ya gönderir

        // Version2
        System.out.println("git commit -m\"\" ile versiyon oluşturulur");

                // git log yazarsak oluşturulma tarihini saatini maili vs gösterir terminalde


      //versiyon 2
                System.out.println("hi");

                /*
                git log --oneline yazarak versiyonları görüntüleriz
                yeni bir versiyon eklemek için önce git add . sonra
                git commit -m"v2" yazarız (v2 yerine başka bir versiyon da seçilebilir)
                bunu kısaca yapmak için git commit -m"v2" yazabiliriz tek seferde
                 */

        // versiyon 3
        System.out.println("ana");

// versiyon 4
        System.out.println("ccc");


    }
}
