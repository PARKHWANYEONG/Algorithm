function solution(cacheSize, cities) {
    if(cacheSize === 0) return cities.length * 5;
    let citiesArr = cities.map(v=>v.toLowerCase());
    let answer = 0;
    let cache = [];
    for(let i=0; i<citiesArr.length; i++){
        if(cache.includes(citiesArr[i])){
            cache.splice(cache.indexOf(citiesArr[i]),1);
            cache.unshift(citiesArr[i]);
            answer += 1;
        }else{
            if(cache.length < cacheSize){
                cache.unshift(citiesArr[i]);
                answer += 5;
            }else{
                cache.unshift(citiesArr[i]);
                cache.pop()
                answer += 5;
            }
        }
    }
    return answer
}