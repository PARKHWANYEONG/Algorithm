function solution(a, b) {
    let day = ['FRI','SAT','SUN','MON','TUE','WED','THU'];
    let month = [31,29,31,30,31,30,31,31,30,31,30,31];
    let sum = b;
    for(let i=1; i<a; i++){
        sum += month[i-1];
    }
    let gap = (sum-1)%7
    return day[gap]

}