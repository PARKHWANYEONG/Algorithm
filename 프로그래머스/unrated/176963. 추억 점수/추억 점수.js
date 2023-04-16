function solution(name, yearning, photo) {
    let ob = {};
    
    for(let i=0; i<name.length; i++){
        ob[name[i]] = yearning[i]
    }
   return photo.map(v=> v.map(val=>ob[val]? ob[val]:0)).map(v=>v.reduce((a,c)=>a+c))
}