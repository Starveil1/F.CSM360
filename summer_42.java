import java.util.ArrayList;
import java.util.Scanner;
public class summer_42 {
    public static int RotateList(ArrayList<Integer> list1){
        int m=0,l=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements to rotate: ");
        int n = sc.nextInt();
        for(int i=0;i<n/2;i++){
            int hold=list1.get(i);
            list1.set(i,list1.get(n-l-1));
            list1.set(n-l-1,hold);
            l++;
        }
        for(int i=n;i<n+(list1.size()-n)/2;i++){
            int hold=list1.get(i);
            list1.set(i,list1.get(list1.size()-m-1));
            list1.set(list1.size()-m-1,hold);
            m++;
        }
        for(int i=0;i<list1.size()/2;i++){
            int hold=list1.get(i);
            list1.set(i,list1.get(list1.size()-i-1));
            list1.set(list1.size()-i-1,hold);
        }
        System.out.println("Rotated List: "+list1);
        sc.close();
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<Integer>();
        int a=(int)(Math.random()*6+3);
        for(int i=0;i<a;i++){
            list1.add((int)(Math.random()*10+1));
        }
        System.out.println("List 1: "+list1);
        RotateList(list1);
    }
}
