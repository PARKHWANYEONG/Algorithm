function solution(P, L) {
    let arr = P.map((v,i)=> [i,v]);
    let max = P.sort((a,b)=>b-a)
    let answer = [];
    
    console.log(arr)
    
    while(arr.length){
        if(arr[0][1] === max[0]){
            let temp = arr.shift();
            answer.push(temp[0]);
            max.shift();
        }else{
            let temp = arr.shift();
            arr.push(temp)
        }
    }
    return answer.indexOf(L)+1 
}