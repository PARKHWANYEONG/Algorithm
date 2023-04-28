function solution(A, B) {
    return A.map(val => val.map((v,i2)=> val.reduce((a,c,i)=> a+c*B[i][i2],0)))
    
   
}
function solution(A, B) {
    return A.map((row) => B[0].map((x,y) => row.reduce((a,b,c) => a + b * B[c][y], 0)))
}


// [[2, 3, 2],  [[5, 4, 3]            
//  [4, 2, 4],   [2, 4, 1]
//  [3, 1, 4]]   [3, 1, 1]]