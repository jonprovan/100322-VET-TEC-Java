/**
 * ASYNC and AWAIT
 * 
 * These were added to JS to expand on Promises and make them easier/more readable
 * 
 * The whole then/catch syntax can be a little nutty in more complex situations
 * 
 * With async/await, we can write code that looks a little more like our regular synchronous code
 * 
 * With async/await, we have the ability to freeze execution until something we want to happen has happened
 * 
 * 
 * Synchronous code -- code that executes line by line
 * Asynchronous code -- any code that uses callbacks to execute something at a later point in time
 * 
 * JS is single-threaded -- it can only execute one thing at a time
 * -- even though we can send things off to the side to be executed later, they still must wait for an opening in the main stack
 */

// to create an async function, just tack the keyword async onto the beginning
// async function myAsyncFunction() {
//     console.log('Welcome to the United States of Asyncmerica!');
//     return "What do I return?"; // an async function returns a promise, either fulfilled or rejected
// }

// console.log(myAsyncFunction());

// const myReturnedPromise = myAsyncFunction();

// myReturnedPromise.then((data) => console.log(data)).catch((error) => console.log(error));

// console.log();

// THE AWAIT KEYWORD
// the await keyword only works inside of an async function

// CANNOT do this
// function syncFunction() {
//     await myAsyncFunction();
// }

// const dealWithPromise = async () => {
//     const data1 = await myAsyncFunction(); // here, we wait until this is done before moving on
//     const data2 = await myAsyncFunction(); // this code doesn't execute until the previous line returns its promise
//     console.log(data1); // this code doesn't execute either until the previous line returns its promise
//     console.log(data2); // this one proceeds normally
// }

// dealWithPromise();

// console.log();

// create a function that returns a promise after a certain period of time
// async function myTimedOutAsyncFunction() {
//     setTimeout(() => {
//         return 'We came, we waited, we conquered.';
//     }, 2000);
// }

// function myTimedOutSyncFunction(param) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             if (param === 0)
//                 resolve('We came, we waited, we conquered.');
//             else
//                 reject('We failed.');
//         }, 2000)
//     })
// }

// // create a function that requires waiting for the previous one
// async function waitForPromise()  {
//     const data1 = await myTimedOutSyncFunction(0).catch((error) => error);
//     console.log(data1);
// }

// waitForPromise();

async function validateInput(input) {
    if (input === 'YES')
        return "Let's go to Mars!"; // this returns a fulfilled promise
    else if (input === 'MAYBE')
        return "I'll get back to you." // this ALSO returns a fulfilled promise
    else
        throw 'Take it easy, Elon.'; // this returns a rejected promise
}

async function instantRejection() {
    throw 'Yer out!';
}

/**
 * same as this:
 * 
 * async function testValidation() {}
 */

const testValidation = async () => {
    try {
        const yes = await validateInput('YES'); // when we await, the value returned is the data within the Promise
        console.log(yes);

        // this one rejects its promise, so we skip to the catch block
        const rejection = await instantRejection();
        console.log(rejection);

        const maybe = await validateInput('MAYBE');
        console.log(maybe);

        const no = await validateInput('NO');
        console.log('Does this print?');
    } catch (error) { // this line catches ALL rejected promises from ANY async functions in the try block
        console.log('Our validation failed...');
        console.log(error);
    }
}

testValidation();

// MINI-REVIEW
// new Promises take in a function with two parameters -- resolve, reject
// const newestPromise = new Promise((resolve, reject) => {
//     let x = 5;
//     if (x === 6)
//         resolve('Resolved!');
//     else
//         reject('Rejected!');
// })

async function checkForOddSum(num1, num2) {
    if ((num1 + num2) % 2 === 1)
        return 'Fulfilled -- this is an odd number!';
    else
        throw 'Rejected -- this is not an odd number!';
}

checkForOddSum(4, 5)
    .then(data => console.log(data))
    .catch(error => console.log(error));