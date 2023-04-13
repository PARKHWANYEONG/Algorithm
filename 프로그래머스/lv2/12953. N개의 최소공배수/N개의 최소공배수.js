function solution(arr) {
    let max= arr.reduce((a,c)=> c*a,1);
    let min = Math.max(...arr);
    
    for(let i=min; i<=max; i++){
        let cnt = 0
        for(let j=0; j<arr.length; j++){
            if(i%arr[j]===0){
                cnt++;
            }else{
                continue
            }
        }
        if(cnt === arr.length){
            return i
        }
    }
}