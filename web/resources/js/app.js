$(document).ready(() => {
    $('#table-toggle').click(() => {
        $('#entryList').toggleClass("not-displayed");
        $('#controls').toggleClass("not-displayed");
    });

    $('.x-link').click((e) => {
        console.log('entered');
        console.log(e.currentTarget);
        let x = document.getElementById('x-hidden');
        x.value = e.currentTarget.innerText;
        document.getElementById('x-value').innerText = "X=" + x.value;
    });


    let yField = document.getElementById("y-field");
    let hasSign = false;

    yField.onkeypress = function (e) {
        if (e.key === "Enter") {
            return false;
        }
        if (yField.value.length > 8) return false;
        if (Math.abs(+yField.value) === 3) return false;
        switch (yField.value.length) {
            case 0:
                hasSign = e.key === "-" || e.key === "+";
                return "+-1230".indexOf(e.key) >= 0;
            case 1:
                if (hasSign) return "123".indexOf(e.key) >= 0;
                return ".,".indexOf(e.key) >= 0;
            case 2:
                if (hasSign) return ".,".indexOf(e.key) >= 0;
            default:
                return "1234567890".indexOf(e.key) >= 0;
        }
    };

    let submButton = document.getElementById('submit-button');
    submButton.onclick = () => {

    };

});