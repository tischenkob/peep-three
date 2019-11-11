//ВЕЧНАЯ И НЕПРИКРЫТАЯ НЕНАВИСТЬ К JS

$(document).ready(function() {
  $("#app-link").click(function() {
    console.log("press app");
  });
  $("#info-button").click(function() {
    console.log("press info");
    $("#info-panel").classList.toggle("hidden");
  });
});

function showTime() {
  var date = new Date();
  var h = date.getHours(); // 0 - 23
  var m = date.getMinutes(); // 0 - 59
  var s = date.getSeconds(); // 0 - 59
  var session = "AM";

  if (h == 0) {
    h = 12;
  }

  if (h > 12) {
    h = h - 12;
    session = "PM";
  }

  h = h < 10 ? "0" + h : h;
  m = m < 10 ? "0" + m : m;
  s = s < 10 ? "0" + s : s;

  var time = h + ":" + m + ":" + s + " " + session;
  document.getElementById("MyClockDisplay").innerText = time;
  document.getElementById("MyClockDisplay").textContent = time;

  var today = new Date();

  var day = today.getDate();
  var month = today.getMonth() + 1;
  var year = today.getFullYear();

  if (day < 10) {
    day = "0" + day;
  }
  if (month < 10) {
    month = "0" + month;
  }

  var out = document.getElementById("date");

  out.innerHTML = day + "/" + month + "/" + year;

  setTimeout(showTime, 1000);
}

showTime();
