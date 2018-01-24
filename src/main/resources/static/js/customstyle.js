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