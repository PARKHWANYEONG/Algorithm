function solution(num_list) {
    let odd = num_list.filter((_,i)=> i%2).reduce((a,c)=>a+c,0)
    let even = num_list.filter((_,i)=> !(i%2)).reduce((a,c)=>a+c,0)
    return odd > even ? odd : even
}