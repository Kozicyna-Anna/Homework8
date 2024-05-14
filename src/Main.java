import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nTask1");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] good = {1.57, 7.654, 9.986};
        int[] big = new int[]{2147, 3521, 6521};

        System.out.println("\nTask2");

        for (int i = 0; i < weight.length; i ++) {
                System.out.print(weight [i]);
                if (i < weight.length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = 0; i < good.length; i ++){
                System.out.print(good [i]);
                if (i < good.length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = 0; i < big.length; i ++){
                System.out.print(big [i]);
                if (i < big.length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println();

        System.out.println("\nTask3");

            for (int i = weight.length - 1; i >= 0; i--) {
                System.out.print(weight[i] + "," );
            }
            System.out.println();
            for (int i = good.length - 1; i >= 0; i--) {
                System.out.print(good[i] + ",");
            }
            System.out.println();
            for (int i = big.length - 1; i >= 0; i--) {
                System.out.print(big[i] + ",");
            }
            System.out.println();

            System.out.println("\nTask4");

                for (int i = 0; i < weight.length; i++) {
                    if (weight[i] % 2 != 0) {
                        weight[i] = weight[i] + 1;
                    }
                }
                        System.out.println(Arrays.toString(weight));

                    }
                }
















