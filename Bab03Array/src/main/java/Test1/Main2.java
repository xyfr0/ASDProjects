package Test1;

public class Main2 {
    public static void main(String[] args) {
        String[][] data = new String[4][5];
        int sum = 0;
        System.out.println("Dimension 1: " + data.length);
        System.out.println("Dimension 2: " + data[0].length);

        data[0][0] = "1";
        data[0][1] = "2";
        data[0][2] = "3";
        data[0][3] = "4";
        data[0][4] = "5";
        data[1][0] = "1";
        data[1][1] = "2";
        data[1][2] = "3";
        data[1][3] = "4";
        data[1][4] = "5";
        data[2][0] = "1";
        data[2][1] = "2";
        data[2][2] = "3";
        data[2][3] = "4";
        data[2][4] = "5";
        data[3][0] = "1";
        data[3][1] = "2";
        data[3][2] = "3";
        data[3][3] = "4";
        data[3][4] = "5";

        for (String[] datum : data) {
            for (int j = 0; j < data[0].length; j++) {
                int num = Integer.parseInt(datum[j]);
                sum += num;
            }
        }

        System.out.println("Sum of all data is: " + sum);


    }
}
