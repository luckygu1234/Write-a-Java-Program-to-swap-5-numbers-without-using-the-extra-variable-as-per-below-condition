import java.util.Scanner;
class SwapNumber {
    public static void main(String[] args) {
        int a,b,c,d,e;
        System.out.print("Enter Input: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        e=s.nextInt();
        
        a=a+c;
        c=a-c;
        a=a-c;
        
        b=b+e;
        e=b-e;
        b=b-e;
        
        c=c+d;
        d=c-d;
        c=c-d;
        
        d=d+e;
        e=d-e;
        d=d-e;
        System.out.print(a+" "+b+" "+c+" "+d+" "+e);
    }
}



