function solution(n, lost, reserve) {
   let lostSt = lost.filter(v=> !(reserve.includes(v)));
   let reserveSt = reserve.filter(v=> !(lost.includes(v)));
    lostSt.sort((a,b)=>a-b);
    reserveSt.sort((a,b)=>a-b);
    
    reserveSt.forEach(v=>{
        if(lostSt.indexOf(v-1) > -1){
            lostSt.splice(lostSt.indexOf(v-1),1);
        }else if(lostSt.indexOf(v+1) > -1){
            lostSt.splice(lostSt.indexOf(v+1),1);
        }
    })
    
    return n-lostSt.length;
}