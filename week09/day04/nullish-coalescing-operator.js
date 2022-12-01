// NULLISH COALESCING OPERATOR = ??

// to shorthand choose between two values
// uses first value if truthy; otherwise the second value

// Two-point-five annoying things:
// 1. You have to select the values on truthy-falsiness alone -- workaroud = ternary operator
// 2. I can't use the priority value if it's falsy, even if I might want to
// 2.5. You may get a falsy value 2 back, which is partially unexpected

const myConst1 = '123' || 456;

console.log(myConst1);

// Nullish Coalescing Operator = ??

// the nullish coalescing operator checks if the value on the left is null or undefined
// if so, it uses the one on the right
// otherwise, it uses the one on the left, even if it's falsy

const myConst2 = 0n ?? 123;

console.log(myConst2);