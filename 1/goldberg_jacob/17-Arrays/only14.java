public boolean only14(int[] nums) {
  for (int x = 0; x < nums.length; x=x+1) {
    if (((nums[x]) != 1) && ((nums[x]) != 4)) {
      return false;
    }
  }
  return true;
}
