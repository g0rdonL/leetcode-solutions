// Question 2667
const f = createHelloWorld();
f(); // "Hello World"
//leetcode submit region begin(Prohibit modification and deletion)
function createHelloWorld() {
    return function (): string {
        return "Hello World";
    };
}

//leetcode submit region end(Prohibit modification and deletion)
