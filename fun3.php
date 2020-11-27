<?php
$msg =null;
if(isset($FILES['image'])&&$is_uploaded_file($_FILES['image']['tmp_name'])){
  $old_name=$FILES['image']['tmp_name'];
  $new_name=$FILES['image']['name'];

if(move_uploaded_file($old_name,'tsfm/'.$new_name)){
  $msg='upstr';
}else{
  $msg='erroer';
}
}
?>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>ファイル移動</title>
  </head>
  <body>
    <h2>localhst内でファイル移動</h2>
    <h4>移動先はtsfmフォルダー。</h4>
    <?php if($msg){
      echo '<p>'.$msg.'</p>';
    } ?>
    <form  action="fun3.php" method="post" enctype="multipart/form-data">
      <input type="file" name="image">
      <input type="submit" value="uproder">
    </form>
  </body>
</html>
