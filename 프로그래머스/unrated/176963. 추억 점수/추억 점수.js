function solution(name, yearning, photo) {
    let temp = {}
    
    name.forEach((v,i)=>temp[v]=yearning[i])
    
  return photo.map(v=>v.reduce((a,c)=>{if(temp[c]!==undefined){return a + temp[c]}else{return a + 0}},0))
    
}