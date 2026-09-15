#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<vector<int>> lines) {
    //1. 앞에꺼만 있는 벡터, 뒤에꺼만 있는 벡터 만들기
    vector<int> front;
    vector<int> back;
    
    for(vector<int> line : lines){
        front.push_back(line[0]);
        back.push_back(line[1]);
    }
    
    // 2. 최대최소 구간 찾기
    int minVal = *min_element(front.begin(), front.end());
    int maxVal = *max_element(back.begin(), back.end());
    
    // 3. 최대 최소 구간 길이의 벡터 만들기 0 으로 초기화되어있음
    vector<int> mem;
    for(int i=0 ; i<maxVal-minVal ; i++){
        mem.push_back(0);
    }
    
    // 4. 구간순회하면서 있는애들은 더하기
    for(vector<int> line : lines){
        for(int i=line[0]-minVal ; i<line[1]-minVal ; i++){
            mem[i] += 1;
        }
    }
    
    // 5. mem 에서 2이상인 것의 개수 구하기
    int answer = 0;
    
    for(int m : mem){
        if(m>1)answer+=1;
    }
    
    return answer;
}