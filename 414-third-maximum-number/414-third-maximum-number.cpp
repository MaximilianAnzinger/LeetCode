class Solution {
public:
    int thirdMax(vector<int>& nums) {
        long m1 = -2147483649, m2 = -2147483649, m3 = -2147483649;
        for(int i : nums)
        {
            if(i == m1 || i == m2 || i == m3)
                continue;
            if(i > m1)
            {
                m3 = m2;
                m2 = m1;
                m1 = i;
            }
            else if(i > m2)
            {
                m3 = m2;
                m2 = i;
            }
            else if(i > m3)
                m3 = i;
        }
        if(m3 == -2147483649)
            return m1;
        return m3;
    }
};