function solution(n, words) {
    let index;
    words.reduce((prev,cur,idx)=>{
       index = index || ((words.slice(0,idx).indexOf(cur) !== -1 || prev !== cur[0]) ? idx : index)
        return cur[cur.length-1];
    },'')
    
   return index ? [(index%n)+1, Math.floor(index/n)+1] : [0,0]
}
