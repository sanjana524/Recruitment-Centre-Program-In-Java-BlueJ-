import java.io.*;
class Name
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter your full name");
        String s=br.readLine();
        int c=s.indexOf(' ');
        String str=s.substring(0,c);
        int c1=s.lastIndexOf(' ');
        String str1=s.substring((c1+1),s.length());
        System.out.println(str+" "+str1);
    }
}