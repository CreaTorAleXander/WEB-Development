<?php
session_start();
if(!isset($_SESSION["Auth"])){
    header('Location: login.php');
}
if($_SESSION["Auth"]!=1){
    header('Location: portal.php');
}
?>

<!DOCTYPE html>
<html>
    <body>
        <p>Hallo</p>
    </body>
</html>