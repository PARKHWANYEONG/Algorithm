function solution(board) {
    let danger = [[-1,-1],[-1,0],[-1,1],[0,-1],[0,0],[0,1],[1,-1],[1,0],[1,1]];
    let dangerZone = new Set();
    let n = board.length;
    
    for(let i=0; i<n; i++){
        for(let j=0; j<n; j++){
            if(board[i][j]===1){
                danger.forEach(v=>{
                    let [col,row] = [i+v[0],j+v[1]];
                    if(col >= 0 && col < n && row >= 0 && row < n){
                        dangerZone.add(`${col} ${row}`)
                    }
                })
            }
        }
    }
    return n*n - dangerZone.size
}