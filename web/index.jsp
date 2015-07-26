<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="">
        <meta name="og:url" content="">
        <meta name="og:title" content="">
        <title>Tic Tac Toe</title>

        <!--build:css ./styles/vendor.css-->
        <link rel="stylesheet" href="./bower_components/normalize.css/normalize.css">
        <link rel="stylesheet" href="./bower_components/fontawesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="./bower_components/bootstrap/dist/css/bootstrap.min.css">
        <!--endbuild-->
        <link rel="stylesheet" href="/styles/app.css">
        <!--build:js ./scripts/vendor.js-->
        <script src="bower_components/jquery/dist/jquery.min.js"></script>
        <!--endbuild-->
    </head>
    <body>
        <header class="navbar navbar-default">
            <div class="navbar-header">
                <!--collapse nav toggle goes here -->
                <div class="navbar-brand">
                    <a href="/">Tic Tac Toe</a>
                </div>
            </div>
        </header>
        <main>
            <div class="container">
                <section id="grid">
                    <div class="row">
                        <div class="col-xs-4 cell"><i class="fa"></i></div>
                        <div class="col-xs-4 cell"><i class="fa"></i></div>
                        <div class="col-xs-4 cell"><i class="fa"></i></div>
                    </div>
                    <div class="row">
                        <div class="col-xs-4 cell"><i class="fa"></i></div>
                        <div class="col-xs-4 cell"><i class="fa"></i></div>
                        <div class="col-xs-4 cell"><i class="fa"></i></div>
                    </div>
                    <div class="row">
                        <div class="col-xs-4 cell"><i class="fa"></i></div>
                        <div class="col-xs-4 cell"><i class="fa"></i></div>
                        <div class="col-xs-4 cell"><i class="fa"></i></div>
                    </div>
                </section>
                <script>
                    var $cells = $("#grid").find('.cell');
                    $cells.css('height', $cells.outerWidth()/2);
                </script>
                <div class="row text-center">
                    <h3>Choose who will start!</h3>
                    <div class="col-md-6">
                        <button type="button" class="btn btn-primary btn-lg">I'll Start</button>
                    </div>
                    <div class="col-md-6">
                        <button type="button" class="btn btn-danger btn-lg">AI Player Starts</button>
                    </div>
                </div>
            </div>
        </main>
        <footer>

        </footer>
        <!--build:js scripts/app.js-->
        <script src="${pageContext.request.contextPath}/scripts/Game.js"></script>
        <script src="${pageContext.request.contextPath}/scripts/app.js"></script>
        <!--endbuild-->
    </body>
</html>
