function solution(s) {
    let answer = ''
    while(s.length){
        let x = s[0];
        let xCnt = 0;
        let anotherCnt = 0; 
        for(let i=0; i<s.length; i++){
            if(x===s[i]){
                xCnt++;
            }else if(x!==s[i]){
                anotherCnt++;
                if(xCnt === anotherCnt){
                    answer++;
                    s = s.slice(i+1);
                    break;
                }
            }
            if(i === s.length-1){
                answer++
                s = '';
            }
        }
    }
    
    return answer
}