function solution(common) {
    let answer;
    if(common[1]/common[0] === common[2]/common[1]){
        answer=common[1]/common[0];
        return common[common.length-1]*answer
    }else{
        answer= common[1]-common[0];
        return common[common.length-1]+answer
 }
}