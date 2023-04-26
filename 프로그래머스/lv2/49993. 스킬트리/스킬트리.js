function solution(skill, skill_trees) {
    
    let answer = 0;
    
    for(let i=0; i<skill_trees.length; i++){
        let sequence = [...skill]
        let temp = skill_trees[i];
        for(let j=0; j<temp.length; j++){
            if(sequence.includes(temp[j])){
                if(sequence[0] === temp[j]){
                    sequence.shift();
                }else{
                    break;
                }
            }
            if(j===temp.length-1) answer++;
        }
    }
    return answer
}