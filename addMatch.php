<?php
    session_start();
    $editState=false;
    $con=mysqli_connect("localhost","root","","blasters");

    if (isset($_POST['save'])){
        $withTeam = $_POST['withTeam'];
        $ground = $_POST['ground'];
        $time = $_POST['time'];
        $date = $_POST['date'];
        $result = $_POST['results'];

        $insert="INSERT INTO `fixtures` (`withTeam`, `ground`, `time`, `date`, `result`) VALUES ('$withTeam', '$ground', '$time', '$date','$result');";
        mysqli_query($con,$insert);
        $_SESSION['msg']="Record Saved";

        header("Location: fixtures.php?");
    }

    //update match

    if (isset($_POST['update'])){
        $withTeam = $_POST['withTeam'];
        $ground = $_POST['ground'];
        $time = $_POST['time'];
        $date = $_POST['date'];
        $id = $_POST['recordId'];
        $result = $_POST['results'];

        $update="UPDATE `fixtures` 
                 SET 
                    `withTeam` = '".$withTeam."',
                    `ground` = '".$ground."', 
                    `time` = '".$time."', 
                    `date` = '".$date."',
                    `result` = '".$result."'
                 WHERE `fixtures`.`id` = '".$id."';";

        mysqli_query($con,$update) or die( mysqli_error($con));

        $_SESSION['msg']="Record Updated";

        header("Location: fixtures.php?");
    }

    
?>