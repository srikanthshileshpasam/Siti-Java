window.onload = function() {
  document.getElementById('toggleDIV').style.display = 'none';
};

function toggle() {
  var x = document.getElementById("toggleDIV");
  if (x.style.display === "none") {
    x.style.display = "block";
  }
}
