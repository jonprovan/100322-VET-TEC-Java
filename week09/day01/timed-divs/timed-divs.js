// create counter to number our divs
let counter = 0;

// this function adds a div to our div container
function addDiv() {
    // increment the counter for each one
    counter++;
    // grab the container and assign it to a variable
    const divContainer = document.getElementById('div-container');
    // create a new div and assign it to a variable
    let newDiv = document.createElement('div');
    // add our div class style to the new div
    newDiv.classList.add('square-div');
    // set the new div's inner text to the current value of counter
    newDiv.innerText = counter;
    // add our new div to the inside of our div container
    divContainer.append(newDiv);
}



window.addEventListener('DOMContentLoaded', () => {
    for (let i = 0; i < 10; i++) {
        setTimeout(addDiv, (i + 1) * 1000);
    }

    // setInterval(addDiv, 1000); // no parentheses when passing a function as a parameter
})