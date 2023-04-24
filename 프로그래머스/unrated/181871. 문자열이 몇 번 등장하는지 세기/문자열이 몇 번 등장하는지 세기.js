function solution(myString, pat) {
    let answer = 0;
    for(let i=0; i<myString.length; i++){
        for(let j=0; j<pat.length; j++){
            if(myString[i+j] !== pat[j]){
                break;
            }
            if(j===pat.length-1) answer++;
        }
    }
    return answer;
}