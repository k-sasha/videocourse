package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771777));
    }
    public static int count7(int n){
        int d = n%10;
        int counter=0;
        if(d==7) { counter++;}
        if(n<10){return counter;}
        return counter + count7((n-d)/10);
    }
}
