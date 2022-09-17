public class Main {
    public static void main(String[] args) {


        int[] sayilar = new int[]{1, 2, 5, 9, 10};
        int aranacaksayi = 7;
        boolean varmi = false;

        for (int sayi : sayilar) {

            if (sayi == aranacaksayi) {

                varmi = true;
            }
        }
        if (varmi) {
            System.out.println(" sayı mevcuttur");
        }

        else {
            System.out.println("sayı mevcut değildir.");
        }

    }
}