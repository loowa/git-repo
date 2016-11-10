/**
 * Created by Фролагин Андрей on 10.11.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        String str = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";
        try {
            System.out.println("Конечный результат: " + doResult(doMatrix(str)));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
    public static String[][] doMatrix(String str) throws ArrayIndexOutOfBoundsException {
        String[][] matrix = new String[4][4];
        String[] arrStr1 = str.split("\n");
        try {
            for (int i = 0; i < matrix.length; i++) {
                String[] arrStr2 = arrStr1[i].split(" ");
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = arrStr2[j];
                }
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Из данной строки не удасться создать матрицу 4x4");
        }
        return matrix;
    }
    public static double doResult(String[][] matrix) throws NumberFormatException{
        double result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    result = result + Integer.valueOf(matrix[i][j]);
                }
                catch (NumberFormatException e){
                    throw new NumberFormatException("Не удаеться преобразовать строку в число.");
                }
            }
        }
        return result/2;
    }
}


