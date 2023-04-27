function solution(n,a,b){
    
    let cnt = 0;
    while(true){
        cnt++;
        if(Math.ceil(a/2) === Math.ceil(b/2)){
            return cnt;
        }
        a = Math.ceil(a/2);
        b = Math.ceil(b/2)
    }
}