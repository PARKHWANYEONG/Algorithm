function solution(sizes) {
    sizes.map(v=> v.sort((a,b)=> a-b))
    let max1 = Math.max(...sizes.map(v=>v[0]))
    let max2 = Math.max(...sizes.map(v=>v[1]))
    
    return max1*max2    
} 