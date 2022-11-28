// Taking in data from a form upon submit

// functions that trigger from events can take the event itself in as a parameter ("e" here)
function handleSubmit(e) {
    // this prevents the default behavior of an event
    // in this case, the submit event would normally refresh the page
    e.preventDefault();

    // getting the form from our HTML page and storing it in a variable called form
    const pageForm = document.getElementById('user-info-form');
    // feeding form into a FormData object and storing it as the variable formData
    let formData = new FormData(pageForm);
    // running our function to create a row using the form data
    createRow(formData);
    // "this" refers to the element that triggered the event, in this case, our form
    this.reset();
}


// this creates a row using our form data and adds it to our page
function createRow(formData) {
    // grab the table body
    const tableBody = document.getElementById('table-body');
    // create the row
    let newRow = document.createElement('tr');
    // create table data cells
    let nameCell = document.createElement('td');
    let dobCell = document.createElement('td');
    let genderCell = document.createElement('td');
    let colorCell = document.createElement('td');

    // add data to each column
    nameCell.innerText = formData.get('name');
    dobCell.innerText = formData.get('date-of-birth');
    genderCell.innerText = formData.get('gender');
    colorCell.style.backgroundColor = formData.get('favorite-color');

    // add cells to the new row
    newRow.append(nameCell, dobCell, genderCell, colorCell);

    // add row to the table body
    tableBody.appendChild(newRow);
}





// create an event listener for when the user clicks the submit button
window.addEventListener('DOMContentLoaded', () => {
    const userInfoForm = document.getElementById('user-info-form');
    userInfoForm.addEventListener('submit', handleSubmit);
});