package week4.Day1;

public class SumOfFactorsTest {
    public static void main(String[] args) {

        SumMeasureMethod sumMeasureMethod = new SumMeasureMethod();

        System.out.println("12의 약수는 = " +sumMeasureMethod.sumOfFactors(12));
        System.out.println("36의 약수는 = " +sumMeasureMethod.sumOfFactors(36));
        System.out.println("48의 약수는 = " +sumMeasureMethod.sumOfFactors(48));
        System.out.println("29의 약수는 = " +sumMeasureMethod.sumOfFactors(29));


    }
}
