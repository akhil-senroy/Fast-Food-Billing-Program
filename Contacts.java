import java.io.*;
public class Contacts
{
    static String name,no;
    public static void details() throws IOException
    {
        String line;
        boolean flag=false;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(isr);
        
        
        File f = new File("Contacts.txt");
        FileReader fr=new FileReader(f);
        FileWriter fw= new FileWriter(f,true);
    
        BufferedReader in = new BufferedReader(fr);
        BufferedWriter out=new BufferedWriter(fw);
        
        PrintWriter pw = new PrintWriter(out);
        
        System.out.print("\t\t\tEnter mobile no : ");
        no=br.readLine();
        
        while((line=in.readLine())!= null)
        {
            if(line.equals(no))
            {
                out.newLine();
                name = in.readLine();
                flag=true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("\t\t\tHello "+name+"\n");
        }
        else
        {
            System.out.print("\t\t\tEnter full name : ");
            name = br.readLine();
            name=name.toUpperCase();
            pw.println(no);
            pw.print(name);
            System.out.println("\t\t\tWelcome "+name+"\n");
        }
        in.close();
        out.close();
    }
}