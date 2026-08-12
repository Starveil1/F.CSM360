import java.math.BigInteger;
import java.util.Scanner;
public class summer_43{
    public static void Fibonacci(long n) {
        BigInteger a=BigInteger.ONE,b=BigInteger.ONE,c;
        for(long i=0;i<n;i++){
            System.out.print(a+" ");
            c=a.add(b);
            a=b;
            b=c;
        }
    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Эхний хэдэн тооны фибоначи тоог хэвлэх вэ? ");
        long n = sc.nextLong();
        Fibonacci(n);
        sc.close();
    }
}