function solution(number) {
    let check = Array.from({length:number.length},()=>0);
    let answer = 0;
    const DFS = (start,sum,cnt)=>{
        if(cnt === 3 && sum === 0){
           answer++
        }
        
        for(let i=start; i<number.length; i++){
            if(!check[i]){
                check[i] = 1;
                DFS(i,sum+number[i],cnt+1);
                check[i] = 0;
            }
        }
    }
    
    DFS(0,0,0);
    return answer
}