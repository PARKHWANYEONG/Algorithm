function solution(n, m) {
    let min = Math.min(n,m);
    let max = Math.max(n,m);
    
    let 최대공약수=0;
    let 최소공배수=0; 
    for(let i=1; i<=min; i++){
        if(n%i===0 && m%i===0) 최대공약수 = i;
    }
    
    for(let i=min*max; i>=min; i--){
        if(i%n===0 && i%m===0){
            최소공배수 = i
        }
    }
    return [최대공약수,최소공배수]
}