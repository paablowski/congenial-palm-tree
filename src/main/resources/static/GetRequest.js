GET: $(document).ready(
    function() {

        // GET REQUEST
        $("#select_vehiculos").onchange(function(event) {
            event.preventDefault();
            ajaxGet();
        });


    })