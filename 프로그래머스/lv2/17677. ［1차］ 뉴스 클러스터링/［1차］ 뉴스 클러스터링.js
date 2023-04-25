// function solution(str1, str2) {
//     let arr1 = [];
//     let arr2 = [];

//     str1 = str1.toUpperCase();
//     str2 = str2.toUpperCase();
    
//     let reg = new RegExp(/[^A-Z]/,'g');
    
//     for(let i=0; i<str1.length-1; i++){
//         let temp = str1.slice(i,i+2)
//         if(temp.replace(reg,'').length === temp.length){
//             arr1.push(temp)
//         }
//     }
    
//     for(let i=0; i<str2.length-1; i++){
//         let temp = str2.slice(i,i+2)
//         if(temp.replace(reg,'').length === temp.length){
//             arr2.push(temp)
//         }
//     }
//      if(arr1.length === 0 && arr2.length===0) return 65536;
    
    
//     let set = new Set([...arr1,...arr2])
//     let 교집합 = 0;
//     let 합집합 = 0;
//     set.forEach(v=>{
//         let has1 = arr1.filter(v1=>v1===v).length;
//         let has2 = arr2.filter(v1=>v1===v).length;
//         합집합 += Math.max(has1,has2);
//         교집합 += Math.min(has1,has2);
//     })
//     return 교집합 === 0 ? 1*65536 : Math.floor(교집합/합집합*65536)
// }
function solution(str1, str2) {

    // 대소문자 구분이 없으므로, 미리 소문자로 변환한다.
    const s1 = str1.toLowerCase();
    const s2 = str2.toLowerCase();

    // 영어 소문자만 검출하는 정규식
    var eng = /[a-z]/g;
    
    // 두글자씩 쪼개서 담는다. 이때, a+등 영문자가 아닌 문자가 포함된 글자쌍은 제외한다.
    const arr1 = [];
    const arr2 = [];
    for(let i =0;i<s1.length-1;i++) {
        const str = s1[i] + s1[i+1];
        if(str.replace(eng, '').length == 0) arr1.push(str);
    }
    for(let i =0;i<s2.length-1;i++) {
        const str = s2[i] + s2[i+1];
        if(str.replace(eng, '').length == 0) arr2.push(str);
    }

    console.log('sanitized: ', arr1, arr2);
    
    // 비교할 문자열이 없다면 유사도는 1이므로 바로 리턴한다.
    if(arr1.length ==0 && arr2.length==0) return 65536;
    
    // 동일한 배열인 경우에도 유사도가 1이다.
    arr1.sort();
    arr2.sort();
    if(JSON.stringify(arr1) == JSON.stringify(arr2)) return 65536;

    // 교집합
    // 주의할 점은 단순 unique 배열이 아니라 중복을 허용하는 배열이므로,
    // 찾은 요소를 제거해주어야 한다.
    const tempArr2 = JSON.parse(JSON.stringify(arr2));
    const intersection = arr1.reduce((acc,cur)=> {
        if(tempArr2.includes(cur)) {
            const index2 = tempArr2.indexOf(cur);
            tempArr2.splice(index2, 1);
            return [...acc, cur];
        } else {
            return acc;
        }
    },[]);
    
    // 합집합의 원소 갯수만 구하면 되므로, 집합1과 집합2의 갯수에서 교집합의 수만 빼면 된다.
    const union = arr1.length + arr2.length - intersection.length;
    return Math.floor(intersection.length/union*65536);
}