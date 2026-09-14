#include <string>
#include <vector>

using namespace std;

string solution(string rny_string) {
    string answer = rny_string;
    for(int i = 0 ; i<answer.size() ; i++){
        if(answer[i] == 'm'){
            answer.replace(i, 1, "rn");
        }
    }
    return answer;
}