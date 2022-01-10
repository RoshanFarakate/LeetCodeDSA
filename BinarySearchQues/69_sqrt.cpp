class Solution {
public:
    int mySqrt(int x) {
        int st = 0, en = x;
        int num = 0;
        while (st <= en)
        {
            long long mid = (st + en) / 2;
            if (mid * mid <= x)
            {
                num = mid;
                st = mid + 1;
            }
            else en = mid - 1;
        }
        return num;
    }
};
