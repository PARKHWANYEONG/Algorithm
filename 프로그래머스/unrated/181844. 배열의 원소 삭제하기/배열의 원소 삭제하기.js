function solution(arr, delete_list) {
    delete_list.forEach(v=>{
        if(arr.includes(v)){
            let temp = arr.indexOf(v);
            arr.splice(temp,1);
        }
    })
    return arr
}