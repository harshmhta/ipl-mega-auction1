<?php

// mysqli_connect('localhost','root','');
// mysqli_select_db()

$mysqli = new mysqli("localhost","root","","");

// Check connection
if ($mysqli -> connect_errno) {
  echo "Failed to connect to MySQL: " . $mysqli -> connect_error;
  exit();
}

?>