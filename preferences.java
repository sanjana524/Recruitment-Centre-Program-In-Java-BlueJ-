import java.io.*;
class preferences
{
    public static void pref()throws IOException
    {
        int n,p=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of preferences");
        n=Integer.parseInt(br.readLine());
        int s[]= new int[n+1];
        int s1[]=new int[n+1];
        for(int i=1;i<s.length;i++)
        {
            System.out.println("Enter number of company "+i);
            s[i]=Integer.parseInt(br.readLine());
        }
         for(int i=1;i<s.length;i++)
        {
           if(s[i]==1)
           {
               if(p>79&&p<101)
               {
               s1[i]=s[i];
               break;
               }
           }
           if(s[i]==2)
           {
               if(p>69&&p<101)
               {
               s1[i]=s[i];
               break;
               }
           }
           if(s[i]==3)
           {
               if(p>59&&p<101)
               {
               s1[i]=s[i];
               break;
               }
           }
           if(s[i]==4)
           {
               if(p>89&&p<101)
               {
               s1[i]=s[i];
               break;
               }
           }
        }
        int c=0;
         
        for(int i=1;i<s.length;i++)
        {
            if(s1[i]!=0)
            {
                System.out.println("Company eligible for you is company no.  "+s1[i]);
                System.out.println();
                c++;
                break;
                }
        }
        if(c==0)
        System.out.println(" No Company is eligible for you ");
        
               }
           }
        