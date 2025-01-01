#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxScore(string s) {
        int total_ones = 0;  // Total number of ones in the string
    for (char c : s) {
        if (c == '1') {
            total_ones++;
        }
    }

    int left_zeros = 0;  // Counter for zeros in the left substring
    int right_ones = total_ones;  // Counter for ones in the right substring
    int max_score = 0;  // Initialize maximum score

    // Iterate through the string and calculate the score at each split point
    for (int i = 1; i < s.length(); i++) {
        if (s[i - 1] == '0') {
            left_zeros++;
        } else {
            right_ones--;
        }

        int score = left_zeros + right_ones;  // Calculate the score
        max_score = max(max_score, score);  // Update the max score if needed
    }

    return max_score;
    }
};

int main(){
    Solution solution;
    string str = "011101";
    cout<<solution.maxScore(str) <<endl;
    return 0;
}