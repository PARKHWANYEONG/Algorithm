function solution(numbers, hand) {
    const leftCheck = (num)=>{
        result += 'L';
        left = num;
    }
    const rightCheck = (num)=>{
        result += 'R';
        right = num;
    }
    
    let left = '*';
    let right = '#';
    let result = '';

    for(let i=0; i<numbers.length; i++){
        if(numbers[i] === 1 || numbers[i] === 4 || numbers[i] === 7) leftCheck(numbers[i]);
        else if(numbers[i] === 3 || numbers[i] === 6 || numbers[i] === 9) rightCheck(numbers[i]);
        else {
            let key = coordinate(numbers[i]);
            let leftKey = coordinate(left);
            let rightKey = coordinate(right);
            if(distance(key,leftKey) > distance(key,rightKey)){
                rightCheck(numbers[i]);
            }else if(distance(key,leftKey) < distance(key,rightKey)){
                leftCheck(numbers[i]);
            }else if(hand === "right")rightCheck(numbers[i]);
             else leftCheck(numbers[i])
        }
    }
    return result;
}
const coordinate = (num)=>{
    let key = [[1,2,3],
               [4,5,6],
               [7,8,9],
               ['*',0,'#']];
    
    for(let i=0; i<key.length; i++){
        if(key[i].includes(num)){
            return [i,key[i].indexOf(num)];
        }
    }
}

const distance = (coor1 , coor2)=>{
    return Math.abs(coor1[0] - coor2[0]) + Math.abs(coor1[1]- coor2[1])
}