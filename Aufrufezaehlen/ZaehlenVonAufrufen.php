<?php
$datei = @fopen("counter.txt", "r+");
$counter = @fgets($datei, 10);
if($counter == "") $counter = 0;
$counter++;
@fclose($datei);
$datei = @fopen("counter.txt", "w");
@fwrite($datei, $counter);
@fclose($datei);

@fwrite($datei, $inhalt);



@fclose($datei);

// $counter = @fgets($datei, 10);
// if($counter == "") $counter = 0;
// $counter++;
// @fclose($datei);
// $datei = @fopen("counter.txt","w");
// @fclose($datei);
// ?>

     <!DOCTYPE html>
     <html><body>
         <?php echo($counter) ?> Mal wurde ihre Seite bereits angezeigt.
     </body></html>
