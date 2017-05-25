import java.util.*;
public class SumCheck{

void twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        int left=0,right=0;
        for(int i = 0; i < len; i++){
            if(tracker.containsKey(nums[i])){
                left = tracker.get(nums[i]);
                 left=left+1;
                 right=i+1;
                 break;
            }else{
                tracker.put(target - nums[i], i);
            }
        }
        System.out.println("indices are"+ left +" "+right+"value are "+"  "+nums[left-1] +" "+nums[right-1]);
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        System.out.println("Enter the array");
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        SumCheck obj=new SumCheck();
        obj.twoSum(arr,target);
    }
}