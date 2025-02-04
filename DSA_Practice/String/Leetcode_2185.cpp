#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int prefixCount(vector<string>& words, string pref) {
        int ans = 0;
        for (auto &word : words){
            ans += word.find(pref) == 0;
        } 
        return ans;
    }
};

int main(){
    Solution solution;
    vector<string> words = {"pay","attention","practice","attend"};
    string pref = "at";

    cout<< solution.prefixCount(words, pref) <<endl;


    return 0;
}