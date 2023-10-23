class Solution {
    public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for(int n : num_list){
            if(n%2 == 0) even++;
            if(n%2 != 0) odd++;
        }
        
        int[] answer = {even, odd};
        return answer;
    }
}