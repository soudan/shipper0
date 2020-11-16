<?php
$bun=file_get_contents("qz.txt");
?>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>ファイル操作</title>
  </head>
  <body>
    <h3>お知らせ</h3>
    <?php
    echo nl2br($bun,false);
    ?>
  </body>
</html>
