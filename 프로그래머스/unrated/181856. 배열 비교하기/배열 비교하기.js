function solution(arr1, arr2) {
   let a1 = arr1.reduce((a,c)=>a+c,0)
   let a2 = arr2.reduce((a,c)=>a+c,0)
    return arr1.length > arr2.length ? 1 : arr1.length < arr2.length ? -1 : a1 > a2  ? 1 : a1 < a2 ? -1 : 0
}