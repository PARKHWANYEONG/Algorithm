function solution(s, skip, index) {
    let alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'];
    
    
    let result = s.split('').map(v=>{
        let find = alphabet.indexOf(v);
        let cnt = index;
        while(cnt > 0){
            find++;
            if(find > 25) find%=26;
            if(skip.includes(alphabet[find])){
              continue;
            }else{
                cnt--;
            }
        }
        return alphabet[find]
    })
   return result.join('')
}