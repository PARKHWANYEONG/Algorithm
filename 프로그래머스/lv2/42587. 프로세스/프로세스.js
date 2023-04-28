function solution(priorities, location) {
    let P = priorities.map((v,i)=> [i,v]);
    let max = priorities.sort((a,b)=>b-a);
    let answer = 0;
    console.log(P)
    while(true){
        if(P[0][1] === max[0]){
            if(P[0][0] === location){
                return ++answer;
            }else{
                P.shift();
                max.shift();
                answer++;
            }
        }else{
            let temp = P.shift();
            P.push(temp);
        }
    }
    return answer;
}