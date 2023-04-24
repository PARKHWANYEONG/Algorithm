function solution(n) {
    var answer = [];
    for(let i=0; i<n; i++){
        let temp = []
        for(let j=0; j<n; j++){
            if(i===j){
                temp.push(1)
            }else{
                temp.push(0)
            }
        }
        answer.push(temp)
    }
    
    return answer
}