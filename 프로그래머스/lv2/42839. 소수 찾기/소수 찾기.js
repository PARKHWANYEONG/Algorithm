function solution(numbers) {
    let check = Array.from({length:numbers.length},()=>0)
    let set = new Set();
    
    const DFS = (str)=>{
        if(+str > 1) set.add(+str);
        
        for(let i=0; i<numbers.length; i++){
            if(check[i]===0){
                check[i] = 1;
                DFS(str+numbers[i]);
                check[i] = 0;
            }
        }
    }
    
    const 소수판별 = (num)=>{
        let result = true;
        for(let i=2; i<=Math.sqrt(num); i++){
            if(num%i===0) result = false;
        }
        return result;
    }
    
    DFS('')
    
    return [...set].filter(number=> 소수판별(number)).length;
}