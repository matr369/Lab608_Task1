var button = document.getElementById('addToastButtonId');
var toasts = document.getElementById('toasts');
var types = ['info', 'success', 'warn', 'error'];
var animations = ['showInfo','showSuccess', 'showWarn', 'showError'];

button.addEventListener('click', addToast);
toasts.addEventListener('webkitAnimationEnd', removeToast)

function addToast(){
	var toast = document.createElement('li');
	var typeIndex = Math.floor(Math.random()*types.length);

	toast.classList.add('toast');
	toast.classList.add(types[typeIndex]);
	toast.classList.add(animations[typeIndex]);

	toast.innerHTML = "<h3>"+ types[typeIndex] +" toast</h3><p>Message of toast</p>";

	toasts.appendChild(toast);
}

function removeToast(e){
	if (e.animationName == 'hideDown')
		toasts.removeChild(e.target);
}
