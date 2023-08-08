import java.io.*;
public class Electrical
{
  public static void elec()throws IOException 
  {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int age,c,c1;
     long phone_n;
     String name;
     int p,pref;
     int cnt=0;
     System.out.println((char)10102 +"Signal processing "+"\n");
     System.out.println((char)10103+" Telecommunications engineering "+"\n");
     System.out.println((char)10104+" Instrumentation engineering"+"\n");
     System.out.println("");
     System.out.println((char)10048+ " Select your choice");
     c1=Integer.parseInt(br.readLine());
     switch (c1)
     {
       case 1:
       System.out.println("\f");
       System.out.println("Available options");
       System.out.println((char)10102+" Kontech Consultants");
       System.out.println((char)10103+" Emotix");
       System.out.println((char)10104+" Cruise Automation ");
       System.out.println("");
       System.out.println((char)10048+" Enter your percentage");
       p=Integer.parseInt(br.readLine());
       pref=preferences1.pref(p);
       if(pref==1)
       { 
        System.out.println("\f");
        System.out.println("Congragulations!! You have been shortlisted for an personal interview in Kontech Consultants on the 18th. Your reference card is attached to this");
        System.out.println("Adress: Pune, Maharashtra");
        System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
       }
       if(pref==2)
       {
        System.out.println("\f");
        System.out.println("Congragulations!! You have been shortlisted for an personal interview in  Emotix on the 18th. Your reference card is attached to this");
        System.out.println("Adress: Mumbai,Maharashtra");
        System.out.println("Approximate pacakge: Rs 4 Lakh only");
        break;
       }
       if(pref==3)
       {
        System.out.println("\f");
        System.out.println("Congragulations!! You have been shortlisted for an personal interview in Cruise Automation on the 18th. Your reference card is attached to this");
        System.out.println("Adress: San Francisco ");
        System.out.println("Approximate pacakge: Rs 2.5 Lakh only");break;
       }
       else 
        System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
       break;
       case 2:
       System.out.println("Available options");
       System.out.println((char)10102+" Ericsson");
       System.out.println((char)10103+" Cyient Limited");
       System.out.println((char)10104+" Orange Business Services");
       System.out.println("");
       System.out.println((char)10048+" Enter your percentage");
       p=Integer.parseInt(br.readLine());
       pref=preferences1.pref(p);
       if(pref==1)
       {
         System.out.println("\f");
         System.out.println("Congragulations!! You have been shortlisted for an personal interview in Ericsson on the 18th. Your reference card is attached to this");
         System.out.println("Adress: Bengaluru,Karnataka");
         System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
       }
       if(pref==2)
       { 
         System.out.println("\f");
         System.out.println("Congragulations!! You have been shortlisted for an personal interview in Cyient Limited on the 18th. Your reference card is attached to this");
         System.out.println("Adress: Hyderabad,Telangana");
         System.out.println("Approximate pacakge: Rs 4 Lakh only");
         break;
        }
       if(pref==3)
       {
         System.out.println("\f");
         System.out.println("Congragulations!! You have been shortlisted for an personal interview in Orange Business Services on the 18th. Your reference card is attached to this");
         System.out.println("Adress: Mumbai,Maharashtra");
         System.out.println("Approximate pacakge: Rs 2.5 Lakh only");break;
       }
       else 
         System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
       break;
       case 3:
       System.out.println("Available options");
       System.out.println((char)10102 +"Linde Engineering North America Inc");
       System.out.println((char)10103+" Cudeco Limited");
       System.out.println((char)10104+" Continental");
       System.out.println("");
       System.out.println((char)10048+" Enter your percentage");
       p=Integer.parseInt(br.readLine());
       pref=preferences1.pref(p);
       if(pref==1)
       { 
        System.out.println("\f");
        System.out.println("Congragulations!! You have been shortlisted for an personal interview in Linde Engineering North America Inc on the 18th. Your reference card is attached to this");
        System.out.println("Adress: Tulsa, USA");
        System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
       }
       if(pref==2)
       {
        System.out.println("\f");
        System.out.println("Congragulations!! You have been shortlisted for an personal interview in Cudeco Limited on the 18th. Your reference card is attached to this");
        System.out.println("Adress: Western Queensland,Australia");
        System.out.println("Approximate pacakge: Rs 4 Lakh only");
        break;
       }
       if(pref==3)
       { 
        System.out.println("\f");
        System.out.println("Congragulations!! You have been shortlisted for an personal interview in Continental on the 18th. Your reference card is attached to this");
        System.out.println("Adress: Germany");
        System.out.println("Approximate pacakge: Rs 2.5 Lakh only");
       }
       else 
        System.out.println("Your percentage is too low ! You are not eligible for any job.  You can enquire directly from the company's website by using the reference ID on the company's website");
       break;
       default:
       System.out.println("Invalid input");
       cnt++;
       break;
     }
  }
}