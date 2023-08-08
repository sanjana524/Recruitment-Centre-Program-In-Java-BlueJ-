import java.io.*;
public class medical
{
  public  static void medi()throws IOException 
  {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int age,c,c1;
     long phone_n;
     String name;
     int p,pref;
     int cnt=0;     
     System.out.println((char)10102+" Medical Technology developer "+"\n");
     System.out.println((char)10103+" Medi-tech Supervisor "+"\n");
     System.out.println((char)10104+" Hospital Management  "+"\n");
     System.out.println("");
     System.out.println((char)10048+"Select your choice _");
     c1=Integer.parseInt(br.readLine());
     switch (c1)
     {
        case 1: 
        System.out.println("\f");
        System.out.println(" Available Options --");
        System.out.println((char)10102+" Novartis, Austrailia  "+"\n");
        System.out.println((char)10103+" Johnson & Johnson, Delhi"+"\n");
        System.out.println((char)10104+" Noble Hospital , Pune "+"\n");
        System.out.println((char)10048+"Enter your percentage ");
        p=Integer.parseInt(br.readLine());
        pref=preferences1.pref(p);
        if (pref==1)
        {
          System.out.println("\f");
          System.out.println("Congratulations ! You have been shortlisted for an personal interview in Novartis on the 18th. Your refference card is attached herewith."+"\n");
          System.out.println("Adress : Novartis Headquarters, Chandni Chowk, Gali -5 , Delhi.");
          System.out.println(" Approximate package: Rs. 15 Lakh only");break;
        }
        if (pref==2)
        { 
          System.out.println("\f");
          System.out.println("Congratulations ! You have been shortlisted for an personal interview in Johnson & Johnson  on the 18th. Your refference card is attached herewith."+"\n");
          System.out.println("Adress : Johnson & Johnson Headquarters,Thane, Mumbai");
          System.out.println(" Approximate package: Rs. 13 Lakh only");break;
        }
        if (pref==3)
        {
          System.out.println("\f");
          System.out.println("Congratulations ! You have been shortlisted for an personal interview in Noble Hospital on the 18th. Your refference card is attached herewith."+"\n");
          System.out.println("Adress : Noble Hosital  ,Magarpatta City, Gali -5 , Pune.");
          System.out.println(" Approximate package: Rs 10 Lakh only");break;
        }
        else 
          System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
        break; 
        case 2:
        System.out.println("\f");
        System.out.println(" Available Options --"+"\n");
        System.out.println((char)10102+" Amgen Private Limited, Austrailia  "+"\n");
        System.out.println((char)10103+" Galaxo Smile, Delhi"+"\n");
        System.out.println((char)10104+" Merck & Co. , Hyderabad ");
        System.out.println((char)10048+"Enter your percentage ");
        p=Integer.parseInt(br.readLine());
        pref=preferences1.pref(p);
        if (pref==1)
        { 
          System.out.println("\f");
          System.out.println("Congratulations ! You have been shortlisted for an personal interview in Amgen Private Limited on the 18th. Your refference card is attached herewith."+"\n");
          System.out.println("Adress : Amgen Private Limited Headquarters, Chandni Chowk, Gali -5 , Delhi.");
          System.out.println(" Approximate package: Rs. 8 Lakh only");break;
        }
        if (pref==2)
        { 
          System.out.println("\f");
          System.out.println("Congratulations ! You have been shortlisted for an personal interview in Galaxo Smile on the 18th. Your refference card is attached herewith."+"\n");
          System.out.println("Adress : Galaxo Smile Headquarters,Thane, Mumbai");
          System.out.println(" Approximate package: Rs. 7 Lakh only");break;
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
        System.out.println(" Available Options --");
        System.out.println((char)10102+" Cleveland & co. Hospital , Austrailia  "+"\n");
        System.out.println((char)10103+" Oswald International Hospital, Delhi"+"\n");
        System.out.println((char)10104+" Ramanujan General Services, Hyderabad "+"\n");
        System.out.println((char)10048+"Enter your percentage ");
        p=Integer.parseInt(br.readLine());
        pref=preferences1.pref(p);
        if (pref==1)
        { 
          System.out.println("\f");
          System.out.println("Congratulations ! You have been shortlisted for an personal interview in Cleveland & co. Hospital on the 18th. Your refference card is attached herewith."+"\n");
          System.out.println("Adress : Cleveland & co. Hospital ,South Delhi.");
          System.out.println(" Approximate package: Rs. 10 Lakh only");break;
        }
        if (pref==2)
        { 
          System.out.println("\f");
          System.out.println("Congratulations ! You have been shortlisted for an personal interview in  Oswald International Hospital on the 18th. Your refference card is attached herewith."+"\n");
          System.out.println("Adress :  Oswald International Hospital,South Mumbai");
          System.out.println(" Approximate package: Rs. 9 Lakh only");break;
        }
        if (pref==3)
        {
          System.out.println("\f");
          System.out.println("Congratulations ! You have been shortlisted for an personal interview in Ramanujan General Services on the 18th. Your refference card is attached herewith."+"\n");
          System.out.println("Adress : Ramanujan General Services, Hyderabad .");
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