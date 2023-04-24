function solution(s) {
    let answer = [];
    s = s.slice(2,-2).split('},{').sort((a,b)=> a.length - b.length);
    
    for(let i=0; i<s.length; i++){
        s[i].split(',').forEach(v=>{
            if(!(answer.includes(v))){
                answer.push(v)
            }
        })
    }
    return answer.map(v=> +v)
}