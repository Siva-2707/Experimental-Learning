
public class Main {
	public static void main(String[] args) {
	      System.out.println(search(new int[] {4,5,6,7,0,1,2},0));
	    }
	    
	public static int  search(int[] nums, int target) {
        
        if(nums.length == 1){
            if(nums[0] == target)
                return 0;
            else
                return -1;
        }
            
        
        int i = 0, j = nums.length-1;
        int mid ;
        
        while(i<j){
            mid = (i+j)/2;
            if(target >= nums[i] && target <=nums[mid]){
                if(target == nums[i])
                    return i;
                else if(target == nums[mid])
                    return mid;
                else
                    j = mid-1;
            }
            else if(target >= nums[mid] && target <= nums[j]){
                if(target == nums[mid])
                    return mid;
                else if(target == nums[j])
                    return j;
                else 
                    i = mid+1;
            }
        }
        return -1;
    }
}
