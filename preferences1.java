import java.io.*;
class preferences1
{
    public static int pref(int p)throws IOException
    {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of preferences");
        n=Integer.parseInt(br.readLine());
        int s[]= new int[n+1];
        int s1[]=new int[n+1];
        for(int i=1;i<s.length;i++)
        {
            System.out.println("Enter the serial  number of the  company which is your preference no.  "+i);
            s[i]=Integer.parseInt(br.readLine());
        }
         for(int i=1;i<s.length;i++)
        {
           if(s[i]==1)
           {
               if(p>79&&p<101)
               {
                 s1[i]=s[i];
                 return s[i];
               }
           }
           if(s[i]==2)
           {
               if(p>69&&p<101)
               {
                 s1[i]=s[i];
                 return s[i];
               }
           }
           if(s[i]==3)
           {
               if(p>59&&p<101)
               {
                 s1[i]=s[i];
                 return s[i];
               }
           }
           
        }
        return 0;
    }
}
         
        
        
               
       
        