function solution(number, k) {
    let temp = [];
    
    for(let i=0; i<number.length; i++){
        while(temp.length && temp[temp.length-1] < number[i] && k > 0){
             k--;
            temp.pop();
        }
        temp.push(number[i]);
    }
    console.log(k)
    if( k > 0){
        temp.splice(-k , k);
    }
    return temp.join('')
}