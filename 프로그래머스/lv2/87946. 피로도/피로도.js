function solution(k, dungeons) {
    let visited = Array.from({length:dungeons.length},()=>false);
        let answer = 0;
    
    const dfs = (h,c)=>{
        for(let i=0; i<dungeons.length; i++){
            if(!(visited[i]) && dungeons[i][0] <= h){
            visited[i] = true;
            dfs(h-dungeons[i][1] ,c+1);
            visited[i] = false;
            }
        }
        answer = Math.max(answer,c);
    }
    dfs(k,0);
    return answer
}