import java.util.*;
class duplicatecountarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        //finding max;
        Arrays.sort(arr);
        int max=arr[n-1];
        //finding count array
        int c[]=new int[max+1];
        for(int i=0;i<n;i++)
        c[arr[i]]++;
        System.out.println(Arrays.toString(c));
        //finding duplicate values
        System.out.println("duplicate values");
        for(int i=0;i<max+1;i++)
        {
            if(c[i]>1)
            System.out.print(i+" ");
        }
    }
}