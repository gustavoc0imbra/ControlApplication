function confirmDelete(event) {
    if(!confirm("Deseja realmente deletar este post?")) {
        event.preventDefault();
    }
}