function solution(lottos, win_nums) {
    let hash = {6:1,5:2,4:3,3:4,2:5,1:6,0:6}
    let zeroCnt = lottos.filter(v=> !v).length;
    let include = lottos.filter(v=> win_nums.includes(v)).length;
    
    return [hash[(zeroCnt+include)] , hash[include]]
}