public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 25;
        int[] binary = new int[100];
        int index = 0;

        while (decimal > 0) {
            binary[index] = decimal % 2;
            decimal = decimal / 2;
            index++;

        }
        System.out.println("Binary ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

    }
}