import java.util.ArrayList;
public class summer_41{
    public static int SortMergelist(ArrayList<Integer> a,ArrayList<Integer> b){
        int c=0,d=0;
        ArrayList<Integer> mergelist = new ArrayList<Integer>();
                for(int i=0;i<a.size()-1;i++){
            for(int j=0; j<a.size()-i-1;j++){
                if(a.get(j)>a.get(j+1)){
                    int hold=a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, hold);
                }
            }
        }
        System.out.println("Sorted List 1: "+a);
        for(int i=0;i<b.size()-1;i++){
            for(int j=0; j<b.size()-i-1;j++){
                if(b.get(j)>b.get(j+1)){
                    int hold=b.get(j);
                    b.set(j, b.get(j+1));
                    b.set(j+1, hold);
                }
            }
        }
        System.out.println("Sorted List 2: "+b);
        while(c<a.size()&&d<b.size()){
            if(a.get(c)<=b.get(d)){
                mergelist.add(a.get(c));
                c++;  
            }else{
                mergelist.add(b.get(d));
                d++;      
            }
        }
        while(c<a.size()){
            mergelist.add(a.get(c));
            c++;
        }
        while(d<b.size()){
            mergelist.add(b.get(d));
            d++;
        }
        System.out.println("Merged List: "+mergelist);
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<Integer>();
        ArrayList<Integer> list2= new ArrayList<Integer>();
        int a=(int)(Math.random()*10+1),b=(int)(Math.random()*10+1);
        for(int i=0;i<a;i++){
            list1.add((int)(Math.random()*10+1));
        }
        for(int i=0;i<b;i++){
            list2.add((int)(Math.random()*10+1));
        }
        System.out.println("List 1: "+list1);
        System.out.println("List 2: "+list2);

        SortMergelist(list1, list2);
    }
}