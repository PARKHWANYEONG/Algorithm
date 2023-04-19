function solution(s) {
    let ob = ['zero','one','two','three','four','five','six','seven','eight','nine']
    let answer = '';
    let temp = '';
    for(let i=0; i<s.length; i++){
        if(!isNaN(s[i])){
          answer+=s[i];   
        }else{
            temp+=s[i];
        }
        if(ob.indexOf(temp)!== -1 ){
            answer+=ob.indexOf(temp);
            temp = ''
        }
    }
    return +answer
}