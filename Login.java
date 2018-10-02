import java.io.*;
class Login
{
    static String name=" ";
    public static void password()throws IOException
    {
        
        boolean flag=false;
        Console c = System.console();
        char[] pw;

        File f=new File("Login.txt");
        FileReader fr=new FileReader(f);
        FileWriter fw= new FileWriter(f,true);
        BufferedReader in=new BufferedReader(fr);
        BufferedWriter out=new BufferedWriter(fw);
        
        String line;
        while(!flag)
        {
            System.out.println("\t\t\tEnter password : ");
            pw=c.readPassword();
            
            while((line=in.readLine())!=null)
            {
                
                if(pw[0]==line.charAt(0))
                {
                    out.newLine();
                    name=in.readLine();
                    flag=true;
                }
            }
            if(!flag)
            {
                System.out.println("\t\t\tInvalid password!!!");
            }
        }
    }
}