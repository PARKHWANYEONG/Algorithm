function solution(my_string, is_suffix) {
    if(my_string.indexOf(is_suffix) === -1){
        return 0;
    }else if(my_string.slice(my_string.indexOf(is_suffix)) === is_suffix){
         return 1;
    }
    return 0
}