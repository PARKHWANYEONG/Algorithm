function solution(price, money, count) {
    let add = 0;
    let addNum = price;
    for(let i=1; i<=count; i++){
        add+= price;
        price += addNum;
    }
    return money-add < 0 ? add-money : 0
    
}