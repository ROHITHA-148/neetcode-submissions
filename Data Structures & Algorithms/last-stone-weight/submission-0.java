class Solution {
    public int lastStoneWeight(int[] stones) {
      List<Integer> list=new ArrayList<>();
      for(int stone:stones){
        list.add(stone);
      }
        while(list.size()>1){
        Collections.sort(list);
        int x=list.get(list.size()-2);
        int y=list.get(list.size()-1);
        if(x==y){
            list.remove(list.size()-2);
            list.remove(list.size()-1);
        }
        else if(x<y){
            list.remove(list.size()-2);
            list.remove(list.size()-1);
            list.add(y-x);
        }}
       if(list.size()==1){
        return list.get(0);
       }
        return 0;

    }
}
