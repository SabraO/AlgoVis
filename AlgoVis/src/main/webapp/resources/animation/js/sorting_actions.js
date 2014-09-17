//actions panel stuff
var actionsWidth = 150;
var statusCodetraceWidth = 420;

var isCreateOpen = false;
var isInsertOpen = false;
var isRemoveOpen = false;
var isSortOpen = false;

function openCreate() {
	if(!isCreateOpen) {
		$('.create').fadeIn('fast');
		isCreateOpen = true;
	}
}
function closeCreate() {
	if(isCreateOpen) {
		$('.create').fadeOut('fast');
		$('#create-err').html("");
		isCreateOpen = false;
	}
}
function openInsert() {
	if(!isInsertOpen) {
		$('.insert').fadeIn('fast');
		isInsertOpen = true;
	}
}
function closeInsert() {
	if(isInsertOpen) {
		$('.insert').fadeOut('fast');
		$('#insert-err').html("");
		isInsertOpen = false;
	}
}
function openRemove() {
	if(!isRemoveOpen) {
		$('.remove').fadeIn('fast');
		isRemoveOpen = true;
	}
}
function closeRemove() {
	if(isRemoveOpen) {
		$('.remove').fadeOut('fast');
		$('#remove-err').html("");
		isRemoveOpen = false;
	}
}
function openSort() {
	if(!isSortOpen) {
		$('.sort').fadeIn('fast');
		isSortOpen = true;
	}
}
function closeSort() {
	if(isSortOpen) {
		$('.sort').fadeOut('fast');
		$('#sort-err').html("");
		isSortOpen = false;
	}
}

//
function hideEntireActionsPanel() {
	closeCreate();
	closeInsert();
	closeRemove();
	closeSort();
	hideActionsPanel();
}

$( document ).ready(function() {
	
	//action pullouts
	$('#create').click(function() {
		closeInsert();
		closeRemove();
		closeSort();
		openCreate();
	});
	$('#insert').click(function() {
		closeCreate();
		closeRemove();
		closeSort();
		openInsert();
	});
	$('#remove').click(function() {
		closeCreate();
		closeInsert();
		closeSort();
		openRemove();
	});
	$('#sort').click(function() {
		closeCreate();
		closeInsert();
		closeRemove();
		openSort();
	});
	
	//tutorial mode
	$('#sort-tutorial-2 .tutorial-next').click(function() {
		showActionsPanel();
	});
	$('#sort-tutorial-3 .tutorial-next').click(function() {
		hideEntireActionsPanel();
	});
	$('#sort-tutorial-4 .tutorial-next').click(function() {
		showStatusPanel();
	});
	$('#sort-tutorial-5 .tutorial-next').click(function() {
		hideStatusPanel();
		showCodetracePanel();
	});
	$('#sort-tutorial-6 .tutorial-next').click(function() {
		hideCodetracePanel();
	});
});