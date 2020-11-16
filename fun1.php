<?php
function sdf(){
  for($g=0;$g<5;$g++){
    print(mt_rand(1001,9998)."<br>"."予約番号");
    echo("----"."\n");
  }
  print("解除庵数");
}
?>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>乱数</title>
  </head>
  <body>
    <h5>ユーザー</h5>
      <?php
      sdf();
       ?>
  </body>
</html>
