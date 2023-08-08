import java.io.*;
class Reverse
{
    public static void main (String args[]) throws IOException
    {
      int n[]=new int[5];
      int rev[]=new int[n.length];
      BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
      for(int i=0;i<n.length;i++)
      {
          System.out.println("Enter a number");
          n[i]=Integer.parseInt(br.readLine());
          
        }
        int c=rev.length-1;
        for(int j=0;j<rev.length;j++)
          {
              rev[j]=n[c];
              c--;
            }
        System.out.println("Reverse elements of the Array");
        for(int i=0;i<rev.length;i++)
        {
            System.out.println(rev[i]);
        }
       
    }
}