function solution(s, n) {
    let answer ='';
    for(let i=0; i<s.length; i++){
        let temp = s[i].charCodeAt();
        if(s[i] === ' '){
            answer+=' ';
            continue;
        }
        if(96 < temp ){
            if(temp+n > 122){
                answer+=String.fromCharCode((((temp+n)%122)+96));
            }else{
                answer+=String.fromCharCode(temp+n);
            }
        }else{
            if(temp+n > 90){
               answer+=String.fromCharCode((((temp+n)%90)+64));
               }else{
                answer+=String.fromCharCode(temp+n);
            }
        }
     }
    return answer
}
