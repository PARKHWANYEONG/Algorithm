function solution(my_string, alp) {
    let reg = new RegExp(`${alp}`,'g')
    console.log(reg)
    return my_string.replace(reg,(v)=>v.toUpperCase())
}