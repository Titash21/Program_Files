import java.util.*;
public class CheckString
{

    void check(String str)
    {

        int index=0,i,j=0,h=0,flag=0;

        int lengths=str.length();
        System.out.println("length of string is "+lengths);
        if((str.charAt(0))>=64 && (str.charAt(0)<=90) )
        {
            for(i=1; i<lengths; i++)
            {
                j=str.charAt(i-1);
                h=str.charAt(i);

                if(h==(j+32))
                {
                    index=i;
                    continue;
                }
                else if((str.charAt(i))>=64 && (str.charAt(i)<=90)) //this is where i corrected (str.charAt(0)<=90)
                {
                    continue;
                }
                flag=1;
                break;

            }
        }
        if(flag==1)
        {
            System.out.println("Invalid String");
        }
        else{
            System.out.println("LAST REPEATED INDEX IS" + " "+ index);
        }


    }
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int i=0; //this will never be used

        CheckString obj=new CheckString();

        obj.check(str);
    }
}