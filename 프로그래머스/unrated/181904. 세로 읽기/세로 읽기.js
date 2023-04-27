function solution(my_string, m, c) {
    let temp = [];
    
    for(let i=0; i<=my_string.length-m; i+=m){
        temp.push(my_string.slice(i,i+m))
    }
    
    return temp.map(v=>v[c-1]).join('')
}