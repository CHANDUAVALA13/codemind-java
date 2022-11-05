import java.util.Scanner;
class Area
{
    public static void main(String args[])
    
    {
        float area,s;
        int n1,n2,n3;
        Scanner sc= new Scanner (System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        s=(float)(n1+n2+n3)/2;
        area=(float)Math.sqrt(s*(s-n1)*(s-n2)*(s-n3));
        System.out.format("%.2f",area);
    }
}