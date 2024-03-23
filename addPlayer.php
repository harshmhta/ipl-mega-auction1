<?php
    $con=mysqli_connect("localhost","root","","blasters");

    $name = $_POST['firstName'];
    $nic = $_POST['nicNumber'];
    $address = $_POST['address'];
    $phone = $_POST['phone'];
    $age = $_POST['age'];
    $role= $_POST['role'];

    $insert="INSERT INTO `players`(`PlayerID`, `Name`, `Role`, `NICNumber`, `Phone`, `Address`, `Age`) VALUES (null,'$name','$role','$nic','$address','$phone','$age');";

    mysqli_query($con,$insert);

    header("Location: index.php?");
?>