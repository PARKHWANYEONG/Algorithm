function solution(answers) {
    let one = [1, 2, 3, 4, 5];
    let two = [2, 1, 2, 3, 2, 4, 2, 5,];
    let thr = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    let score1 = 0,score2 = 0,score3 = 0;
    
    for(let i=0; i<answers.length; i++){
          if(answers[i] === one[i%one.length]) score1++;
          if(answers[i] === two[i%two.length]) score2++;
          if(answers[i] === thr[i%thr.length]) score3++;
    }
    let answer = []
    let max = Math.max(score1,score2,score3);
    if(max === score1) answer.push(1);
    if(max === score2) answer.push(2);
    if(max === score3) answer.push(3);
    return answer;
}