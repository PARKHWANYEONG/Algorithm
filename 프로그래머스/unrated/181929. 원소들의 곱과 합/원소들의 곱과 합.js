function solution(num_list) {
    let multi = num_list.reduce((a,c)=>a*c,1);
    let sum = num_list.reduce((a,c)=>a+c,0)
    return multi < Math.pow(sum,2) ? 1 : 0 
}