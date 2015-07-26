/**
 * Created by steve on 7/25/15.
 */
(function($){
        $(function(){
            var player = 'x'; //TODO bind to choice event
            var game = new Game(player);
            var $grid = $("#grid");
            var $cells = $grid.find('.cell');
            const UNAVAILABLE = 'unavailable';

            $cells.each(function(){
               game.data.push($(this).data());
            });

            //Hover events
            $cells.hover(function(){
                var $this = $(this);
                if($this.data().status !== UNAVAILABLE){
                    $this.find('> i').toggleClass(game.marker);
                }
            });

            //click events
            $cells.click(function(){
                var $this = $(this);
                var data = $this.data();
                if(data.status) return;
                $this.find(' > i').addClass(game.marker);
                $this.data({
                    status : UNAVAILABLE,
                    player : game.player
                });
                //AJAX call to get the next moooove
                var nextMove = game.getNextMove($cells);
            });
        });
})(jQuery);