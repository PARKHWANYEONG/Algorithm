function solution(k, A) {
    let ob = {};
    A.forEach(v=>{
        return  ob[v] = ob[v] ? ob[v]+1 : 1
    })
    let cnt = Object.values(ob);
    cnt.sort((a,b)=> b-a);
    let add=0;
    for(let i=0; i<cnt.length;i++){
        add+= cnt[i];
        if(add >=k){
            return i+1;
        }
    }
    
}