function solution(num) {
    let cnt = 0;
    if(num===1) return 0;
    
    while(cnt<=500){
        if(num%2){
            num = num*3 +1;
            cnt++;
        }else{
            num/=2;
            cnt++
        }
        if(num===1) return cnt
    }
    
   if(cnt > 500) return -1;
}