function solution(num_list) {
    num_list.sort((a,b)=>a-b)
    let [a,b,c,d,e] = num_list
    return [a,b,c,d,e]
}