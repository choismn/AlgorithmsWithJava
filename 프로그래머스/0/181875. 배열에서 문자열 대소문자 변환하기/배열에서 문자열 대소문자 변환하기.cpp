#include <string>
#include <vector>
#include <cctype>

using namespace std;

vector<string> solution(vector<string> strArr) {
    vector<string> answer;
    for(int i = 0 ; i<strArr.size() ; i++){
        if(i%2 != 0){
            for(char& elem : strArr[i]){
                elem = toupper(elem);
            }
            answer.push_back(strArr[i]);
        }
        else{
            for(char& elem : strArr[i]){
                elem = tolower(elem);
            }
            answer.push_back(strArr[i]);
        }
    }
    return answer;
}