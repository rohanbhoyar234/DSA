class Solution {
    public boolean sumGame(String num) {
        
        int sum =0;
        int queDiff = 0;
        int n = num.length();

        for(int i=0;i<n;i++)
        {
            if(num.charAt(i) == '?')
            {
                if(i < n/2)
                {
                    queDiff++;
                }
                else{
                    queDiff--;
                }
            }else{
                            int digit = num.charAt(i) - '0';

            if(i < n/2)
            {
                sum+=digit;
            }
            else{
                sum-=digit;
            }
            }
                

        }

        return 2*sum + 9*queDiff != 0;
    }

}