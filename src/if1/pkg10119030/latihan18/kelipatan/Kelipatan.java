package if1.pkg10119030.latihan18.kelipatan;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :
 */
public class Kelipatan {
    static double kelipatan = 3.5;
    
    private static void tampilKelipatan(){
        for(int i = 0; i < 9; i++){
            kelipatan += 3.5;
            System.out.println(kelipatan);
        }
    }
    public static void main(String[] args) {
        tampilKelipatan();
        System.out.println ("Developed by : Rendy Dermawan");
    }
}