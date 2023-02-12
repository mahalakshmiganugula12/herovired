import java.util.*;
class unique {
    public static void main(String args[]){       
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        StringBuilder c=new StringBuilder();
        int nums[]={1,2,1,3,3,4,4,4,5,6}   ;
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==1)
            {
                c.append(nums[i]+" ");            
            }    
            
        } 
        System.out.println(c+"");
        
       
    }
    
}
