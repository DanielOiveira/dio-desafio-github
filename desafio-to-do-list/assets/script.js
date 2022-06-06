const form = document.getElementById('form');
const listaToDo = document.getElementById('list-to-do');

form.onsubmit = function (e) {
	e.preventDefault();
	const inputField = document.getElementById('input-add');
	addTask(inputField.value);
	form.reset();
};

function addTask(description) {

	const divContainer = document.createElement('div');
	const novaTarefa = document.createElement('input');
	const nomeTarefa = document.createElement('label');
	const taskDescriptionNode = document.createTextNode(description);

	novaTarefa.setAttribute('type', 'checkbox');
	novaTarefa.setAttribute('name', description);
	novaTarefa.setAttribute('id', description);

	nomeTarefa.setAttribute('for', description);
	nomeTarefa.appendChild(taskDescriptionNode);

	divContainer.classList.add('task-item');
	divContainer.appendChild(novaTarefa);
	divContainer.appendChild(nomeTarefa);

	listaToDo.appendChild(divContainer);
}