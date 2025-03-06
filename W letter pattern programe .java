// W letter pattern programe //

*           *  
*           *
*     *     *
*  *     *  *
*           *
    
public class PatternW
{
    public static void main(String[] args)
    {
        int n=5,i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j==0 ||j==4 ||(i==3 && j==1)||(i==2 && j==2)||(i==3 && j==3) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
