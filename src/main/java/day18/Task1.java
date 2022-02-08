package day18;

public class Task1 {
    public static void main(String[] args) {
       int [] numbers =  {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
       int n=0;
       System.out.println(recursionSum(numbers,n));
    }

    public static int recursionSum(int [] numbers, int n){
        int sum = numbers[n];
        if(n==numbers.length-1) return sum;
        return sum+recursionSum(numbers,n+1);
    }
}
