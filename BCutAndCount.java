import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        Program obj = new Program();
        obj.find(s,n);
    }
}
class Program{
    String arr[];
    void find(String S, int n){
        arr = S.split("");
        int temp,max_diff = Integer.MIN_VALUE;
        for(int i = 1;i<n;i++){
            temp = sep(i,n);
            max_diff = temp>max_diff?temp:max_diff;
        }
        System.out.println(max_diff);
    }
    int sep(int l, int n){
        HashSet<String> left = new HashSet<String>();
        HashSet<String> right = new HashSet<String>();
        for(int i=0;i<l;i++) left.add(arr[i]);
        for(int i=l;i<n;i++) right.add(arr[i]);
        int same = 0;
        for(String var:left){
            if (right.contains(var)) same++;
        } 
        System.out.println((left.size()-same)+" "+(right.size()-same));
        return Math.min(left.size()-same,right.size()-same);
    }
}