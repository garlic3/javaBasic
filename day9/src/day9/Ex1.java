package day9;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] nums1 = {2,7,11,15};
			int[] nums2 = {3,4,2};
			int[] nums3 = {3,3};    
		  
		  AddNum ad = new AddNum();
		  
		  	ad.addIndex(nums1, 9);
			ad.addIndex(nums2, 6);
			ad.addIndex(nums3, 6);

		    
		  }
		}

		class AddNum{
		  int[] result = new int[2];

		  void addIndex(int[] nums, int target){
		    for (int i = 0; i < nums.length-1; i++){
		      if ( nums[i] + nums[i+1] == target){
		        result[0] = i;
		        result[1] = i+1;
		        System.out.println(Arrays.toString(result));
		      }
		    }
		  }
		}	
	
