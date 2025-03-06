// Y letter pattern programe //

*        *  
  *    *
    *
  *
*
    
public class PatternY
{
    public static void main(String[] args)
    {
        int n=5,i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i+j==4 || i+j==0 || (i==1 && j==1))
                {
                    System.out.print("*");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
