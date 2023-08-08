import java.io.*;
public class telecom
{
public static void tele()throws IOException 
                  {
                      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      int age,c,c1;
                long phone_n;
                    String name;
                               int p,pref;
                               int cnt=0;
                  System.out.println((char)10102+" Telecom Researcher. "+"\n");
                  System.out.println((char)10103+" Network Designer."+"\n");
                  System.out.println((char)10104+" Radio Frequency Engineer"+"\n");
                  System.out.println("");
                  System.out.println((char)10048+" Select your choice _");
                  c1=Integer.parseInt(br.readLine());
                  
                  switch (c1)
                  {
                      case 1: 
                       System.out.println("\f");
                      System.out.println(" Available Options --"+"\n");
                      System.out.println((char)10102+" Verizon Communications Inc. , New York  "+"\n");
                      System.out.println((char)10103+" Vodaphone, Delhi"+"\n");
                      System.out.println((char)10104+" China Mobile, Bangalore "+"\n");
                      System.out.println((char)10048+" Enter your percentage ");
                      p=Integer.parseInt(br.readLine());
                      pref=preferences1.pref(p);
                      if (pref==1)
                      { System.out.println("\f");
                      System.out.println("Congratulations ! You have been shortlisted for an personal interview in Verizon Communications on the 18th. Your refference card is attached herewith."+"\n");
                      System.out.println("Adress : Verizon Communications's Indian Headquarters, Delhi.");
                      System.out.println(" Approximate package: Rs. 15 Lakh only");break;
                    }
                    if (pref==2){ System.out.println("\f");
                    System.out.println("Congratulations ! You have been shortlisted for an personal interview in Vodaphone  on the 18th. Your refference card is attached herewith."+"\n");
                      System.out.println("Adress : Vodaphone Headquarters, rajaganj, Delhi");
                      System.out.println(" Approximate package: Rs. 13 Lakh only");break;
                    }
                   if (pref==3){ System.out.println("\f");
                    System.out.println("Congratulations ! You have been shortlisted for an personal interview in China Mobile Limited on the 18th. Your refference card is attached herewith."+"\n");
                      System.out.println("Adress : China Mobile Headquarters, Pune.");
                      System.out.println(" Approximate package: Rs 10 Lakh only");break;
                    }
                     else 
                     System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
                      break;
                      case 2:
                       System.out.println("\f");
                      System.out.println(" Available Options --"+"\n");
                      System.out.println((char)10102+" Verizon communications , New York   "+"\n");
                      System.out.println((char)10103+" Vodaphone, Delhi"+"\n");
                      System.out.println((char)10104+" China Mobile Limited , Hyderabad "+"\n");
                      System.out.println((char)10048+" Enter your percentage ");
                      p=Integer.parseInt(br.readLine());
                      pref=preferences1.pref(p);
                      if (pref==1)
                      { System.out.println("\f");
                      System.out.println("Congratulations ! You have been shortlisted for an personal interview in Verizon communications  on the 18th. Your refference card is attached herewith."+"\n");
                      System.out.println("Adress : Verizon communications  Private Limited Headquarters, Chandni Chowk,  , Delhi.");
                      System.out.println(" Approximate package: Rs. 15 Lakh only");break;
                    }
                    if (pref==2){ System.out.println("\f");
                    System.out.println("Congratulations ! You have been shortlisted for an personal interview in Vodaphone on the 18th. Your refference card is attached herewith."+"\n");
                      System.out.println("Adress : Vodaphone Headquarters,Thane, Mumbai");
                      System.out.println(" Approximate package: Rs. 10 Lakh only");break;
                    }
                   if (pref==3){ System.out.println("\f");
                    System.out.println("Congratulations ! You have been shortlisted for an personal interview in China Mobile Limited  on the 18th. Your refference card is attached herewith."+"\n");
                      System.out.println("Adress : China Mobile Limited Office ,MG Road, Gali -5 , Hyderabad.");
                      System.out.println(" Approximate package: Rs 8 Lakh only");break;
                    }
                     else 
                     System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
                    break;  
                      case 3:
                       System.out.println("\f");
                      System.out.println(" Available Options --"+"\n");
                      System.out.println((char)10102+" Verizon communications  , Austrailia  "+"\n");
                      System.out.println((char)10103+" Vodaphone , Delhi"+"\n");
                      System.out.println((char)10104+" Gickonicks, Hyderabad "+"\n");
                      System.out.println((char)10048+" Enter your percentage ");
                      p=Integer.parseInt(br.readLine());
                      pref=preferences1.pref(p);
                      if (pref==1)
                      { System.out.println("\f");
                      System.out.println("Congratulations ! You have been shortlisted for an personal interview in Verizon communications  on the 18th. Your refference card is attached herewith."+"\n");
                      System.out.println("Adress : Verizon communications  headquarters ,South Delhi.");
                      System.out.println(" Approximate package: Rs. 10 Lakh only");break;
                    }
                    if (pref==2){ System.out.println("\f");
                    System.out.println("Congratulations ! You have been shortlisted for an personal interview in Vodaphone on the 18th. Your refference card is attached herewith."+"\n");
                      System.out.println("Adress :  Vodaphone,South Mumbai");
                      System.out.println(" Approximate package: Rs. 8 Lakh only");break;
                    }
                   if (pref==3){ System.out.println("\f");
                    System.out.println("Congratulations ! You have been shortlisted for an personal interview in Gickonicks on the 18th. Your refference card is attached herewith."+"\n");
                      System.out.println("Adress :Gickonicks,Nizam road, Hyderabad .");
                      System.out.println(" Approximate package: Rs 6 Lakh only");break;
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