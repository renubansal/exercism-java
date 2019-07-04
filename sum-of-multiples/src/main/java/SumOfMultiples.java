import java.util.HashSet;
import java.util.Iterator;
class SumOfMultiples {
    int number;
    int[] set;
	
    SumOfMultiples(int number, int[] set) {
        if(number < 0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.number = number;
        this.set = set;
    }

    private HashSet<Integer> getMultiple(){
        HashSet<Integer> myset = new HashSet<Integer>();
        int i,j,len=set.length;
        
        for(i=1 ; i<number ; i++){           
            for(j = 0 ; j < len ; j++){
				try{
	                if(i % set[j] == 0)
                    myset.add(i);
				}
				catch(ArithmeticException e){
				}
            }            
        }
        return myset;
    } 
    int getSum() {
        HashSet<Integer> hashSet = getMultiple();
        int h,sum = 0;
        for (Iterator<Integer> it = hashSet.iterator(); it.hasNext();) {
            h = it.next();
            sum += h;
        }
        return sum;
    }
    
}
