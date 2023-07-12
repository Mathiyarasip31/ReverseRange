import java.util.Scanner;
class Reverse
{
    void rev_value(int array[],int n,int b,int c){
        int temp=0;
        while(b<c)
        {
            temp=array[b];
            array[b]=array[c];
            array[c]=temp;
            b++;
            c--;
        }
        System.out.println("Array after reversing: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
    }
}

public class ReverseRange{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        Reverse reverse=new Reverse();
        reverse.rev_value(array,n,b,c);

    }
}