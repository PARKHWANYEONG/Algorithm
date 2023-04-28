function solution(progresses, speeds) {
    let day = progresses.map((v,i)=> Math.ceil((100-v)/speeds[i]));
    let answer = [];
    let temp = 0;
    console.log(day)
    while(day.length > 0){
        let program = day.shift();
        temp++;
        while(day[0] <= program){
            day.shift();
            temp++;
        }
        answer.push(temp);
        temp=0;
    }
    
    return answer;
}