function solution(numbers, target) {
    let answer = 0;
    
    function DFS(sum,cnt){
    if(cnt === numbers.length){
        if(sum===target){
            answer++;
        }
        return
    }
     DFS(sum+numbers[cnt],cnt+1)
     DFS(sum-numbers[cnt],cnt+1)
 }
    DFS(0,0);
    return answer;
}

