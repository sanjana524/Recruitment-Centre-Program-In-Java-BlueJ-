import java.io.*;
public class agriculture1
{
  public static void agri()throws IOException 
   {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String nm[]=new String[3];
     int age,c,c1;
     long phone_n;
     String name;
     int pref;
     int p;
     int cnt=0;
     System.out.println((char)10102 +" Irrigation Engineer ");
     System.out.println((char)10103 +" Farm Power and Machinery Engineer ");
     System.out.println((char)10104+" Researcher ");
     System.out.println("");
     System.out.println((char)10048+"Select your choice _");
     c1=Integer.parseInt(br.readLine());
     switch (c1)
     {
       case 1: 
       System.out.println("\f");
       System.out.println(" Available Options --"+"\n");
       System.out.println((char)10102+" Gen Irrigation, Austrailia  "+"\n");
       System.out.println((char)10103 +" Plasto Irrigation, Delhi"+"\n");
       System.out.println((char)10104+" Mahindra Irrigation, Hyderabad "+"\n");
       System.out.println((char)10048+"Enter your percentage "+"\n");
       p=Integer.parseInt(br.readLine());
       pref=preferences1.pref(p);
       if (pref==1)
       {
         System.out.println("\f");
         System.out.println("Congratulations ! You have been shortlisted for an personal interview in Gen Irrigation on the 18th. Your refference card is attached herewith."+"\n");
         System.out.println("Adress : Gen Headquarters( BASED IN Austrailia), Chandni Chowk, Gali -5 , Delhi.");
         System.out.println(" Approximate package: Rs. 5 Lakh only");
         break;
       }
       if (pref==2)
       {
         System.out.println("\f");
         System.out.println("Congratulations ! You have been shortlisted for an personal interview in Plasto Irrigation on the 18th. Your refference card is attached herewith."+"\n");
         System.out.println("Adress : Plasto Headquarters(BASED IN Delhi),Thane, Mumbai");
         System.out.println(" Approximate package: Rs. 4 Lakh only");break;
       }
       if (pref==3)
       {
         System.out.println("\f");
         System.out.println("Congratulations ! You have been shortlisted for an personal interview in Mahindra Irrigation on the 18th. Your refference card is attached herewith."+"\n");
         System.out.println("Adress : Sector ,Laxmi Road, Gali -5 , Pune.");
         System.out.println(" Approximate package: Rs 3 Lakh only");break;
       }
       if(pref==0)
         System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
       break;
       case 2:
       System.out.println("\f");
       System.out.println(" Available Options --"+"\n");
       System.out.println((char)10102+" John Dere, Austrailia  "+"\n");
       System.out.println((char)10103 +" Tafe, Delhi"+"\n");
       System.out.println((char)10104+" Sriraj, Hyderabad "+"\n");
       System.out.println((char)10048+"Enter your percentage ");
       p=Integer.parseInt(br.readLine());
       pref=preferences1.pref(p);
       if (pref==1)
       {
         System.out.println("\f");
         System.out.println("Congratulations ! You have been shortlisted for an personal interview in John Dere on the 18th. Your refference card is attached herewith."+"\n");
         System.out.println("Adress : John Dere Headquarters(BASED IN Austrailia), Chandni Chowk, Gali -5 , Delhi."+"\n");
         System.out.println(" Approximate package: Rs. 8 Lakh only");break;
       }
       if (pref==2)
       {
         System.out.println("\f");
         System.out.println("Congratulations ! You have been shortlisted for an personal interview in Tafe on the 18th. Your refference card is attached herewith."+"\n");
         System.out.println("Adress : Tafe Headquarters(BASED IN Delhi),Thane, Mumbai"+"\n");
         System.out.println(" Approximate package: Rs. 7 Lakh only");break;
       }
       if (pref==3)
       {
         System.out.println("\f");
         System.out.println("Congratulations ! You have been shortlisted for an personal interview in Sriraj on the 18th. Your refference card is attached herewith."+"\n");
         System.out.println("Adress : Sector ,Laxmi Road, Gali -5 , Pune.");
         System.out.println(" Approximate package: Rs 6 Lakh only");break;
       }
       else 
        System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
       break;
       case 3:
       System.out.println("\f");
       System.out.println(" Available Options --");
       System.out.println((char)10102+" S & C Reserch Company, Austrailia  "+"\n");
       System.out.println((char)10103 +" Nagarjuna Agroresearch, Delhi"+"\n");
       System.out.println((char)10104+" Hi-tech R&D, Hyderabad "+"\n");
       System.out.println((char)10048+"Enter your percentage ");
       p=Integer.parseInt(br.readLine());
       pref=preferences1.pref(p);
       if (pref==1)
       {
         System.out.println("\f");
         System.out.println("Congratulations ! You have been shortlisted for an personal interview in S& C Research Company on the 18th. Your refference card is attached herewith."+"\n");
         System.out.println("Adress : s&c Headquarters(BASED IN Austrailia), Chandni Chowk, Gali -5 , Delhi."+"\n");
         System.out.println(" Approximate package: Rs. 10 Lakh only");break;
       }
       if (pref==2)
       {
        System.out.println("\f");
        System.out.println("Congratulations ! You have been shortlisted for an personal interview in Nagarjuna on the 18th. Your refference card is attached herewith."+"\n");
        System.out.println("Adress : Nagarjuna Headquarters(BASED IN Delhi),Thane, Mumbai");
        System.out.println(" Approximate package: Rs. 9 Lakh only");break;
       }
       if (pref==3)
       {
         System.out.println("\f");
         System.out.println("Congratulations ! You have been shortlisted for an personal interview in Hi-tech R&D on the 18th. Your refference card is attached herewith."+"\n");
         System.out.println("Adress : Sector ,Laxmi Road, Gali -5 , Pune."+"\n");
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