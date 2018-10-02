import java.util.*;
class Bill
{
    public static void display()
    {
        String str;
        int i=MainMenu.srno;
        int len;
        boolean flag;
        double sum=0.0,stax,gtotal;
		for(int j=0;j<i;j++)
        {
            str=MainMenu.order[j][0];
            len=str.length();
            //System.out.print("\t\t"+(j+1)+"). ");
            for(int a=len;a<=35;a++)
                str=str+' ';
            //System.out.print(str);
            //System.out.println("\tRs. "+MainMenu.order[j][1]+"\t\t"+MainMenu.order[j][2]+"\t\tRs. "+MainMenu.order[j][3]);
            sum=sum+Double.parseDouble(MainMenu.order[j][3]);
        }
		Payment o=new Payment();
		o.pay(sum);
        Calendar obj=Calendar.getInstance();
        String date=""+obj.get(Calendar.DATE)+"-"+(obj.get(Calendar.MONTH)+1)+"-"+obj.get(Calendar.YEAR);
        String time=""+obj.get(Calendar.HOUR)+":"+obj.get(Calendar.MINUTE)+":"+obj.get(Calendar.SECOND);
        System.out.println("\f");
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t   M c D o n a l d s");
        System.out.println("\n\t\t\t\t  Ground Floor, Growels Mall, Kandivali East, Mumbai.");
        System.out.println("\n\t        Date: "+date+"\t\t\t  RECEIPT\t\t\t        Time: "+time);
        System.out.println("\n\t          Customer: "+Contacts.name+"\t\t\t    \t\t   Cashier: "+Login.name);
        System.out.print("\t");
        for(int x=0;x<100;x++) 
            System.out.print("-");
        System.out.println("\n\t\tItem Name\t\t\t\t\tRate/-\t\tQuantity\tTotal");
        System.out.print("\t");
        for(int x=0;x<100;x++) 
            System.out.print("-");
            System.out.println();
        for(int j=0;j<i;j++)
        {
            str=MainMenu.order[j][0];
            len=str.length();
            System.out.print("\t\t"+(j+1)+"). ");
            for(int a=len;a<=35;a++)
                str=str+' ';
            System.out.print(str);
            System.out.println("\tRs. "+MainMenu.order[j][1]+"\t\t"+MainMenu.order[j][2]+"\t\tRs. "+MainMenu.order[j][3]);
            //sum=sum+Double.parseDouble(MainMenu.order[j][3]);
        }
        /*stax=sum*0.125;
        gtotal=sum+stax;*/
        System.out.print("\t");
        for(int x=0;x<100;x++) 
            System.out.print("-");
        System.out.print("\n\t");
        for(int x=0;x<100;x++) 
            System.out.print("-");
		System.out.print("\n\t\t\t\t\t\t                 Total:- \t"+sum);
        System.out.print("\n\t\t\t\t\t\t Amount after discount:- \t"+o.total);
        /*System.out.print("\n\t\t\t\t\t\t\t\tService Tax:- \t"+stax);
        System.out.print("\n\t\t\t\t\t\t\t\tGrand Total:- \t"+gtotal);*/
        System.out.print("\n\t");
        for(int x=0;x<100;x++) 
            System.out.print("-");
        System.out.println("\n\t\t\t  T h a n k    Y o u     a n d     D o    V i s i t    A g a i n \n\n");
        System.exit(0);
    }
}