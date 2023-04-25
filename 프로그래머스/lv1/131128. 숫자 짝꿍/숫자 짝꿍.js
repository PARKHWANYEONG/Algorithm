function solution(X, Y) {
    let reg = new RegExp(`[${X}]`,'g')
    let includes = [...new Set(Y.match(reg))]
    if(includes.length === 0){
        return '-1'
    }else if(includes.filter(v=>v!=='0').length===0){
        return '0'
    }else{
        includes.sort((a,b)=> +b - +a);
        let temp = ''
        for(let i=0; i<includes.length; i++){
            let xC = [...X].filter(v=>v===includes[i]).length;
            let yC = [...Y].filter(v=>v===includes[i]).length;
                temp += includes[i].repeat(Math.min(xC,yC));
        }
        return temp
    }
}

