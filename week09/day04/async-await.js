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

function myTimedOutSyncFunction(param) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (param === 0)
                resolve('We came, we waited, we conquered.');
            else
                reject('We failed.');
        }, 2000)
    })
}

// create a function that requires waiting for the previous one
async function waitForPromise()  {
    const data1 = await myTimedOutSyncFunction(0).catch((error) => error);
    console.log(data1);
}

waitForPromise();