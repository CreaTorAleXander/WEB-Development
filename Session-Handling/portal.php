<?php
session_start();
if(!isset($_SESSION["Auth"])){
    header('Location: login.php');
}
if($_SESSION["Auth"]!=1){
    header('Location: portal.php');
}
?>
<!Doctype html>
    <html>
        <body>
            <h1> 
               Hallo <?php $_SESSION["User"];?> 
               Willkommen im System
               <a href="portal-unterseite.php">Hier finden Sie die geheimen Daten </a>
             </h1>
        </body>
    </html>
