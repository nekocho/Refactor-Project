document.addEventListener("DOMContentLoaded", function() {
    // Select the toggle switch element
    const toggleSwitch = document.getElementById("toggle");

    // Select all elements with the class "typewriter"
    const textElements = document.querySelectorAll(".typewriter");

    // Function to execute animation when toggle is on
    function executeAnimation() {
        // For each element with the class "typewriter"...
        textElements.forEach(textElement => {
            // Get the text content of the element and trim any leading/trailing whitespace
            const text = textElement.textContent.trim();

            // Clear the text content of the element
            textElement.textContent = '';

            // Define a function for the typewriter effect
            function typeWriter(text, i = 0) {
                // If there are characters left to type...
                if (i < text.length) {
                    // Append the next character to the text content of the element
                    textElement.textContent += text.charAt(i);
                    // Increment the index to move to the next character
                    i++;
                    // Check if the current character is a punctuation mark
                    const currentChar = text.charAt(i - 1);
                    let timeout;
                    // Set the timeout based on the type of punctuation mark
                    if (/[.,\/#!$%\^&\*;:{}=\_`~()?]/.test(currentChar)) {
                        timeout = currentChar === ',' ? 100 : 250; // Change speed for commas
                    } else {
                        timeout = 50; // Default typing speed for non-punctuation characters
                    }
                    // Schedule the next iteration of the typewriter effect after a delay
                    setTimeout(() => typeWriter(text, i), timeout);
                }
            }

            // Make the text visible before starting the typewriting effect by removing the "hidden" class
            textElement.classList.remove('hidden');

            // Start the typewriter effect after a delay
            setTimeout(() => typeWriter(text), 250);
        });
    }

    // Listen for changes in the state of the toggle switch
    toggleSwitch.addEventListener("change", function() {
        if (this.checked) {
            // If toggle is on, execute animation
            executeAnimation();
        }
    });
});
