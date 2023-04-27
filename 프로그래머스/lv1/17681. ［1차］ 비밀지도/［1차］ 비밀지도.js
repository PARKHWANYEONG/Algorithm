function solution(n, arr1, arr2) {
    const rep = (str)=>{
        return str.replace(/2|1|0/g,v=> +v>0 ? '#' : ' ');
    }
    
   let a1 = arr1.map((v,i)=> +v.toString(2) + +arr2[i].toString(2) +'')
   let answer = a1.map(v=> rep('0'.repeat(n-v.length)+v))
    
    return answer
}