//Listener
document.getElementById("showtransaction").addEventListener("click", post);


// send new entry at TEST API
function post() {
// read input
	var input = {
		receiver:   document.getElementById("receiver").value,
		iban:       document.getElementById("iban").value,
		bic:        document.getElementById("bic").value,
		amount:     document.getElementById("amount").value,
		purpose:    document.getElementById("purpose").value,
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

