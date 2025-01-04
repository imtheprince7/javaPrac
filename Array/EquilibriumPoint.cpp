#include<bits/stdc++.h>
using namespace std;

class Solution {
  public:
    // Function to find equilibrium point in the array.
    int equilibriumPoint(vector<int> &arr) {
        // code here
        int start = -1, end = arr.size() ;
        long long s1 = 0, s2 = 0;
        while(end - start > 2) {
            if(s1<s2)
                s1+=arr[++start];
            else
                s2 += arr[--end];
        }
        if(s1 == s2)
            return start+2;
        else
            return -1;
    }
};


int main(){
    Solution solution;
    vector<int> arr = {1, 3, 5, 2, 2};

    cout<<solution.equilibriumPoint(arr) <<endl;
    return 0;
    
}