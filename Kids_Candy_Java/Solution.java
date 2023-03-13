class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> list=new ArrayList<>();
        int m=candies[0];
        int n=candies.length;
        for(int i=1;i<n;i++){
            if(candies[i]>m)   m=candies[i];
        }
        for(int i=0;i<n;i++)  list.add(candies[i]+extraCandies>=m);
        return list;
    }
}

//the focus was on speed and size this time. So, the code is less readable and elegant than is expected.