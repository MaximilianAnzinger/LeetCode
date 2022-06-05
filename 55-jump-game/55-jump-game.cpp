class Solution {
public:
    Solution(){
        ios_base::sync_with_stdio(false);
        cin.tie(0);
        cout.tie(0);        
    }
    
    bool canJump(vector<int>& nums) {
        int m = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(m < i)
                return false;
            if(m < i + nums[i])
                m = i + nums[i];
        }
        return true;
    }
};