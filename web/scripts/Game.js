/**
 * Created by steve on 7/25/15.
 */
function Game(player){
    if(player === 'x'){
        this.player = 'x';
        this.marker = 'fa-close';
    }else if(player === 'o'){
        this.player = 'o';
        this.marker = 'fa-circle';
    }
}

Game.prototype = {
    getState : function($cells){
        //returns a key,value query string representing the game state
        $cells.each(function(i, v){
            this.data[i] = $(this).data().player;
        });
    },
    getNextMove : function(){
        //passes the state to the servlet, receives what the next move should be
        var $promise = $.getJSON('/GameLogic', {data : JSON.stringify(this.data)});
        $promise.done(function(data){
           console.log(data);
        });
        $promise.error(function(jqXHR, textStatus, errorThrown){
            console.log(textStatus);
            console.log(errorThrown);
        });
    },
    data : [],
    playing : false,
    status : 'inactive'
};