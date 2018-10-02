import java.io.*;
class Beverages
{
    public static void m4()throws IOException
    {
        InputStreamReader isr1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr1);
        String bevmenu[][]=new String[30][2];
        FileReader fr = new FileReader("Beverages.txt");
        BufferedReader br2 = new BufferedReader(fr);
        String str;
        int n=0,ch,q;
        while(true)
        {
            str=br2.readLine();
            if(str==null)
            break;
            bevmenu[n][0]=str;
            str=br2.readLine();
            bevmenu[n][1]=str;         
            n++;
        }
        do
        {
            for(int i=0;i<n;i++)
                System.out.println("\t\t"+(i+1)+".) "+bevmenu[i][0]+" Rs. "+bevmenu[i][1]+"/-");
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
                MainMenu.order[MainMenu.srno][0]=bevmenu[ch-1][0];
                MainMenu.order[MainMenu.srno][1]=bevmenu[ch-1][1];
                MainMenu.order[MainMenu.srno][2]=String.valueOf(q);
                MainMenu.order[MainMenu.srno][3]=String.valueOf(Integer.parseInt(bevmenu[ch-1][1])*q);
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