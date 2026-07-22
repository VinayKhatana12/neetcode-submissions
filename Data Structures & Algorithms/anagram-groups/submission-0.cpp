class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>>ans;
        unordered_map<string,vector<string>>map;
        for(string ch : strs){
            string copy = ch;
            sort(copy.begin(),copy.end());
            map[copy].push_back(ch);
        }
        for(auto it : map){
            ans.push_back(it.second);
        }
     return ans;   
    }
};
