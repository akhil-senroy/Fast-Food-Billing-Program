import java.io.*;
class Chicken_McNuggets
{
    public static void m7()throws IOException
    {
        InputStreamReader isr1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr1);
        String cmnmenu[][]=new String[4][2];
        FileReader fr = new FileReader("Chicken McNuggets.txt");
        BufferedReader br2 = new BufferedReader(fr);
        String str;
        int n=0,ch,q;
        while(true)
        {
            str=br2.readLine();
            if(str==null)
            break;
            cmnmenu[n][0]=str;
            str=br2.readLine();
            cmnmenu[n][1]=str;         
            n++;
        }
        do
        {
            for(int i=0;i<n;i++)
                System.out.println("\t\t"+(i+1)+".) "+cmnmenu[i][0]+" Rs. "+cmnmenu[i][1]+"/-");
            do
            {
                try
                {
                    System.out.print("\t\tEnter choice: ");
                    ch=Integer.parseInt(br1.readLine());
                }
                catch(Exception e)
                {
                    ch=0;
                    System.out.println("Invalid Selection");
                }
            }while(ch==0);
            if(ch>0 && ch<=n)
            {
                do
                {

                    try
                    {
                        System.out.print("\t\tEnter the quantity: ");
                        q=Integer.parseInt(br1.readLine());
                    }
                    catch(Exception e)
                    {
                        q=0;
                        System.out.println("Invalid Selection");
                    }
                }while(q==0);
                MainMenu.order[MainMenu.srno][0]=cmnmenu[ch-1][0];
                MainMenu.order[MainMenu.srno][1]=cmnmenu[ch-1][1];
                MainMenu.order[MainMenu.srno][2]=String.valueOf(q);
                MainMenu.order[MainMenu.srno][3]=String.valueOf(Integer.parseInt(cmnmenu[ch-1][1])*q);
                MainMenu.srno++;
            }

            else
                System.out.println("\t\tInvalid Choice.");
            do
            {
                try
                {

                    System.out.print("\t\tDo you want to continue? \n\t\t1. Yes \n\t\t2.No ");
                    ch=Integer.parseInt(br1.readLine());
                }
                catch(Exception e)
                {
                    ch=0;
                    System.out.println("Invalid Selection");
                }
            }while(ch==0);
            }
            while(ch!=2);
        }
    }