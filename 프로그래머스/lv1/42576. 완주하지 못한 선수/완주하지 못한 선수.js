function solution(participant, completion) {
    completion.map(v=>completion[v]= (completion[v]|0) + 1)
   return participant.find(v=> !completion[v]--)
}