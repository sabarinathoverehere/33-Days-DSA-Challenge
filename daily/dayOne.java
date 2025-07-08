1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int compliment = target -nums[i];
            if(map.containsKey(compliment)){
               return new int[]{map.get(compliment),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return nums;
       
    }
}

2. Add two numbers

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int carry =0;
        
        while(l1!=null || l2!=null){

            int sum = 0 + carry;

            if(l1!=null){
                sum +=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2=l2.next;
            }

            carry=sum/10;
            sum =sum %10;

            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }
        if(carry==1) ptr.next = new ListNode(1);
        return result.next;
    }
}
