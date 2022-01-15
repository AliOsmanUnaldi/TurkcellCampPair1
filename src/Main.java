public class Main {
    public static void main(String[] args) {
        int cntr = 0;
        int a = 200;

        while (cntr < 2) {
            //System.out.println(a+"***");
            for (int i = a - 1; i > 1; i--) {
                if (asal(a) == i && asal(i)==a) {
                    System.out.println("-----------------------------");
                    System.out.println("Bölenleri Toplamı:(X: " + asal(a) + " Y: " + asal(i) + ")");
                    System.out.println("X Sayısı:  " + a + " Y Sayısı: " + i);
                    System.out.println("-----------------------------");
                    cntr++;
                    System.out.println(cntr);
                }
                if(cntr==2)
                {
                    break;
                }
            }
            a++;
        }


        //System.out.println("2620:"+asal(2620)+" 2924:"+asal(2924));
    }



    public static int asal(int a) {
        int top = 0;
        for (int i = a - 1; i > 0; i--) {
            if (a % i == 0) {
                top += i;
            }
        }
        return top;
    }

}
