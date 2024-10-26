import java.util.Scanner;

public class buyuk {
    public static void main(String[] args) {
        // Kullanıcıdan cümle alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine();

        // Cümleyi büyük harfe çevirme
        String buyukCumle = cumle.toUpperCase();

        // Sonucu gösterme
        System.out.println("Büyük harflerle cümle: " + buyukCumle);
    }
}