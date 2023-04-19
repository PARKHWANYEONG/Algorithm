function solution(food) {
    
    let arr = [0];
    
    for(let i=food.length-1; i>0; i--){
        let temp = Math.floor(food[i]/2);
        for(let j=0; j<temp; j++){
            arr.unshift(i);
            arr.push(i);
        }
    }
    return arr.join('')
}