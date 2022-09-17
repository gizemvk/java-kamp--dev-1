public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2, 2.5, 3.4, 8.7};
        double total = 0;
        double max = myList[0];
        double min = myList[0];

        for (double number : myList) {

            if (max < number) {
                max = number;
            }
            if (min > number) {

                min = number;
            }
            total = total + number;


            System.out.println(number);

        }
        System.out.println("Sayıların toplamı:" + total);
        System.out.println("En büyük sayı:" + max);
        System.out.println("En küçük sayı:" + min);

    }
}