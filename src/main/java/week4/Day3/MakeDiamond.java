package week4.Day3;

import java.util.*;
public class MakeDiamond {
    String blank = " ";
    MakeDiamond(String blank){
        this.blank = blank;
    }
    public static void main(String[] args) {

        MakeDiamond makeDiamond = new MakeDiamond("#");
        int height = 5;
        int pivot = height / 2;

        for (int i = 0; i < height ; i++) {
            if (i <= pivot) {
                System.out.printf("%s",makeDiamond.blank.repeat(pivot-i) );
                System.out.printf("%s", "*".repeat((i*2)+1));
                System.out.println();
            }
            else{ // i=4~6
                System.out.printf("%s", makeDiamond.blank.repeat(i-pivot) );
                System.out.printf("%s","*".repeat(height- ((i-pivot)*2) ));
                System.out.println();

            }
        }
    }
}
/*




 */