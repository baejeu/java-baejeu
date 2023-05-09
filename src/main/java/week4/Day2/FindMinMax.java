package week4.Day2;
abstract class MaxMinAbstract {
    abstract boolean MaxOrMin(int val1, int val2);
}
class FindMax extends MaxMinAbstract {

    @Override
    boolean MaxOrMin(int val1, int val2) {
        if (val1 < val2) {
            return true;
        }
        return false;
    }
}
class FindMin extends MaxMinAbstract {

    @Override
    boolean MaxOrMin(int val1, int val2) {
        if (val1 > val2) {
            return true;
        }
        return false;
    }


}
public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,2,6,9,8,7,14,0};
        boolean flag = true; // true 면 min false 면 max
        System.out.printf("최솟값은 %d 입니다." ,(findResult(arr, flag))); // min  0
        flag = false;
        System.out.printf("최대값은 %d 입니다." ,(findResult(arr, flag))); // max  0
    }

    static int findResult(int[] arr, boolean flag){
        int answer = arr[0];
        MaxMinAbstract maxMin = flag ? new FindMin() : new FindMax(); //

        for (int i = 0; i < arr.length-1; i++) {
            if(maxMin.MaxOrMin(answer, arr[i+1])){
                answer = arr[i+1];
            }
        }
        return answer;
    }
}