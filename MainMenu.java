import java.io.*;
class MainMenu
{
    static String order[][]=new String [50][5];
    static int srno;
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr1);
        String mMenu[]=new String[10];
        FileReader fr = new FileReader("menu.txt");
        BufferedReader br2 = new BufferedReader(fr);
        String str;
        boolean flag=false;
        int n=0,ch;
        System.out.println(" ");
        Login.password();
        Contacts.details();
        while(true)
        {
            str=br2.readLine();
            if(str==null)
            {
                break;
            }
            //System.out.println(n+". "+str);
            mMenu[n]=str;
            n++;
        }
        do
        {

            System.out.println("\f\n\t\t\t----Main Menu----");
            for(int x=0;x<n;x++)
                System.out.println("\t\t"+(x+1)+"). "+mMenu[x]);
            System.out.println("\t\t"+(n+1)+"). Bill");
            System.out.print("\n\t\tEnter Choice : ");
            do
            {
                try
                {
                    ch=Integer.parseInt(br1.readLine());
                    if(ch!=9) flag=true;
                    break;
                }
                catch(Exception e)
                {
                    ch=0;
                }
            }while(ch!=0);

            switch(ch)
            {
                case 1:System.out.println("\t\tYou have chosen BURGERS.");
                Burgers.m1();break;
                case 2:System.out.println("\t\tYou have chosen WRAPS.");
                Wraps.m2();break;
                case 3:System.out.println("\t\tYou have chosen Happy Meal.");
                Happy_Meal.m3();break;
                case 4:System.out.println("\t\tYou have chosen BEVERAGES.");
                Beverages.m4();break;
                case 5:System.out.println("\t\tYou have chosen DESSERTS.");
                Desserts.m5();break;
                case 6:System.out.println("\t\tYou have chosen French Fries.");
                French_Fries.m6();break;
                case 7:System.out.println("\t\tYou have chosen Chicken Mc Nuggets.");
                Chicken_McNuggets.m7();break;
                case 8:System.out.println("\t\tYou have chosen TOPPINGS.");
                Toppings.m8();break;
                case 9:if(flag==false)
                {
                    System.out.println("\n\t\tYou have not purchased anything.");
                    ch++;
                    break;
                }
                    System.out.print("\n\n");Bill.display();break;
                default:System.out.print("\t\tInvalid choice.");
                for(double i=0;i<10000;i+=0.001);
            }
        }while(ch!=9);
    }
}