package Number;
class prime1To1000
{
    public static void main(String...s)
    {
        int i,k,j;
        for(i=1;i<1000;i++)
        {
            k=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    k=1;
                    break;
                }
            }
            if(k==0)
            {
                System.out.println(i);
            }
        }
    }
}

