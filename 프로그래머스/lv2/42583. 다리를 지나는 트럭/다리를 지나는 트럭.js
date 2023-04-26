function solution(bridge_length, weight, truck_weights) {
    let q = [[0,0]] ,sum = 0 , time = 0;
    
    while(q.length){
        
        if(time === q[0][1]){
            sum -= q.shift()[0];
        }
        
        if(sum + truck_weights[0] <= weight){
            sum += truck_weights[0];
            q.push([truck_weights.shift(), time + bridge_length]);
        }else{
            if(q[0]) time = q[0][1] - 1 ;  
        }
        
        time++;
        console.log(time,sum,q)
    }
    return time;
}