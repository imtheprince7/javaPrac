#include<bits/stdc++.h>
using namespace std;
class Solution {
  public:
    int maxWater(vector<int> &arr) {
         int  n = arr.size();
        long maxl [n] ;
         long maxr [n] ;
        long sum=0,  ml=0,  mr=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]>mr){
                mr=arr[i];
                maxr[i]=mr;
                
            }else{
               maxr[i]=mr; 
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>ml){
                ml=arr[i];
                maxl[i]=ml;
            }else{
               maxl[i]=ml; 
            }
        }
        for(int i=0;i<n;i++){
            sum=sum+(min(maxr[i],maxl[i]))-arr[i];
        }
        return sum;
    }
};

int main(){

    Solution solution;
    vector<int> arr = {3, 0, 1, 0, 4, 0 2};


    cout<< solution.maxWater(arr) <<endl;

    return 0;
}