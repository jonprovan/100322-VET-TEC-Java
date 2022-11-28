// Asychrononous operations

// In JS, we have the event loop, to be dealt with later.
// BUT, we may want things to happen after certain amounts of time or at certain intervals

// We can use setTimeout and setInterval for these

// setTimeout takes two parameters -- a function to execute, and a time delay in milliseconds
// setInterval is the same, but the function will execute EVERY (time amount)

// this happens first
console.log('First Action');

let x = 10;

// this is SENT second, but happens last
setTimeout(() => {
    console.log('Second Action');
    x = 20;
}, 3000) // 2000ms = 2s

// this is SENT third but happens before the second action's timeout elapses
console.log('Third Action');

// this is sent last but its first occurence is before the section action's timeout elapses

setInterval(() => {
    console.log('Fourth Action');
    console.log(x);
}, 1000);

// using setTimeout to break the interval after a certain number of iterations
// for (let i = 0; i < 5; i++) {
//     setTimeout(() => {
//             console.log('Fourth Action');
//             console.log(x);
//         }, ((i+1) * 1000));
// }