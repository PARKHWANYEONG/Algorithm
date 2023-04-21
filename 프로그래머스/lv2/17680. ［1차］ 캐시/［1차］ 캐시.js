function solution(cacheSize, cities) {
    let answer = 0;
    let cache = [];
    
    cities.forEach(city => {
        city = city.toUpperCase();
        
        if(cache.includes(city)){
            cache.splice(cache.indexOf(city),1);
            cache.push(city);
            answer += 1;
        }else{
            if(cache.length < cacheSize){
                cache.push(city);
                answer += 5;
            }else{
                cache.push(city);
                cache.shift();
                answer += 5;
            }
        }
    })
    return answer
}