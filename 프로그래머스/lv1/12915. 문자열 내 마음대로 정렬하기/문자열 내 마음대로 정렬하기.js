function solution(strings, n) {
    return strings.sort((a,b)=>{
        let str1= a[n];
        let str2= b[n];
        if(a[n]===b[n]){
            return (a>b)-(a<b)
        }else{
           return (a[n]>b[n]) - (a[n]<b[n])
        }
    })
} 