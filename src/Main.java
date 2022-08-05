public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] weights = new int[12];
        weights[0] = 90;
        int janweight = weights[0];
        System.out.println(janweight);
        System.out.println(weights[0]);
        System.out.println(weights[11]);
        int jan = 0;
        System.out.println(weights[jan]);

        System.out.println();

        int [] a = new int [3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        System.out.println();

        double[] d = {1.57, 7.654, 9.986};
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
                System.out.println();

        double [] b = new double[3];
        b[0] = 100.54;
        b[1] = 21.43;
        b[2] = 10.9635213;
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
            if (i != d.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i != b.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = d.length-1; i >= 0; i--) {
            System.out.print(d[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = b.length-1; i >= 0; i--) {
            System.out.print(b[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1){
                a[i]++;
            }
            System.out.print(a[i]);
            if (i != a.length - 1){
                System.out.print(", ");
            }
            
        }


    }
}