function solution(my_string, s, e) {
    let temp = my_string.slice(s,e+1).split('').reverse();
    let answer = my_string.slice().split('');
    answer.splice(s,e-s+1,...temp)
    return answer.join('')
}