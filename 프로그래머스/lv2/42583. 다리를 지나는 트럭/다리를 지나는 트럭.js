function solution(bridge_length, weight, truck_weights) {
    let bridge = Array.from({length:bridge_length},()=> 0);
    let sum = 0;
    let time = 0;
    bridge.shift();
    sum = truck_weights[0];
    bridge.push(truck_weights.shift());
    time++;
    
    while(sum > 0){
        time++;
        sum -= bridge.shift();
        
        if(sum + truck_weights[0] <= weight){
            sum += truck_weights[0];
            bridge.push(truck_weights.shift());
        }else{
            bridge.push(0)
        }
    }
    return time;
}