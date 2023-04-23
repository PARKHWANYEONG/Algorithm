function solution(lottos, win_nums) {
    let temp = { 6:1, 5:2, 4:3, 3:4, 2:5 ,1:6, 0:6 };
    let include = 0;
    let zero = lottos.filter(v=>v===0).length;
    
    for(let i=0; i<lottos.length; i++){
        if(win_nums.includes(lottos[i])){
            include++;
        }
    }
    
    return [temp[(include+zero)], temp[include]]

}