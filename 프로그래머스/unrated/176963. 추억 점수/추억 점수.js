function solution(name, yearning, photo) {
    let hash = {}
    name.forEach((v,i)=> hash[v] = yearning[i]);
    
    return photo.map(v=>v.reduce((a,c)=> !hash[c] ? a+0 : a+hash[c],0))
}   
