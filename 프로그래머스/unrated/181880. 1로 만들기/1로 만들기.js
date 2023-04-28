function solution(num_list) {
    let answer = 0;
    
    num_list.forEach(v=>{
        while(v>1){
            if(v%2){
             v = (v-1)/2;
            }else{ v/=2};
            answer++
        }
    })
    return answer
}