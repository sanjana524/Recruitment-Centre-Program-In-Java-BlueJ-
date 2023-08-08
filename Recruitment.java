import java.io.*;
import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JComponent;
import java.awt.*;
public class Recruitment extends JComponent 
{
    static int age,c,c1;
    static long phone_n;
    static  String name;
    static Double p;
    static String s;
    static int cnt=0;
    
    public static void call ()throws IOException 
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      for (int i=0;i<2;i++)
       {
         for (int j=1;j<=15;j++)
          {
            System.out.print((char)10049);
            System.out.print((char)10046);
            System.out.print((char)10042);
            System.out.print((char)10043);
            System.out.print((char)10044);
            System.out.print((char)10045);
          }
         System.out.println();
       }
      System.out.println();
      System.out.println();
      System.out.println("                                                WELCOME TO SRS ENGINEERING Recruitment ");
      System.out.println();
      for (int i=0;i<2;i++)
       {
         for (int j=1;j<=15;j++)
           {
             System.out.print((char)10049);
             System.out.print((char)10046);
             System.out.print((char)10042);
             System.out.print((char)10043);
             System.out.print((char)10044);
             System.out.print((char)10045);
           }
         System.out.println();
       }
      System.out.println();
      System.out.println("Pls Enter your Name ");
      name=br.readLine();
      System.out.println("\f");
      System.out.println("Enter your Phone number ");
      phone_n=Long.parseLong(br.readLine());
      System.out.println("\f");
      System.out.println("Enter your age ");
      System.err.print("Note- The ideal age grp id from 20-55 ");
      age=Integer.parseInt(br.readLine());
      System.out.println("\f");
      if (age > 20 && age<55)
       {
         System.out.println("Pls select the course in which you have pursued your BE"+"\n");
         System.out.println((char)10102+" Agricultural Engineering  ");
         System.out.println();
         System.out.println((char)10103 +" Biomedical Engineering"+"\n");
         System.out.println((char)10104 +" Computer Science amd IT "+"\n");
         System.out.println((char)10105 +" Electronic and Telecommunication "+"\n");
         System.out.println((char)10106+" Environmental Engineering "+"\n");
         System.out.println((char)10107 +" Mechanical Engineering"+"\n");
         System.out.println((char)10108+"  Genetic Engineering"+"\n");
         System.out.println((char)10109+"  Chemical Engineering"+"\n");
         System.out.println((char)10110+"  Electronics Engineering"+"\n");
         System.out.println((char)10111+" Aeronautical Engineering"+"\n");
         System.out.println("Select your Choice ! ");
         c=Integer.parseInt(br.readLine());
         System.out.println(" Select the fields/profession in which you are interested ");
         if(c==1)
           {
             agriculture1.agri();
             s="Agricultural Engineering";
           }
           else if (c==2)
           {
             medical.medi();
             s="Biomedical Engineering";
           }
           else if (c==3)
           {
             IT.info_tech();
             s=" IT- Information Technology";
           }
           else if (c==4)
           {
             telecom.tele();
             s="Telecommunication Engineering";
           }
           else if (c==5)
           {
             environment.envi();
             s="Environmental Engineering";
           }
           else if (c==6)
           {
             mechanical.mecha();
             s="Mechanical Engineering";
           }
           else if (c==7)
           {
             Genetic.gene();
              s="Genetic Engineering";
           }
           else if (c==8)
           {
             Chemical.chemi();
             s="Chemical Engineering";
           }
           else if (c==9)
           {
             Electrical.elec();
             s="Electronic Engineering";
           }
           else if (c==10)
           {
             Aeronautical.aeronaut();
             s=" AeronauticalEngineering";
           }
           else
           {
               System.out.println("Invalid choice");
               cnt++;
           }  
        }
        else
        {
        if(age<20)
         {
           System.out.println(" Your age is less than 21. Hence you are not eligibe for any job");
           cnt++;
         }
        if (age>55)
        {
           System.out.println(" Your age is more than 55. Hence you are not eligibe for any job");
           cnt++;
        }
        }
      Recruitment ob= new Recruitment();
      if (cnt==0)
       {
        JFrame frame=new JFrame("Reference Card");
        frame.getContentPane().add(new Recruitment());
        frame.setSize(1000,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        DrawingComponent DC = new DrawingComponent();
        frame.add(DC);
       }    
    }        
    public void paint(Graphics g)
    {
        Font ob=new Font("TimesRoman",Font.BOLD,20);
        g.setFont(ob);
        g.drawRect(750,30,100,100);
        g.drawString(" Photo",770,90);
        g.drawString(("Name : "+name),30,60);
        g.drawString(("Age :"+age),30 ,120);
        g.drawString(("Phone Number : "+phone_n),30,180);
        g.drawString(("Stream : "+s),30,240);
        g.drawString("Reference Number : 1E34P112S",30,300);
        g.drawString("Enter the Reference number in the Company's website to know further updates.",30,360);
        g.drawString("Thank you!!",400,400);
        g.drawString("SRS Pvt.Ltd ©",770,440);
    }
}
    
   
    
        
                    
                
            
       
                    
                    
                    
                    
                    
                 
    