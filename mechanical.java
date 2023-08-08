 import java.io.*;
 public class mechanical
 {
     public static void mecha()throws IOException 
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age,c,c1;
        long phone_n;
                    String name;
                               int p,pref;
                                  int cnt=0;
                  System.out.println((char)10102+" Acoustical Engineering"+"\n");
                  System.out.println((char)10103+" Manufacturing Engineering"+"\n");
                  System.out.println((char)10104+" Thermal Engineering"+"\n");
                  
                  System.out.println("");
                  System.out.println((char)10048+"Select your choice");
                  c1=Integer.parseInt(br.readLine());
                  switch(c1)
                  {
                      case 1:
                       System.out.println("\f");
                          System.out.println("Available options"+"\n");
                          System.out.println((char)10102+" Hankard Environmental, Inc."+"\n");
                          System.out.println((char)10103+" Cirrus Logic"+"\n");
                          System.out.println((char)10104+" Zebra Technologies"+"\n");
                          System.out.println("");
                          System.out.println((char)10048+" Enter your percentage");
                           p=Integer.parseInt(br.readLine());
                            pref=preferences1.pref(p);
                          if(pref==1)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Hankard Environmental, Inc. on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Madison,US");
                              System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
                            }
                           if (pref==2)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Cirrus Logic on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Mesa,US");
                              System.out.println("Approximate pacakge: Rs 4 Lakh only");break;}
                              
                           if (pref==3)
                             { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Zebra Technologies on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress:  Holtsville,US");
                              System.out.println("Approximate pacakge: Rs 2.5 Lakh only");break;
                            }
                             else 
                   System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
                            break;
                        
                      case 2:
                       System.out.println("\f");
                          System.out.println("Available options"+"\n");
                          System.out.println((char)10102+" The Nature's Bounty Co."+"\n");
                          System.out.println((char)10103+" Fairbanks Morse Engine"+"\n");
                          System.out.println((char)10104+" The Gluten Free Baking Co."+"\n");
                          System.out.println("");
                          System.out.println((char)10048+"Enter your percentage");
                           p=Integer.parseInt(br.readLine());
                            pref=preferences1.pref(p);
                          if(pref==1)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in The Nature's Bounty Co. on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Bohemia, New York");
                              System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
                            }
                          else if (pref==2)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Fairbanks Morse Engine on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Beloit, Wisconsin");
                              System.out.println("Approximate pacakge: Rs 4 Lakh only");break;}
                              
                           else if (pref==3)
                             { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in The Gluten Free Baking Co. on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Tualatin, Oregon");
                              System.out.println("Approximate pacakge: Rs 2.5 Lakh only");break;
                            }
                             else 
                   System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
                            break;
                        
                      case 3:
                       System.out.println("\f");
                            System.out.println("Available options"+"\n");
                          System.out.println((char)10102+" Cisco Systems"+"\n");
                          System.out.println((char)10103+" Harris"+"\n");
                          System.out.println((char)10104+" Universal Laser Systems");
                          System.out.println("");
                          System.out.println((char)10048+" Enter your percentage");
                           p=Integer.parseInt(br.readLine());
                            pref=preferences1.pref(p);
                          if(pref==1)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in The Nature's Bounty Co. on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress:San Jose, California");
                              System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
                            }
                          else if (pref==2)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Fairbanks Morse Engine on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Palm Bay, Florida");
                              System.out.println("Approximate pacakge: Rs 4 Lakh only");break;}
                              
                           else if (pref==3)
                             { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in The Gluten Free Baking Co. on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Scottsdale, Arizona");
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
            
            
                       

                