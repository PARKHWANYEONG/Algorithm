function solution(a, b) {
   let month = [31,29,31,30,31,30,31,31,30,31,30,31];
   let day = b;
   let days = ['FRI','SAT','SUN','MON','TUE','WED','THU']
    
    for(let i=0; i<a-1; i++){
        day += month[i];
    }
    
   console.log(day)
    return days[(day-1)%7]
}