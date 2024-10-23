public class Exercise {
    public int numberOfOneBits(int n) {
        // write your code here
         int count=0;
        for(int i=0;i<32;i++){
            int mask=1<<i;
            if((n&mask)!=0){
                count++;
            }
        }
        return count;
    }
}
