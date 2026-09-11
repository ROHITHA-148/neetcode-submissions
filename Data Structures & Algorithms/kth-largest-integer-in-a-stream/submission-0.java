class KthLargest {

int k;
List<Integer> list=new ArrayList<>();
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int num:nums){
            list.add(num);
        }
    }
    public int add(int val) {
        list.add(val);
        list=list.stream()
            .sorted()
            .collect(Collectors.toList());
        return list.get(list.size()-k);
    }
}
