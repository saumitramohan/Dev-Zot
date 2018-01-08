package org.dev.string;

import java.util.List;

public class findDuplicates {
	    public List<Integer> findDuplicates(int[] nums) {
	        int baseItr = 0;
	        int dupItr = baseItr+1;
	        List <Integer> duplicates = new ArrayList<Integer>();
	        boolean foundDuplicate = false;
	        while(baseItr < nums.length){
	            while(dupItr < nums.length){
	                if(nums[baseItr] == nums [dupItr]){
	                    duplicates.add(nums[baseItr]);
	                    baseItr ++;
	                    dupItr = baseItr + 1;
	                    foundDuplicate = true;
	            }
	                if(!foundDuplicate)
	                    dupItr ++;
	                foundDuplicate = false;
	            }
	            baseItr ++;
	            dupItr = baseItr + 1;
	        }
	        return duplicates;
	    }
}
