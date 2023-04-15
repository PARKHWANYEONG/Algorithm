function solution(P, L) {
   P.sort((a,b)=>a-b);
    let answer =0;
   for(let i=0 ,j=P.length-1; i<=j; i++,answer++){
       if(P[i]+P[j] <= L){
           j--;
       }else{
           i--;
           j--
       }
   }
    return answer;
}