package VetorMultidimensional;

public class Exemplo1 {
    public static void main(String[] args) {
        int array[][] = new int[6][10];
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                array[i][y] = y + 1;
                System.out.print(array[i][y] + " ");
            }
            System.out.println("");
        }
    }
}
