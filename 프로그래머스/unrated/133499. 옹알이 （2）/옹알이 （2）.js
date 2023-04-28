function solution(babbling) {
    const temp = ["aya", "ye", "woo", "ma"];
    let answer = 0;
    let current;
    
    for(let i=0; i<babbling.length; i++){
            current = babbling[i];
        for(let j=0; j<temp.length; j++){
            if(current.includes(temp[j].repeat(2))){
                break;
            }
            current = current.split(temp[j]).join(' ');
        }
        if(!current.split(' ').join('')) answer++
    }
    return answer
}