function solution(t, p) {
    let j = p.length;
    let cnt = 0;
    for(let i=0; i<t.length-p.length+1; i++){
        if(+t.slice(i,j) <= +p){
            cnt++;
        } 
        j++;
    }
    return cnt
}