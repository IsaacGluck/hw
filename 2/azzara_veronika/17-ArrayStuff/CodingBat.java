public class CodingBat{
    public int[] middleWay(int[] a, int[] b) {
	int[] result = new int[2];
	result[0] = a[1];
	result[1] = b[1];
	return result;
    }
    public int[] makeEnds(int[] nums) {
	int[] result = new int[2];
	result[0] = nums[0];
	result[1] = nums[nums.length-1];
	return result;
    }
    public int[] fizzArray(int n) {
	int[] result = new int[n];
	for (int i = 0; i < n; i++)
	    result[i]=i;
	return result;
    }
    public boolean only14(int[] nums) {
	boolean o14 = true;
	for (int i = 0; i < nums.length;i++){
	    if (nums[i]==1||nums[i]==4)
		o14=true;
	    else
		return false;
	}
	return o14;
    }
}