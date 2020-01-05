<?php session_start();
// Zusätzliche Sichherit, greift zum Beispiel, wenn man den Server direkt aufruft.
if((!isset($_SESSION["User"])) ||(!isset($_SESSION["Pass"]))){
    // Is a redirect to login.php
    header('Location: login.php');
}
@$frmUser=$_POST["frmUser"]; @$frmPass=$_POST["frmPass"];

    // Als Test Normalerweise kommen die Daten für den Vergleich aus der Datenbank
    if((strtolower($frmUser)=="alex") && ($frmPass=="geheim")){
        // via Auth sind mehrere Berechtigungs-Level möglich
        $_SESSION["User"] = $frmUser; $_SESSION["Auth"]=1;
        header('Location: portal.php');
    }else{
        ?><!DOCTYPE html>
        <html><body>
            <center>
                Ihre Eingaben waren leider falsch!<br/>
               <a href="login.php">Zum Login </a>
    </center>
    </body></html> <?php 
    }
?>


    
