function solution(elements) {
    const set = new Set();
    
    for (let i = 0; i < elements.length; i++) {
        let sum = 0;
        for (let j = 0; j < elements.length; j++) {
            sum += elements[(i + j)%elements.length];
            set.add(sum);
        }
    }
    return set.size;
}
//[7,9,1,1,4,7,9,1,1,4]