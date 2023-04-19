function solution(n, arr1, arr2) {
   let a1 = arr1.map((v,i)=>+v.toString(2) + +arr2[i].toString(2)+'')
   return a1.map(v=> v.length === n ? v : '0'.repeat(n-v.length)+v).map(v=>v.replace(/[1-2]/g,'#').replace(/0/g,' '))
   
}