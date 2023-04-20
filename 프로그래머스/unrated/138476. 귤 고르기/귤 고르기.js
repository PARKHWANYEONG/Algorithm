function solution(k, tangerine) {
    let temp = {};
    tangerine.forEach(v=>temp[v] ? temp[v]++ : temp[v]=1)
    let arr = Object.values(temp).sort((a,b)=>b-a);
    let add = 0,cnt=0;
    for(let i=0; i<arr.length; i++){
        add+=arr[i];
        cnt++;
        if(add >= k) return cnt;
    }
}