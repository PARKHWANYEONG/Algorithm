function solution(n, m, section) {
    let answer = 0;
    let temp = 0;
    for(let i=0; i<section.length; i++){
        if(temp < section[i]){
         temp = section[i]+m-1;
         answer++;
        }
    }
    return answer
}