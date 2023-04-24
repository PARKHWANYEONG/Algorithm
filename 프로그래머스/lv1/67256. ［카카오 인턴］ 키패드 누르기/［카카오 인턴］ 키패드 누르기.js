function solution(numbers, hand) {
    let leftTh= '*';
    let rightTh= '#';
    let result = '';
    
    for(let i=0; i<numbers.length; i++){
        if(numbers[i] === 1 || numbers[i] === 4 || numbers[i] === 7){
            result += 'L'
            leftTh = numbers[i];
        }else if(numbers[i] === 3 || numbers[i] === 6 || numbers[i] === 9){
            result += 'R'
            rightTh = numbers[i];
        }else {
            let leftPoint = find(leftTh);
            let rightPoint = find(rightTh);
            let keyPoint = find(numbers[i]);
            let leftDistance = Math.abs(leftPoint[0]-keyPoint[0]) + Math.abs(leftPoint[1]-keyPoint[1]);
            let rightDistance = Math.abs(rightPoint[0]-keyPoint[0]) + Math.abs(rightPoint[1]-keyPoint[1]);
            if(leftDistance > rightDistance){
                result += 'R';
                rightTh = numbers[i];
            }else if(leftDistance < rightDistance){
                result += 'L'
                leftTh = numbers[i];
            }else{
                if(hand ==='right'){
                    result += 'R';
                    rightTh = numbers[i];
                }else{
                    result += 'L'
                    leftTh = numbers[i];
                }
            }
            
        }
    }
    
    return result;
}
function find(v){
     let key = [[1,2,3],
                [4,5,6],
                [7,8,9],
              ['*',0,'#']];
    for(let i=0; i<key.length; i++){
        if(key[i].includes(v)){
            return [i,key[i].indexOf(v)];
        }
    }
}

