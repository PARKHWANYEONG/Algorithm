function solution(dartResult) {
    let arr = []
    let sum = 0;
    let temp = '';
    for(let i=0; i<dartResult.length; i++){
        if(!isNaN(dartResult[i])){
            temp += dartResult[i];
            if(sum!==0){
                arr.push(sum);
                sum = 0;
            }
        }else if(dartResult[i]==='D'){
            sum += Math.pow(temp,2)
            temp = '';
        }else if(dartResult[i]==='T'){
            sum += Math.pow(temp,3)
            temp = '';
        }else if(dartResult[i]==='S'){
            sum += parseInt(temp);
            temp = '';
        }else if(dartResult[i]==='*'){
            sum *= 2;
            if(arr[arr.length-1]){
                arr[arr.length-1] = arr[arr.length-1] * 2; 
            }
        }else if(dartResult[i]==='#'){
            sum *= -1;
        }
    }
    arr.push(sum);
    return arr.reduce((a,c)=>a+c,0)    
}