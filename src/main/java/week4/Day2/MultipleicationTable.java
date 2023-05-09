package week4.Day2;

public class MultipleicationTable {

    String multipleSymbol = "*"; // default

    public MultipleicationTable(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public static void main(String[] args) {

        MultipleicationTable multipleicationTable = new MultipleicationTable("x");
        for (int num = 2; num <= 9 ; num++) {
            multipleicationTable.printDan(num);
        }
    }
    public void printDan(int dan) {
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("%d %s %d = %d\n", dan , multipleSymbol , i , dan * i) ;
        }
        System.out.println("----------------------");
    }
}
