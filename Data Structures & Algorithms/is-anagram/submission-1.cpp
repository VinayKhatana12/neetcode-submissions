class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length()!=t.length()){
            return false;
        }
        map<char,int> s1;
        for(char f:s){
            s1[f]++;
        }
         map<char,int> s2;
        for(char e:t){
            s2[e]++;
        }
    return s1==s2;
    }
};
