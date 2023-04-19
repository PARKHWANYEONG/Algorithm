function solution(s) {
    let arr= []
    for(let i=0; i<s.length; i++){
        arr.push(s.charCodeAt(i))
    }
    console.log(arr)
    return arr.sort((a,b)=>b-a).map(v=>String.fromCharCode(v)).join('')
}