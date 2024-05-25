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

        // versiyon 3
        System.out.println("ana");

/*
var olan commitleri görmek için git log --oneline yazarız
çıkan yazıda HEAD aktif commiti gösterir
yeni eklemek için önce git add . sonra git commit -m"v3" yazarız. v3 ismi değişkendir
bu eklemeyi tek hamlede yapmak için git commit -am"v3" yazabilirdik
 */
/*
git log --oneline yazınca commitlerin hash numaraları çıkar. bu numaraları kullabiliriz
mesele git checkout 4f5b5c2 yazarsam v1'e gider.
bu sırada son yazdıklarımızı commitlemeişsek son versiyona dönsek bile
commitlrnmemiş veriler gelmez
 */

        /*
        git reset --hard 4f5b5c2 yazarsak v1'e kadar olan tüm aradaki commitler
        SİLİNİR VE GERİ GELMEZ
         */

        /*
        git remote add origin https://github.com/ErsenBasaran/GitApp1.git
yazıp githubımdaki bir repository dosyamı burası ile tanıştırdım
         */
        /*
        sonra git push yazıyoruz. kabul etmeyip öneri veriyor.
        verdiği öneri:  git push --set-upstream origin master
        bunu yazınca kabul ediyor. bundan sonraki pushlarda sadece git push yazmak yetecek
         böylece gitgub repomuza bu dosyayı eklemiş olduk.
         */
// git log --oneline yazınca hem HEAD hem origin/master aynı
        // origin/master: github'daki versiyon
        //versiyon 6
        System.out.println("githubdan sonraki ilk versiyon");

    }
}
