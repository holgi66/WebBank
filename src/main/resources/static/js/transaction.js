//Listener
documen.getElementById("button").addEventListener("click", post);


// send new entry at TEST API
function post() {
// read input
	var input = {
		receiver:   document.getElementById("Receiver").value,
		iban:       document.getElementById("IBAN").value,
		bic:        document.getElementById("BIC").value,
		amount:     document.getElementById("Amount").value,
		purpose:    document.getElementById("Purpose").value,
	}
// change String to json
    var json = JSON.stringify(input)
    
// send DATA
    fetch("/transaction/",
    {
	headers: {"Content-Type":"application/json"},
	method: "POST",
	body: json	
    }
    
// quit message    
    ).then(alert("Thanks for transaction! Have a nice day"))	
	
}

