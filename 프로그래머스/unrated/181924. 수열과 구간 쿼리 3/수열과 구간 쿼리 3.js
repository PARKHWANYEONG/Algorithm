function solution(arr, queries) {
    const swap = (arr,idx1,idx2)=>{
        return [arr[idx1],arr[idx2]] = [arr[idx2],arr[idx1]];
    }
    
    for(let i=0; i<queries.length; i++){
        let [idx1,idx2] = queries[i];
        swap(arr,idx1,idx2);
    }
    return arr
}