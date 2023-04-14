function solution(babbling) {
    let temp = ["aya", "ye", "woo", "ma"];
    
   let answer =babbling.map(v=>{
       let str = v;
       temp.forEach(s=> str=str.replace(s,'|'));
       return str
   })
   return answer.map(v=>v.replace(/[|]/g,'')).filter(v=> v==='').length
}