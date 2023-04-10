function solution(lines) {
    let arr = Array.from({length:201},()=>0);
    lines.forEach(v=>{
        for(let i=v[0]+100; i<v[1]+100; i++){
            arr[i]++;
        }
    })
   let answer = arr.filter(v=> v>=2)
  return answer.length;
}