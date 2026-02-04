import java.util.Scanner;

public class Sieve {
    public static void main(String[] args){
        boolean[] numbers;
        Scanner in = new Scanner(System.in);
        System.out.println("What is the upper limit of the sieve?");
        int n = in.nextInt();
        numbers = new boolean[n+1];
        for (int i=2; i < numbers.length; i++){
            numbers[i] = true;
        }
        for (int j = 2; (j*j) <= n; j++){
            if(numbers[j]){
                for (int k = (j*j); (long)k <= n; k+=j){
                    
                    numbers[k] = false;
                    
                }
            }
        }
        for (int q = 0; q < numbers.length; q++){
            if (numbers[q]){
                System.out.println(q + " ");
            }
        }
    }
}
