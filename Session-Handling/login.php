<?php
// Some Session-Handling
session_start();
$_SESSION["User"]=""; $_SESSION["Pass"]=""; $_SESSION["Auth"]=0;


?>

<!DOCTYPE html>
<html>
    <head>
    
    </head>
    <body>
        <form action="login-server.php" method="post"><pre>
            Benutzer: <input name="frmUser" type="text"> <br/>
            Kennwort: <input name="frmPass" type="password"> <br/>
            <input name="Login" type="submit">
        </pre></form>
        <p> Sie haben die Session-ID <?php echo(session_id()) ?> Vom Server erhalten.
        </p>
    </body>
</html>