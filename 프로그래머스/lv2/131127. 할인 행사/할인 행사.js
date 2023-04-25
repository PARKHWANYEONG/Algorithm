function solution(want, number, discount) {
    let answer = 0;
    
    const check = (arr)=>{
        let map = new Map();
        for(let i=0; i<arr.length; i++){
            if(map.get(arr[i])){
                map.set(arr[i],map.get(arr[i])+1);
            }else {
                map.set(arr[i],1);
            }
        }
        
        for(let j=0; j<want.length; j++){
            if(map.get(want[j]) !== number[j]){
                return false;
            }
            if(j===want.length-1){
                return true;
            }
        }
    }
    
    for(let i=0; i<=discount.length-10; i++){
        if(check(discount.slice(i,i+10))){
            answer++;
        }
    }
    
    return answer;
}