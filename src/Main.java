public class Main {
    public static void main(String[] args) {
        int[] array = new int[30];
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000) + 100000;
            int min = array[0];
            int max = array[0];
            if (min > array[i]) min = array[i];
            else if (max < array[i]) max = array[i];
            double sum=0;
            sum += array[i];
            if (i == array.length-1) {
                System.out.println("Сумма трат за месяц составила: " + sum + " рублей. ");
                System.out.println("Минимальная сумма трат за день составила " + min + "рублей.");
                System.out.println("Максимальная сумма трат за день составила " + max + " рублей ");
                System.out.println("Средняя сумма трат за месяц составила: " + sum / 30 + " рублей. ");
            }
        }
    }

    {

        // задача 2 {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for  (int i = reverseFullName.length - 1; i > -1 ; i --) {
            System.out.print(reverseFullName[i]);}
    }
}