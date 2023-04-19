function solution(d, budget) {
    d.sort((a,b)=>a-b);
    let add = 0;
    let answer = 0;
    for(let i=0; i<d.length; i++){
        add += d[i];
        if(add > budget){
            break;
        }else{
         answer++;
        }
    }
    return answer
}
              