function solution(elements) {
    let answer = new Set();
    
    let j = 1;
    while(j<elements.length){
        for(let i=0; i<elements.length; i++){
            let sum = 0 ;
            for(let k=i; k<i+j; k++){
                if(k > elements.length-1){
                        sum += elements[k%elements.length];
                }else{
                sum += elements[k];
                }
            }
            answer.add(sum);
        }
        j++;
    }
    return answer.size +1
}