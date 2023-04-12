function solution(n) {
    let isPrime = [];
    let primeNum = [];
    for(let i=2; i<=n; i++){
        isPrime[i]=true;
    }
    for(let j=2; j<=n; j++){
        if(isPrime[j]){
            primeNum.push(j);
            for(let k=j; k<=n; k+=j){
                isPrime[k]=false;
            }
        }
    }
    return primeNum.length;
}