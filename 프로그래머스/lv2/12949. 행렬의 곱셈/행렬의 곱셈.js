function solution(A, B) {
  // console.log(A.map((row) => B[0].map((x,y) => row.reduce((a,b,c) =>  !isNaN(a + b * B[c][y]) ?a + b * B[c][y]:0, 0))))
  return A.map((row) => B[0].map((x,y) => row.reduce((a,b,c) => a + b * B[c][y], 0)))
}

// [[2, 3, 2],  [[5, 4, 3]            
//  [4, 2, 4],   [2, 4, 1]
//  [3, 1, 4]]   [3, 1, 1]]



