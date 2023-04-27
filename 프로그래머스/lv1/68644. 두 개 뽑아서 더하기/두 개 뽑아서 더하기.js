function solution(numbers) {
    let set = new Set();
    let check = Array.from({length:numbers.length},()=>0);
    
    const DFS = (sum,cnt)=>{
        if(cnt === 2){
           return set.add(sum);
        }
        for(let i=0; i<numbers.length; i++){
            if(!check[i]){
                check[i] = 1;
                DFS(sum+numbers[i],cnt+1);
                check[i] = 0;
            }
        }
    }
    
    DFS(0,0);
    return [...set].sort((a,b)=>a-b)
}