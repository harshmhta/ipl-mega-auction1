<?php
    session_start();
    $editState=false;
    $con=mysqli_connect("localhost","root","","blasters");

    
    //update result
    if(isset($_POST['updateResult'])){
        $result = $_POST['results'];
        $id = $_POST['recordId'];

        $update="UPDATE `fixtures` 
                 SET 
                    `result` = '".$result."' 
                 WHERE `fixtures`.`id` = '".$id."';";

        mysqli_query($con,$update) or die( mysqli_error($con));

        $_SESSION['msg']="Record Updated";

        header("Location: results.php?");
    }
    
?>