import java.io.*;
class preferences
{
    public static void pref() 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter percentage");
        int p=Integer.parseInt(br.readLine());
        System.out.println("The companies are:");
        System.out.println("1:Amazon");
        System.out.println("2:Adobe");
        System.out.println("3:Cisco");
        System.out.println("4:Google");
        int n;
        System.out.println("Enter number of preferences");
        n=Integer.parseInt(br.readLine());
        String s[]= new String[n+1];
        String str[]=new String[n+1];
        for(int i=1;i<s.length;i++)
        {
            System.out.println("Enter name of company "+i);
            s[i]=br.readLine();
        }
         for(int i=1;i<s.length;i++)
        {
           if(s[i].equals("Amazon"))
           {
               if(p>79&&p<101)
               {
               str[i]=s[i];
               break;
               }
           }
           if(s[i].equals("Adobe"))
           {
               if(p>69&&p<101)
               {
               str[i]=s[i];
               break;
               }
           }
           if(s[i].equals("Cisco"))
           {
               if(p>59&&p<101)
               {
               str[i]=s[i];
               break;
               }
           }
           if(s[i].equals("Google"))
           {
               if(p>89&&p<101)
               {
               str[i]=s[i];
               break;
               }
           }
        }
        int c=0;
         
        for(int i=1;i<s.length;i++)
        {
            if(str[i]!=null)
            {
                System.out.println("Company eligible for you is "+str[i]);
                c++;
                break;
                }
        }
        if(c==0)
        System.out.println(" No Company is eligible for you ");
        
               }
           }
        
/**
 * Write a description of class c here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class c
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class c
     */
    public c()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
