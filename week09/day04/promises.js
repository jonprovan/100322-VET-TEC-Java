/**
 * WHAT IS A PROMISE?
 * 
 * Representatively, it is a promise that some sort of data will eventually come back
 * 
 * It is a specific type of object
 *  - it contains the data as well as a status
 * 
 * Statuses A Promise Can Have:
 *  - Pending -- meaning it has not yet been rejected or fulfilled
 *  - Fulfilled (resolved) -- everything went according to plan
 *  - Rejected -- something bad happened, and we didn't get what we expected
 */


// A function that creates and returns a Promise

function createPromise(message, sender) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (sender === 'Jon') {
            reject("Jon's not on the list...sorry!");
        }
        resolve(message);
        }, 1000);
    });
}

// this runs the function, creates a promise
// we use the .then() function to unpack the fulfilled promise data
// if the promise is rejected, we need .catch() to unpack the rejected promise data
// or we're going to throw an exception
// .then/.catch functions similarly to a try/catch block or series
// createPromise('Yay! Promise fulfilled!', 'Jon')
//     .then((data) => console.log(data)) // .then() takes in a function describing what we're going to do with the data
//     .catch((error) => console.log(error)); // same with .catch()

console.log();

const promiseToChain = createPromise('This is a promise chain.', 'Wilhelmina');

promiseToChain
    .then(message => {
        console.log(message);
        // Equivalent to resolving the promise and packing in the new message as its data
        // Promise.resolve(message + " Here's the second link.")

        // if I reject my promise here, we skip all the way to the .catch() using this error message
        // if (message.length > 10)
        //     throw 'TOO LONG!!';

        return message + " Here's the second link.";  // when we return, what we return is a fulfilled promise enclosing this data
    })
    .then(message => {
        console.log(message);
        return message + " And here's the third link.";
    })
    .then(message => {
        console.log(message);
        // this is equivalent to rejecting the promise and packing in the error message as its data
        throw 'PROMISE REJECTED!!'  // when we throw, we return a rejected promise enclosing this data
    })
    .catch((error) => {     // if we reject the promise at ANY point, we need a .catch
        console.log(error);
        throw 'ERROR IN THE CATCH!!';  // if we reject the promise in the catch, we need another catch
    }) 
    .catch((error) => {console.log(error)})