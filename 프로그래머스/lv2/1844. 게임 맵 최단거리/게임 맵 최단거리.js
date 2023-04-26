function solution(maps) {
    // [[1,0,1,1,1],
    //  [1,0,1,0,1],
    //  [1,0,1,1,1],
    //  [1,1,1,0,1],
    //  [0,0,0,0,1]]
    let n = maps[0].length , m = maps.length;
    let dx = [1,-1,0,0] , dy = [0,0,1,-1];
    let queue = [[0,0]] , answer = 1;
    maps[0][0] = 0;
    
    while(queue.length){
        let size = queue.length;
        for(let j=0; j<size; j++){
        let [x,y] = queue.shift();
        for(let i=0; i<4; i++){
            let nx = x + dx[i];
            let ny = y + dy[i];
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
    return -1
}
