// this is sent to the event loop first but has low priority
setTimeout(() => console.log('Action 1'), 0);

// this is sent to the event loop second but has high priority
Promise.resolve().then(() => console.log('Action 2'));

// this is directly executed, so it has the highest priority
console.log('Action 3');