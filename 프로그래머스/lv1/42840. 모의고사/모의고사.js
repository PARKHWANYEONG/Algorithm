function solution(answers) {
    let one = [1,2,3,4,5];
    let two = [2,1,2,3,2,4,2,5];
    let thr = [3,3,1,1,2,2,4,4,5,5];
    
    let one2 = answers.filter((v,i)=> v===one[i%one.length]).length;
    let two2 = answers.filter((v,i)=> v===two[i%two.length]).length;
    let thr2 = answers.filter((v,i)=> v===thr[i%thr.length]).length;
    let max = Math.max(one2,two2,thr2);
    
    let answer = [];
    if(one2 === max) answer.push(1)
    if(two2 === max) answer.push(2)
    if(thr2 === max) answer.push(3)
    
    return answer
}