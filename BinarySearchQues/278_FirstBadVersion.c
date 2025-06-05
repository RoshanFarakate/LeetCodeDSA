// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

int firstBadVersion(int n) {
    int i,start=0,end=n,middle,ans;
    middle=(start+end)/2;
    while(start<=end)
    {
        middle = start + (end - start)/2;
        if(isBadVersion(middle)==true)
        {
            ans = middle;
            end = middle-1;
        }
        else{
            start = middle+1;
        }
    }
    
    return ans;
}
