function solution(brown, yellow) {
    let sum = brown+yellow;
    let width;
    for(let height=3; ; height++){
        if(!(sum%height)) width= sum/height;
        if((width-2)*(height-2) === yellow) return [width,height];
    }
}