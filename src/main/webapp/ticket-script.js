function calcularTotal(){
    let valorTotal = 0;
    const valorTicket = 200;
    let categoria = document.getElementById('categ').value;
    let cantidad = document.getElementById('cant').value;

    switch(categoria){
        case "Estudiante": valorTotal = valorTicket*cantidad*0.2;break;
        case "Trainee": valorTotal = valorTicket*cantidad*0.5;break;
        case "Junior": valorTotal = valorTicket*cantidad*0.85;break;
        default: ;break;
    }
    document.getElementById('precio').innerText = valorTotal;
}

document.getElementById('resumen').addEventListener('click',calcularTotal);