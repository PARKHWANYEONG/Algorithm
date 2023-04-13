function solution(clothes) {
    let ob = {};
    let answer = []
    clothes.forEach(v=>ob[v[1]]= (ob[v[1]]|0)+1);
    for(let v in ob){
        answer.push(ob[v]);
    }
    console.log(answer)
    return answer.reduce((a,c)=> (c+1)*a ,1)-1
}