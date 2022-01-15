public class Main {
    public static void main(String[] args) {

        int counter = 0;
        int a = 0;

        while (counter < 2) {
            //Checking if two numbers are friendly numbers
            for (int i = a - 1; i > 1; i--) {
                if (sumOfDividers(a) == i && sumOfDividers(i)==a) {
                    System.out.println("-----------------------------");
                    System.out.println("Bölenleri Toplamı:(X: " + sumOfDividers(a) + " Y: " + sumOfDividers(i) + ")");
                    System.out.println("X Sayısı:  " + a + " Y Sayısı: " + i);
                    System.out.println("-----------------------------");
                    counter++;
                    System.out.println(counter);
                }
                //Ending loop
                if(counter==2)
                {
                    break;
                }
            }
            a++;
        }
    }

    //Finding sum of dividers
    public static int sumOfDividers(int a) {
        int sum = 0;
        for (int i = a - 1; i > 0; i--) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
