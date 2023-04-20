function solution(s){
    if(s[0] === ')') return false;
    let temp = 0
  
    for(let i=0; i<s.length; i++){
      if(s[i]==='('){
          temp++;
      }else{
          temp--;
      }
      if(temp < 0) return false;
    }
    return temp ? false : true
}