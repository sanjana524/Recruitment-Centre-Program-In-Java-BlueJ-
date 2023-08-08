import java.io.*;
 public class Chemical
 {
     public static void chemi()throws IOException 
                  {
                      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      int age,c,c1;
                long phone_n;
                    String name;
                               int p,pref;
                       int cnt=0;
                    
                   
                       System.out.println((char)10102+" Biochemical Engineering"+"\n");
                          System.out.println((char)10103+" Petrochemical Engineering"+"\n");
                           System.out.println((char)10104+" Oil and Gas Engineering"+"\n");
                 
                        System.out.println("");
                           System.out.println((char)10048+" Select your choice");
                          c1=Integer.parseInt(br.readLine());
                         switch (c1)
                         {
                             case 1:
                       System.out.println("\f");
                          System.out.println("Available options"+"\n");
                          System.out.println((char)10102+"Nephrocare Health Services Pvt Ltd"+"\n");
                          System.out.println((char)10103+"BITS Pilani- Hyderabad Campus"+"\n");
                          System.out.println((char)10104+"Birla Institute of Technology and Science"+"\n");
                          System.out.println("");
                          System.out.println((char)10048+" Enter your percentage");
                           p=Integer.parseInt(br.readLine());
                            pref=preferences1.pref(p);
                          if(pref==1)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Nephrocare Health Services Pvt Ltd on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Pune, Maharashtra");
                              System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
                            }
                          else if(pref==2)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in  BITS Pilani- Hyderabad Campus on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress:Hyderabad,Telangana");
                              System.out.println("Approximate pacakge: Rs 4 Lakh only");break;}
                              
                           else if(pref==3)
                             { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Birla Institute of Technology and Science on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Pilani, Rajasthan");
                              System.out.println("Approximate pacakge: Rs 2.5 Lakh only");break;
                            }
                             else 
                     System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
                            break;
                        
                      case 2:
                       System.out.println("\f");
                          System.out.println("Available options"+"\n");
                          System.out.println((char)10102+"Sunline Greensystem Private Limited"+"\n");
                          System.out.println((char)10103+"Nova Human Resources Outsourcing Pvt Ltd "+"\n");
                          System.out.println((char)10104+"Thornton Tomasetti.");
                          System.out.println("");
                          System.out.println((char)10048+" Enter your percentage");
                           p=Integer.parseInt(br.readLine());
                            pref=preferences1.pref(p);
                          if(pref==1)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Sunline Greensystem Private Limited on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Pune,Maharashtra");
                              System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
                            }
                          else if(pref==2)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Nova Human Resources Outsourcing Pvt Ltd  on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Pune,Maharashtra");
                              System.out.println("Approximate pacakge: Rs 4 Lakh only");break;}
                              
                           else if(pref==3)
                             { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Karan IT Solutions on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Mumbai,Maharashtra");
                              System.out.println("Approximate pacakge: Rs 2.5 Lakh only");break;
                            }
                             else 
                     System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
                            break;
                        
                      case 3:
                       System.out.println("\f");
                            System.out.println("Available options"+"\n");
                          System.out.println((char)10102+"iQuest Management Consultants Private Limited"+"\n");
                          System.out.println((char)10103+"GE Oil & Gas"+"\n");
                          System.out.println((char)10104+"Seedline Tech"+"\n");
                          System.out.println("");
                          System.out.println((char)10048+" Enter your percentage");
                           p=Integer.parseInt(br.readLine());
                            pref=preferences1.pref(p);
                          if(pref==1)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in iQuest Management Consultants Private Limited on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Pune, Maharashtra");
                              System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
                            }
                          else if(pref==2)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in GE Oil & Gas on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Pune,Maharashtra");
                              System.out.println("Approximate pacakge: Rs 4 Lakh only");break;}
                              
                           else if(pref==3)
                             { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Seedline Tech on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Central Delhi,Delhi");
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
             