function solution(P, L) {
    let arr= P.map((v,i)=>{return{idx:i , pri:v}});
    let answer = []
    while(arr.length){
        let temp = arr.shift();
        let hasSome = arr.some(v=> temp.pri < v.pri);
        if(!hasSome){
            answer.push(temp);
        }else{
            arr.push(temp);
        }
    }
    console.log(answer)
    return answer.findIndex(v=>v.idx === L) + 1
}