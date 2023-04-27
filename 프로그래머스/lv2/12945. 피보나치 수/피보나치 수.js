function solution(n) {
    let table = [0,1,1];
    
    for(let i=3; i<=n; i++){
        table[i] = (table[i-1]%1234567 + table[i-2]%1234567)%1234567
    }
    return table[n]    
}
