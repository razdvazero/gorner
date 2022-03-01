public class gorner {
//16 вариант

    public static void main (String [] args) {

        double[][] twoDimArray = new double[8][7];
        //ввод коэффициентов из уравнения
        twoDimArray[0][0]=0;twoDimArray[0][1]=1.213;twoDimArray[0][2]=-0.216;twoDimArray[0][3]=1.316;twoDimArray[0][4]=-2.758;
        twoDimArray[0][5]=3.612;twoDimArray[0][6]=-0.388;

        //промежуток с 0.5 до 2
        double start=0.25;
        for (int i = 1; i < 8; i++) {
            start=start+0.25;
            twoDimArray[i][0]=start;
            twoDimArray[i][1]=twoDimArray[0][1]; // в таблице горнера 2 столбец имеет одинаковые значения
        }

        //заполнение таблицы:
        for (int i = 1; i < 8; i++) {
            for (int j = 2; j < 7; j++) {
                twoDimArray[i][j]=twoDimArray[i][j-1]*twoDimArray[i][0]+twoDimArray[0][j];
            }
            System.out.println();
        }

        //вывод всей таблицы
        System.out.println("Вывод таблицы горнера Однако:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println(i);
                System.out.println(657);
                System.out.println(228);
                System.out.println(228222);
                System.out.print(" " + String.format("%.3f",twoDimArray[i][j])+ " ");
            }
            System.out.println();
        }

        //вывод ответа
        System.out.println("Вывод ответа:");
        for (int i = 0; i < 8; i++) {
                System.out.print(" " + String.format("%.3f",twoDimArray[i][0])+ " " + String.format("%.3f",twoDimArray[i][6])+ " "); //вывод элемента
            System.out.println();
        }
    }
}
