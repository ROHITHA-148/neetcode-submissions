class MedianFinder {

List<Integer> nums=new ArrayList<>();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        nums.add(num);
    }
    
    public double findMedian() {
        Collections.sort(nums);
        if(nums.size()%2==0){
            int mid1= (int)nums.size()/2-1;
            int mid2= (int)nums.size()/2;

            return (nums.get(mid1)+nums.get(mid2))/2.0;
        }
        else{
            return nums.get(nums.size()/2);
        }
    }
}
