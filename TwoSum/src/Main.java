
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int target=17;
		
		System.out.println(twoSum(nums,target));
		
	
	}
	
	   public static int[] twoSum(int[] nums, int target) {
		   int sum=0;
		   int[] solution= {0,0};
		   for (int i = 0; i < nums.length; i++) {
			for (int j =i+1 ; j < nums.length; j++) {
				sum=nums[i]+nums[j];
				if(sum==target) {
					solution[0]=i;
					solution[1]=j;
					/*System.out.println(solution[0]);
					System.out.println(solution[1]);*/
					return solution;
				}
				
			}
		}
		   
		return null;
	        
	    }

}
