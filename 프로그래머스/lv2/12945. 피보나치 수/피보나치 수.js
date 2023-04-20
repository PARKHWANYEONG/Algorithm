function solution(n) {
    let temp = [0,1,1];
    for(let i=3; i<=n; i++){
        temp[i] = temp[i-1]%1234567 + temp[i-2]%1234567
    }
    return temp[n]%1234567
}