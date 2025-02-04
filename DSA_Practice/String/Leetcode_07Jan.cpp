#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<string> stringMatching(vector<string>& words) {
        vector<string> result; 
        int numWords = words.size();

        for (int i = 0; i < numWords; ++i) {
            for (int j = 0; j < numWords; ++j) {
                 if (i != j && words[j].find(words[i]) != string::npos) {
                    result.push_back(words[i]); 
                    break;
                }
            }
        }
         return result;
    }
};

int main(){
    Solution solution;

    vector<string> words = {"mass","as","hero","superhero"};

    cout<< solution.stringMatching(words) <<endl;


    return 0;
}