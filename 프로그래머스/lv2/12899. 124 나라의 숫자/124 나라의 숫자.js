function solution(n) {
    let num = ['4','1','2'];
    let answer = '';
    
    while(n){
        answer = num[n%3] + answer;
        n = (n%3) ? Math.floor(n/3) : n/3 - 1
    }
    
    return answer;
}