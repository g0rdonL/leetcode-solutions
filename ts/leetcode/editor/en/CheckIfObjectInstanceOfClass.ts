// Question 2618
checkIfInstanceOf(new Date(), Date); // true
//leetcode submit region begin(Prohibit modification and deletion)
function checkIfInstanceOf(obj: any, classFunction: any): boolean {
    if (obj == null || typeof classFunction !== "function") {
        return false;
    }
    return Object(obj) instanceof classFunction;
}

//leetcode submit region end(Prohibit modification and deletion)
