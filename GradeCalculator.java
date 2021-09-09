package new1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Temel maaşınızı giriniz:");
        Scanner scanner = new Scanner(System.in);


        int bazMaas = scanner.nextInt();
        double haftasonumesai = 0;
        double paidweek = 0;
        int haftaicimesai = 0;
        int haftasonusaat = 0;
        int permaas=0;
        double sonmaas;
        if (bazMaas < 1000) {
            System.out.println("Lütfen 1000 eurodan büyük bir değer giriniz");
            bazMaas = scanner.nextInt();
        }
        else {
            System.out.println("Haftaiçi kaç saat çalıştınız:");
            int haftaicisaat = scanner.nextInt();
            permaas = bazMaas / 40;
            if (haftaicisaat > 40) {
                haftaicimesai = haftaicisaat - 40;
                paidweek = haftaicimesai * 1.5 * permaas;
                System.out.println("Haftaiçi mesai ücretiniz:" + paidweek);

            }
            System.out.println("Haftasonu kaç saat çalıştınız:");
            haftasonusaat = scanner.nextInt();

            if (haftasonusaat > 0) {
                haftasonumesai = haftasonusaat * 2 * permaas;
                System.out.println("Haftasonu mesai ücretiniz:" + haftasonumesai);

            }
            if(haftaicisaat>40 && haftasonusaat>10){

                System.out.println("500 Euro prim kazandınız!" );
                sonmaas = (haftaicisaat*permaas) + paidweek + haftasonumesai + 500;
                System.out.println("Net maaşınız:" + sonmaas);
            }
            else{
            sonmaas = (haftaicisaat*permaas) + paidweek + haftasonumesai;

            System.out.println("Net maaşınız:" + sonmaas);
            }
        }
    }
}
