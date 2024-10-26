import java.util.Scanner;
public class sayac {
    public static void main(String[] args) {
        // Kullanıcıdan cümle alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine();
        System.out.print("Saymak istediğiniz kelimeyi girin: ");
        String kelime = scanner.nextLine();
        // Cümleyi kelimelere bölme ve kelimeyi sayma
        String[] kelimeler = cumle.split(" ");
        int sayac = 0;
        for (String k : kelimeler) {
            if (k.equals(kelime)) {
                sayac++;
            }
        }
        // Sonucu gösterme
        System.out.println("Kelime cümlede " + sayac + " kez geçiyor.");
    }
}