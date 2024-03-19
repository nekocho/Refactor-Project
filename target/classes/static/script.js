document.addEventListener("DOMContentLoaded", function() {
    const toggleSwitch = document.getElementById("toggle");
    const textAreaContainer = document.getElementById("textAreaContainer");

    // Function to execute animation when toggle is on
    function executeAnimation() {
        textAreaContainer.classList.add("typewriter");
        textAreaContainer.classList.remove("hidden");
    }

    // Function to stop animation when toggle is off
    function stopAnimation() {
        textAreaContainer.classList.remove("typewriter");
        textAreaContainer.classList.add("hidden");
    }

    // Listen for changes in the state of the toggle switch
    toggleSwitch.addEventListener("change", function() {
        if (this.checked) {
            // If toggle is on, execute animation
            executeAnimation();
        } else {
            // If toggle is off, stop animation
            stopAnimation();
        }
    });
});
