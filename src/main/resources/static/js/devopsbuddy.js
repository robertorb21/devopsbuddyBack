/**
 * Created by Robert Rodriguez on 19-Jul-17.
 */
$(document).ready(main);

function main() {
    $('btn-collapse').click(function(e) {
        console.log('vientitos');
        e.preventDefault();
        var $this = $(this);
        var $collapse = $this.closest('.collapse-group').find('.collapse');
        $collapse.collapse('toggle');
    });
}