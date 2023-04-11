function solution(answers) {
    let one = [1,2,3,4,5];
    let two = [2,1,2,3,2,4,2,5];
    let thr = [3,3,1,1,2,2,4,4,5,5];
    let ob={}
    
    answers.forEach((v,i)=>{
        if(v=== one[i%one.length]){
            ob[1] ? ob[1]++ : ob[1]=1
        }
        if(v===two[i%two.length]){
            ob[2] ? ob[2]++ : ob[2]=1
        }
        if(v===thr[i%thr.length]){
            ob[3] ? ob[3]++ : ob[3]=1
        }
    })
    let answer = [];
    let max=0;
    for(let key in ob){
        if(+ob[key]>=max){
            max = +ob[key];
        }
    }
    for(let key in ob){
        if(ob[key]===max){
           answer.push(+key)
        }
    }
    return answer.sort((a,b)=>a-b)
}