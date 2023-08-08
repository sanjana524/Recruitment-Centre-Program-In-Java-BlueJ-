import java.io.*;
public class IT
{
   public static  void info_tech()throws IOException 
   {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int age,c,c1;
     long phone_n;
     String name;
     int p,pref;
     int cnt=0;
     System.out.println((char)10102+" UX Analyst ");
     System.out.println((char)10103+" Multimedia Programmer");
     System.out.println((char)10104+" Networking Professional   ");
     System.out.println("");
     System.out.println((char)10048+" Select your choice _");
     c1=Integer.parseInt(br.readLine());
     switch (c1)
     {
       case 1: 
       System.out.println("\f");
       System.out.println(" Available Options --"+"\n");
       System.out.println((char)10102+" Oracle Corporation, New York  "+"\n");
       System.out.println((char)10103+" IBM, Delhi"+"\n");
       System.out.println((char)10104+"Infosys , Pune "+"\n");
       System.out.println((char)10048+"Enter your percentage ");
       p=Integer.parseInt(br.readLine());
       pref=preferences1.pref(p);
       if (pref==1)
       { 
        System.out.println("\f");
        System.out.println("Congratulations ! You have been shortlisted for an personal interview in Oracle Corporation on the 18th. Your refference card is attached herewith."+"\n");
        System.out.println("Adress : Oracle Corporation's Indian Headquarters, Delhi.");
        System.out.println(" Approximate package: Rs. 15 Lakh only");break;
       }
       if (pref==2)
       { 
        System.out.println("\f");
        System.out.println("Congratulations ! You have been shortlisted for an personal interview in IBM  on the 18th. Your refference card is attached herewith."+"\n");
        System.out.println("Adress : IBM Headquarters, rajaganj, Delhi");
        System.out.println(" Approximate package: Rs. 13 Lakh only");break;
       }
       if (pref==3)
       { 
        System.out.println("\f");
        System.out.println("Congratulations ! You have been shortlisted for an personal interview in Infosys on the 18th. Your refference card is attached herewith."+"\n");
        System.out.println("Adress : Infosys, Pune.");
        System.out.println(" Approximate package: Rs 10 Lakh only");break;
       }
       else 
        System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
       break;
       case 2:
       System.out.println("\f");
       System.out.println(" Available Options --"+"\n");
       System.out.println((char)10102+" Microsoft Corporation, New York   "+"\n");
       System.out.println((char)10103+" Galaxo Smile, Delhi"+"\n");
       System.out.println((char)10104+" Merck & Co. , Hyderabad "+"\n");
       System.out.println((char)10048+" Enter your percentage ");
       p=Integer.parseInt(br.readLine());
       pref=preferences1.pref(p);
       if (pref==1)
       { 
         System.out.println("\f");
         System.out.println("Congratulations ! You have been shortlisted for an personal interview in Microsoft Corporation on the 18th. Your refference card is attached herewith."+"\n");
         System.out.println("Adress : Microsoft Corporation Private Limited Headquarters, Chandni Chowk,  , Delhi.");
         System.out.println(" Approximate package: Rs. 15 Lakh only");
         break;
       }
       if (pref==2)
       { 
         System.out.println("\f");
         System.out.println("Congratulations ! You have been shortlisted for an personal interview in Galaxo Smile on the 18th. Your refference card is attached herewith."+"\n");
         System.out.println("Adress : Galaxo Smile Headquarters,Thane, Mumbai");
         System.out.println(" Approximate package: Rs. 7 Lakh only");
         break;
       }
       if (pref==3)
       {
         System.out.println("\f");
         System.out.println("Congratulations ! You have been shortlisted for an personal interview in Merck & Co.  on the 18th. Your refference card is attached herewith."+"\n");
         System.out.println("Adress : Merck & Co. Office ,Laxmi Road, Gali -5 , Pune.");
         System.out.println(" Approximate package: Rs 6 Lakh only");break;
       }
       else 
        System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
       break;
       case 3:
       System.out.println("\f");
       System.out.println(" Available Options --"+"\n");
       System.out.println((char)10102+" VMware , Austrailia  "+"\n");
       System.out.println((char)10103+" Galaxo International , Delhi"+"\n");
       System.out.println((char)10104+" Gickonicks, Hyderabad "+"\n");
       System.out.println((char)10048+" Enter your percentage ");
       p=Integer.parseInt(br.readLine());
       pref=preferences1.pref(p);
       if (pref==1)
       {
         System.out.println("\f");
         System.out.println("Congratulations ! You have been shortlisted for an personal interview in VMware on the 18th. Your refference card is attached herewith."+"\n");
         System.out.println("Adress : VMware headquarters ,South Delhi.");
         System.out.println(" Approximate package: Rs. 10 Lakh only");break;
       }
       if (pref==2)
       {
        System.out.println("\f");
        System.out.println("Congratulations ! You have been shortlisted for an personal interview in Galaxo International on the 18th. Your refference card is attached herewith."+"\n");
        System.out.println("Adress :  Galaxo International,South Mumbai");
        System.out.println(" Approximate package: Rs. 9 Lakh only");break;
       }
       if (pref==3)
       { 
        System.out.println("\f"); System.out.println("\f");
        System.out.println("Congratulations ! You have been shortlisted for an personal interview in Gickonicks on the 18th. Your refference card is attached herewith."+"\n");
        System.out.println("Adress :Gickonicks,Nizam road, Hyderabad .");
        System.out.println(" Approximate package: Rs 8 Lakh only");break;
       }
       else 
         System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
       break;
       default:
       System.out.println("Invalid input");
       cnt++;
       break;
     }
   }
}
                  
            