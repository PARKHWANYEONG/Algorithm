function solution(s) {
    let cnt = 0;
    let removeCnt = 0;
    
    while(s !== '1'){
       let temp = s.replace(/0/g,'').length;
        removeCnt += (s.length - temp);
        s = temp.toString(2);
        cnt++;
    }
    return [cnt ,removeCnt]
}