<?php
$wert = 'Hallo';
$name = 'Alex';
$zahl = 0;
header('Content-type: text/html')
?>
<!DOCTYPE html>
<html>
   
<?php include_once('header.inc.php'); ?>
    <body>
      <?php

        echo ++$zahl;  
        echo $zahl;
        
      ?>
    </body>
</html>
