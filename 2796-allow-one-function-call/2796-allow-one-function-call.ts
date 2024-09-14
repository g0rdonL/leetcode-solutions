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

