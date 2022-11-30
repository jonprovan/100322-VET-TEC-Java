// Getting used to the idea of functions as things we can include in objects and pass around as we see fit

// Let's create a counter object with several internal functions

/**
 * increment
 * decrement
 * reset
 * divide by 2
 * get the count
 * set the count
 * set initial value
 */


function createCounter(startingCount) {

    let count = (typeof startingCount === 'number') ? Math.floor(startingCount) : 0;
    let initialCount = count;

    const increment = () => {
        count++;
    }

    const decrement = () => {
        count--;
    }

    const reset = () => {
        count = initialCount;
    }

    const zeroCount = () => {
        count = 0;
    }

    const divideBy2 = () => {
        count = Math.floor(count/2);
    }

    const getCount = () => {
        return count;
    }

    const setCount = (newCount) => {
        count = (typeof newCount === 'number') ? Math.floor(newCount) : 0;
    }

    return {
        increment,
        decrement,
        reset,
        zeroCount,
        divideBy2,
        getCount,
        setCount
    };
}

let counter1 = createCounter(10);

console.log(counter1.getCount());
counter1.increment();
counter1.increment();
counter1.increment();
counter1.decrement();

console.log(counter1.getCount());

counter1.reset();
console.log(counter1.getCount());

let counter2 = createCounter(0);

console.log(counter1.getCount());
console.log(counter2.getCount());