#include<bits/stdc++.h>
using namespace std;

class Solution {
  public:
    vector<int> sumClosest(vector<int>& arr, int target) {
        vector<int> ans;
        if(arr.size() < 2)  
            return ans;
        sort(arr.begin(),arr.end());
        int start=0, end=arr.size()-1, diff=INT_MAX;
        
        while(start<end){
            int sump=arr[start]+arr[end];
            int cdiff=abs(target-sump);
            if(cdiff<diff){
                ans={arr[start],arr[end]};
                diff=cdiff;
            }
            if(sump>target)
                end--;
            else
                start++;
        }
        return ans;
    }
};

int main(){
    Solution solution ;
    vector<int> arr = {10, 30, 20, 5};
    int target = 25;

    cout <<solution.sumClosest(arr, target) <<endl;


    return 0;
}