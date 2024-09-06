import java.util.Scanner;

public class seleksiprakerin {
    public static void main(String[] args) {
        String nama,kelas,prilaku;
        int nilai;

        Scanner s = new Scanner (System.in);
        System.out.print("nama: ");
        nama =s.next();
        System.out.print("kelas X,XI,XII: ");
        kelas = s.next();
        if(kelas.equalsIgnoreCase("XII")){
            System.out.print("perilku siswa (baik/buruk)");
            prilaku= s.next();
            if(prilaku.equalsIgnoreCase("baik")){
                System.out.print("nilai siswa: ");
                nilai=s.nextInt();
                if(nilai>=85){
                    System.out.println(nama + " dinyatakan lulus prakerin");
                }else {
                    System.out.println("maaf anda tidak lulus karena nilai");
                }
            }else{
                System.out.println("maaf anda gagal karena perilaku");
            }
        }else{
            System.out.println("maaf anda gagal karena bukan kelas XII");
        }
    }
}
