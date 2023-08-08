import java.io.*;
 public class Genetic
 {
     public static void gene()throws IOException 
                  {
                      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      int age,c,c1;
                long phone_n;
                    String name;
                               int p,pref;
             int cnt=0;
                             System.out.println((char)10102+" Analytical Genetic Engineering"+"\n");
                          System.out.println((char)10103+" Applied Genetic Engineering"+"\n");
                           System.out.println((char)10104+" Chemical Genetic Engineering"+"\n");
                 
                        System.out.println("");
                           System.out.println((char)10048+" Select your choice");
                          c1=Integer.parseInt(br.readLine());
                     switch(c1)
                       {
                      case 1:
                       System.out.println("\f");
                          System.out.println("Available options"+"\n"+"\n");
                          System.out.println((char)10102+" Sahyadri Medical Genetics & Tissue Engineering Facility (SMGTEF)"+"\n");
                          System.out.println((char)10103+" International Centre for Genetic Engineering and Biotechnology"+"\n");
                          System.out.println((char)10104+" Augusta Infotech"+"\n");
                          System.out.println("");
                          System.out.println((char)10048+" Enter your percentage");
                           p=Integer.parseInt(br.readLine());
                            pref=preferences1.pref(p);
                          if(pref==1)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Sahyadri Medical Genetics & Tissue Engineering Facility (SMGTEF) on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Pune, Maharashtra");
                              System.out.println("Approximate pacakge: Rs 30 Lakh only");break;
                            }
                          else if(pref==2)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in International Centre for Genetic Engineering and Biotechnology on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress:Central Delhi, Delhi");
                              System.out.println("Approximate pacakge: Rs 25 Lakh only");break;}
                              
                           else if(pref==3)
                             { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Augusta Infotech on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Bengaluru, Karnataka");
                              System.out.println("Approximate pacakge: Rs 20 Lakh only");break;
                            }
                             else 
                     System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
                            break;
                        
                      case 2:
                       System.out.println("\f");
                          System.out.println("Available options"+"\n");
                          System.out.println((char)10102+"RESOLVE");
                          System.out.println((char)10103+"I Skill Solution"+"\n");
                          System.out.println((char)10104+"Thornton Tomasetti."+"\n");
                          System.out.println("");
                          System.out.println((char)10048+" Enter your percentage");
                           p=Integer.parseInt(br.readLine());
                            pref=preferences1.pref(p);
                          if(pref==1)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in RESOLVE on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress:Bangaluru, Karnataka");
                              System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
                            }
                          else if(pref==2)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in I Skill Solution on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Coimbatore, Tamil Nadu");
                              System.out.println("Approximate pacakge: Rs 4 Lakh only");break;}
                              
                           else if(pref==3)
                             { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Thornton Tomasetti. on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Mumbai,Maharashtra");
                              System.out.println("Approximate pacakge: Rs 2.5 Lakh only");break;
                            }
                             else 
                     System.out.println(" Your percentage is too low ! You are not eligible for any job. You can enquire directly from the company's website by using the reference ID on the company's website");
                            break;
                        
                      case 3:
                       System.out.println("\f");
                            System.out.println("Available options"+"\n");
                          System.out.println((char)10102+"Achievers Spot"+"\n");
                          System.out.println((char)10103+"Alkermes, Inc."+"\n");
                          System.out.println((char)10104+"Bemis Company Inc "+"\n");
                          System.out.println("");
                          System.out.println((char)10048+" Enter your percentage");
                           p=Integer.parseInt(br.readLine());
                            pref=preferences1.pref(p);
                          if(pref==1)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Achievers Spot on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Salem,Tamil Nadu");
                              System.out.println("Approximate pacakge: Rs 6 Lakh only");break;
                            }
                          else if(pref==2)
                          { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Alkermes, Inc. on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: Wilmington, OH");
                              System.out.println("Approximate pacakge: Rs 4 Lakh only");break;}
                              
                           else if(pref==3)
                             { System.out.println("\f");
                              System.out.println("Congragulations!! You have been shortlisted for an personal interview in Bemis Company Inc on the 18th. Your reference card is attached to this"+"\n");
                              System.out.println("Adress: New London,WI");
                              System.out.println("Approximate pacakge: Rs 2.5 Lakh only");
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
                