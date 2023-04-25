function solution(number, limit, power) {
    let arr = Array.from({length:number},v=>0)
    
    for(let i=1; i<=number; i++){
        for(let j=i; j<=number; j+=i){
            arr[j-1]++;
        }
    }
    return arr.reduce((a,c)=>{
       if(c > limit){
           return a + power;
       } else{
           return a + c
       }
    },0)
}