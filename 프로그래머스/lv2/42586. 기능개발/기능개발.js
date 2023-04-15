function solution(progresses, speeds) {
    let day =progresses.map(v=> 100-v).map((val,i)=>Math.ceil(val/speeds[i]));
    let criteria = day[0];
    let answer = [];
    
    for(let i=0, j=0; i< day.length; i++){
       if(day[i]<=criteria){
           answer[j]= (answer[j]||0) +1;
       }else{
           j++;
           criteria = day[i];
           answer[j]=(answer[j]||0) +1;
       }
    }
    console.log(day)
    return answer
}