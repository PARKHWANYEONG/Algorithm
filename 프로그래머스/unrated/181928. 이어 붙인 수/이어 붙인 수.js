function solution(num_list) {
    let odd= num_list.filter(v=>v%2).reduce((a,c)=>a+c,'')
    let even= num_list.filter(v=>!(v%2)).reduce((a,c)=>a+c,'')
    return +odd + +even
}