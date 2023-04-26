function solution(skill, skill_trees) {
    function isCorrect(n) {
           // n =  'BACDE'
        let test = skill.split('');  //['C','B','D']
        for (var i = 0; i < n.length; i++) {   
            if (!skill.includes(n[i])) continue;
            if (n[i] === test.shift()) continue;
            return false;
        }
        return true;
    }    

    return skill_trees.filter(isCorrect).length;
}