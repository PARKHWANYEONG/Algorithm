function solution(participant, completion) {
    let ob = {};
    
    for(let i=0; i<completion.length; i++){
        ob[completion[i]] = (ob[completion[i]]|0)+1;
    }
    
    for(let j=0; j<participant.length; j++){
        if(!ob[participant[j]]) return participant[j]
        ob[participant[j]] = ob[participant[j]] -1
    }
    
    console.log(ob)
}