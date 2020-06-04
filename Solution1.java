import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
import java.util.StringTokenizer; 
import java.util.Arrays;
public class Solution1 {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
       public  FastReader()
       {
           br=new BufferedReader(new InputStreamReader(System.in));
       }
       String next()
       {
           while(st==null ||!st.hasMoreElements())
           {
               try
               {
                   st= new StringTokenizer(br.readLine());
               }
               catch(IOException e)
               {
                   e.printStackTrace();
               }
           }
           return st.nextToken();
       }
       String nextLine()
       {
           String str="";
           try{
               str=br.readLine();
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
           return str;
       }
       int nextInt()
       {
           return Integer.parseInt(next());
       }
    }
    public static void main(String args[])
    {   FastReader fs= new FastReader();
        Associate associates[]=new Associate[5];
        for(int i=0;i<5;i++)
        {
            associates[i]=new Associate(fs.nextInt(), fs.next(), fs.next(), fs.nextInt());

        }
        String searchTechnology= fs.next();
        Associate result[]= associatesForGivenTechnology(associates, searchTechnology);
        for(int i=0;i<result.length; i++)
        {
            System.out.println(result[i].getId());
        }
    }

    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
        Associate newarray[]= new Associate[0];
        for(int i=0;i<associates.length;i++)
        {
            if(associates[i].getTechnology().equalsIgnoreCase(searchTechnology)&&associates[i].getExperienceInYears()%5==0)
            {
                newarray=Arrays.copyOf(newarray, newarray.length+1);
                newarray[newarray.length-1]=associates[i];
            }
        }
        return newarray;
    }
    
    
}
class Associate
{
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getTechnology()
    {
        return technology;
    }
    public void setTechnology(String technology)
    {
        this.technology=technology;
    }
    public int getExperienceInYears()
    {
        return experienceInYears;
    }
    public void setExperienceInYears(int experienceInYears)
    {
        this.experienceInYears=experienceInYears;
    }
    public Associate(int id, String name, String technology, int experienceInYears)
    {
        this.id=id;
        this.name=name;
        this.technology=technology;
        this.experienceInYears=experienceInYears;
    }

}
