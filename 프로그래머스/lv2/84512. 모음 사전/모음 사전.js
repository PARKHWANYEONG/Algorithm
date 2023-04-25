function solution(word) {
    let set = new Set();
    let vowel= ['A', 'E', 'I', 'O', 'U'];
    const DFS = (str,length)=>{
       if(length > 5) return;
        set.add(str);
        for(let i=0; i<vowel.length; i++){
            DFS(str+vowel[i],length+1);
        }
    }
  
    DFS('',0)
    return [...set].indexOf(word)
}