
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Gamarra - Store</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta name="keywords" content=" Moda, Ropa, Belleza" />
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <link href="css/fontawesome-all.css" rel="stylesheet" />
        <link href="//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
              rel="stylesheet">
    </head>
    <body>
        <h1>BIENVENIDO</h1>
        <div class=" w3l-login-form">
            <h2>Iniciar Sesion</h2>
            <form action="#" method="POST">

                <div class=" w3l-form-group">
                    <label>Usuario:</label>
                    <div class="group">
                        <i class="fas fa-user"></i>
                        <input type="text" class="form-control" placeholder="Username" required="required" />
                    </div>
                </div>
                <div class=" w3l-form-group">
                    <label>Contraseña:</label>
                    <div class="group">
                        <i class="fas fa-unlock"></i>
                        <input type="password" class="form-control" placeholder="Password" required="required" />
                    </div>
                </div>
                <div class="forgot">
                    <a href="#">¿Olvidaste tu contraseña?</a>
                    <p><input type="checkbox">Recordarme</p>
                </div>
                <button type="submit">INICIAR SESION</button>
            </form>
            <p class=" w3l-register-p">No tengo cuenta<a href="#" class="register"> Registrame</a></p>
        </div>

    </body>
</html>
