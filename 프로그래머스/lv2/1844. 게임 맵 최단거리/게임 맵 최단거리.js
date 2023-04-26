function solution(maps) {
    let dx = [1,-1,0,0];
    let dy = [0,0,1,-1];
    
    let n = maps[0].length;
    let m = maps.length;
    
    let queue = [[0,0]];
    maps[0][0] = 0;
    let answer = 1;
    
    while(queue.length){
        let size = queue.length;
        for(let i=0; i<size; i++){
            let [x,y] = queue.shift();
            for(let j=0; j<4; j++){
                let nx = x + dx[j];
                let ny = y + dy[j];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m && maps[ny][nx] === 1){
                    if(nx === n-1 && ny === m-1){
                     return ++answer;
                    }
                    queue.push([nx,ny]);
                    maps[ny][nx] = 0;
                }
            }
        }
        answer++;
    }
    return -1;
}