import java.io.*;
 public class Aeronautical
 {
     public static void aeronaut()throws IOException 
                  {
                      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      int age,c,c1;
                      long phone_n;
                      String name;
                      int p,pref;
       
                    int cnt=0;
                   
                       System.out.println((char)10102+" Airframe "+"\n");
                       System.out.println((char)10103+" Engine / Propulsion"+"\n");
                       System.out.println((char)10104+" Avionics"+"\n");
                 
                        System.out.println("");
                           System.out.println((char)10048+" Select your choice");
                          c1=Integer.parseInt(br.readLine());
                         switch (c1)
                         {
                         case 1:
                      System.out.println("\f");
                          System.out.println("Available options"+"\n");
                          System.out.println((char)10102+"Hindustan Aeronautics Limited"+"\n");
                          System.out.println((char)10103+"United State Air Force"+"\n");
                          System.out.println((char)10104+"Freelancer"+"\n");
                          System.out.println("");
                          System.out.println((char)10048+" Enter your percentage");
                           p=Integer.parseInt(br.readLine());
                            pref=preferences1.pref(p);
                          if(pref==1)
                          {System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Hindustan Aeronautics Limited on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Bengaluru,Karnataka");
                              System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
                            }
                          else if(pref==2)
                          {System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in United State Air Force on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: United States");
                              System.out.println("Approximate pacakge: Rs 4 Lakh only");break;}
                              
                           else if(pref==3)
                             {System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Freelancer Subham Kumar1 on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: East Singhbhum,Jharkand");
                              System.out.println("Approximate pacakge: Rs 2.5 Lakh only");break;
                            }
                             else 
                     System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
                            
                        
                      case 2:
                      System.out.println("\f");
                          System.out.println("Available options"+"\n");
                          System.out.println((char)10102+"VTOL AVIATION INDIA PRIVATE LIMITED"+"\n");
                          System.out.println((char)10103+"Liquid Propulsion Systems Centre - India"+"\n");
                          System.out.println((char)10104+"Skyroot");
                          System.out.println("");
                          System.out.println((char)10048+" Enter your percentage");
                           p=Integer.parseInt(br.readLine());
                            pref=preferences1.pref(p);
                          if(pref==1)
                          {System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in VTOL AVIATION INDIA PRIVATE LIMITED on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Navi Mumbai,Mumbai");
                              System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
                            }
                          else if(pref==2)
                          {System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Liquid Propulsion Systems Centre - India on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Thiruvananthapuram, Kerala");
                              System.out.println("Approximate pacakge: Rs 4 Lakh only");break;}
                              
                           else if(pref==3)
                             {System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Skyroot on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Hyderabad, Telangana");
                              System.out.println("Approximate pacakge: Rs 2.5 Lakh only");break;
                            }
                             else 
                    System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
                            break;
                        
                      case 3:
                      System.out.println("\f");
                            System.out.println("Available options"+"\n");
                          System.out.println((char)10102+"Toogit"+"\n");
                          System.out.println((char)10103+"Freelancer Suheb Ahamd"+"\n");
                          System.out.println((char)10104+"Omnidyne Systems Pvt. Ltd."+"\n");
                          System.out.println("");
                          System.out.println((char)10048+" Enter your percentage");
                           p=Integer.parseInt(br.readLine());
                            pref=preferences1.pref(p);
                          if(pref==1)
                          {System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Toogit on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Pune, Maharashtra");
                              System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
                            }
                          else if(pref==2)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Freelancer Suheb Ahamd on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Ratnagiri, Maharashtra");
                              System.out.println("Approximate pacakge: Rs 4 Lakh only");break;}
                              
                           else if(pref==3)
                             {System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Omnidyne Systems Pvt. Ltd. on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Ahmedabad, Gujarat");
                              System.out.println("Approximate pacakge: Rs 2.5 Lakh only");break;
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