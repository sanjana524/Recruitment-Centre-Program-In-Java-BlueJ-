import java.io.*;
public class environment
{
  public static void envi()throws IOException 
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int age,c,c1;
    long phone_n;
    String name;
    int  p,pref;
    int cnt=0;
    System.out.println((char)10102+" Wastewater / Storm Water Collection System Engineer  "+"\n");
    System.out.println((char)10103+" Payroll Manager  ."+"\n");
    System.out.println((char)10104+" Senior Vehicle Integration Engineer ");
    System.out.println("");
    System.out.println((char)10048+"Select your choice _");
    c1=Integer.parseInt(br.readLine());
    switch (c1)
    {
      case 1: 
      System.out.println("\f");
      System.out.println(" Available Options --");
      System.out.println((char)10102+" Golder Associates., Vienna  ");
      System.out.println((char)10103+" Enviro Analysts, Mumbai");
      System.out.println((char)10104+" ERM , Pune ");
      System.out.println((char)10048+"Enter your percentage ");
      p=Integer.parseInt(br.readLine());
      pref=preferences1.pref(p);
      if (pref==1)
      { 
       System.out.println("\f");
       System.out.println("Congratulations ! You have been shortlisted for an personal interview in Golder  Associates on the 18th. Your refference card is attached herewith.");
       System.out.println("Adress : Golder  Associates's Indian Headquarters, Delhi.");
       System.out.println(" Approximate package: Rs. 12 Lakh only");break;
      }
      if (pref==2)
      {
        System.out.println("\f");
        System.out.println("Congratulations ! You have been shortlisted for an personal interview in Enviro Analysts   on the 18th. Your refference card is attached herewith."+"\n");
        System.out.println("Adress : Enviro Analysts  Headquarters, rajaganj, Delhi");
        System.out.println(" Approximate package: Rs. 10 Lakh only");break;
      }
      if (pref==3)
      {
       System.out.println("\f");
       System.out.println("Congratulations ! You have been shortlisted for an personal interview in ERM Limited on the 18th. Your refference card is attached herewith."+"\n");
       System.out.println("Adress : ERM Headquarters, Pune.");
       System.out.println(" Approximate package: Rs 7 Lakh only");break;
      }
      else 
       System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
      break;
      case 2:
      System.out.println("\f");
      System.out.println(" Available Options --"+"\n");
      System.out.println((char)10102+" Golder  Associates , New York   "+"\n");
      System.out.println((char)10103+" Enviro Analysts , Delhi"+"\n");
      System.out.println((char)10104+" ERM Limited , Hyderabad "+"\n");
      System.out.println((char)10048+"Enter your percentage ");
      p=Integer.parseInt(br.readLine());
      pref=preferences1.pref(p);
      if (pref==1)
      { 
       System.out.println("\f");
       System.out.println("Congratulations ! You have been shortlisted for an personal interview in Golder  Associates  on the 18th. Your refference card is attached herewith."+"\n");
       System.out.println("Adress : Golder  Associates  Private Limited Headquarters, Chandni Chowk,  , Delhi.");
       System.out.println(" Approximate package: Rs. 13 Lakh only");break;
      }
      if (pref==2)
      {
       System.out.println("\f");
       System.out.println("Congratulations ! You have been shortlisted for an personal interview in Enviro Analysts  on the 18th. Your refference card is attached herewith."+"\n");
       System.out.println("Adress : Enviro Analysts  Headquarters,Thane, Mumbai");
       System.out.println(" Approximate package: Rs. 8 Lakh only");break;
      }
      if (pref==3)
      {
       System.out.println("\f");
       System.out.println("Congratulations ! You have been shortlisted for an personal interview in ERM Limited  on the 18th. Your refference card is attached herewith."+"\n");
       System.out.println("Adress : ERM Limited Office ,MG Road, Gali -5 , Hyderabad.");
       System.out.println(" Approximate package: Rs 5 Lakh only");break;
      }
      else 
       System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
      break;  
      case 3:
      System.out.println("\f");
      System.out.println(" Available Options --"+"\n");
      System.out.println((char)10102+" Golder  Associates  , Austrailia  "+"\n");
      System.out.println((char)10103+" Enviro Analysts  , Delhi"+"\n");
      System.out.println((char)10104+" Gickonicks, Hyderabad "+"\n");
      System.out.println((char)10048+"Enter your percentage ");
      p=Integer.parseInt(br.readLine());
      pref=preferences1.pref(p);
      if (pref==1)
      {
       System.out.println("\f");
       System.out.println("Congratulations ! You have been shortlisted for an personal interview in Golder  Associates  on the 18th. Your refference card is attached herewith."+"\n");
       System.out.println("Adress : Golder  Associates  headquarters ,South Delhi.");
       System.out.println(" Approximate package: Rs. 8 Lakh only");break;
      }
      if (pref==2)
      {
       System.out.println("\f");
       System.out.println("Congratulations ! You have been shortlisted for an personal interview in Enviro Analysts  on the 18th. Your refference card is attached herewith."+"\n");
       System.out.println("Adress :  Enviro Analysts ,South Mumbai");
       System.out.println(" Approximate package: Rs. 6 Lakh only");break;
      }
      if (pref==3)
      {
       System.out.println("\f");
       System.out.println("Congratulations ! You have been shortlisted for an personal interview in ERMon the 18th. Your refference card is attached herewith."+"\n");
       System.out.println("Adress :Gickonicks,Nizam road, Hyderabad .");
       System.out.println(" Approximate package: Rs 5 Lakh only");break;
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