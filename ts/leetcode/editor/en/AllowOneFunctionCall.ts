// Question 2666
let fn = (a: any, b: any, c: any) => a + b + c;
let onceFn: (...args: any[]) => any = once(fn);
onceFn(1, 2, 3); // 6
onceFn(2, 3, 6); // returns undefined without calling fn
//leetcode submit region begin(Prohibit modification and deletion)
type Fn = (...args: any[]) => any;

function once(fn: Fn): Fn {
    let counter: number = 0;
    return function (...args: any[]): any | undefined {
        if (counter < 1) {
            counter++;
            return fn(...args);
        }
        return undefined;
    };
}

//leetcode submit region end(Prohibit modification and deletion)
