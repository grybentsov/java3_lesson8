package ru.geekbrains.java3_lesson8;

// 1 Задать размерность матрицы от 5 до 7
// 2 Создать матрицу с указанной размерностью
// 3 Заполнить матрицу по спирали (числа увеличиваются на 1)
// (число начинается с 1)

public class MainClass {
    private static void fillMatrix (int column, int line){
        int[][] myArray = new int[column][line];
        int a = 0, b = 0, c = 1;

        while (c + 1 < column * line) {
            while ((b + 1) < line && myArray[a][b + 1] == 0) { // заполнение направо
                myArray[a][b++] = c++;
            }
            while ((a + 1) < column && myArray[a + 1][b] == 0) { // вниз
                myArray[a++][b] = c++;
            }
            while (b > 0 && myArray[a][b - 1] == 0) {           // налево
                myArray[a][b--] = c++;
            }
            while (myArray[a - 1][b] == 0) {                    // вверх
                myArray[a--][b] = c++;
            }
        }

        for (int x = 0; x < column; x++) {          // заполнение последней ячейки матрицы
            for (int y = 0; y < line; y++) {
                if (myArray[x][y] == 0) myArray[x][y] = c;
            }
        }

        for (int x = 0; x < column; x++) {          // вывод результата работы метода
            for (int y = 0; y < line; y++) {
                System.out.print(myArray[x][y] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        fillMatrix(5, 7);
    }
}