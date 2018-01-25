$(window).load(function(){
    setTimeout(function() {
        $('#loading').fadeOut( 400, "linear" );
    }, 300);
});


/* WOW animations */

wow = new WOW({
    animateClass: 'animated',
    offset: 100
});
wow.init();


/*Datatable*/
$(document).ready(function() {
    $('#datatable').dataTable();
});
$(document).ready(function() {
    $('.dataTables_filter input').attr("placeholder", "Search...");
});