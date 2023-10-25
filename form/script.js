function submitForm() {
    // Gather form data
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;

    // Check gender checkboxes
    const genderCheckboxes = document.querySelectorAll('input[name="gender"]:checked');
    const gender = Array.from(genderCheckboxes).map(checkbox => checkbox.value).join(', ');

    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    // Display popup with form data
    const popupResult = document.getElementById('popupResult');
    popupResult.innerHTML = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${gender}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;

    // Display the popup
    document.getElementById('popup').style.display = 'block';
}

function closePopup() {
    // Close the popup
    document.getElementById('popup').style.display = 'none';

    // Reset the form
    resetForm();
}

function resetForm() {
    // Reset all form fields
    document.getElementById('surveyForm').reset();
}
