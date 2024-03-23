<?php
    // $con=mysqli_connect("localhost:3306","zolatikc_badam","y!Bfe~v5sGZC","zolatikc_blasters-auction");
    $con=mysqli_connect("localhost","","","zolatikc_blasters-auction");
    // query total num of players
    $query="select count(*) from players";
    $result=mysqli_query($con,$query) or die( mysqli_error($con));
    $row = mysqli_fetch_array($result);

    //query fixtures
    // $selectFixtures="select date,withTeam,result,ground,time from fixtures where result like ('TBD') order by date asc";
    $selectFixtures="select date,withTeam,result,ground,time from fixtures order by date asc";
    $resultFix=mysqli_query($con,$selectFixtures) or die( mysqli_error($con));

    // query match results
    // $selectResults="select date,withTeam,result,ground from fixtures where result not like ('TBD') order by date desc";
    // $resultMatchResults=mysqli_query($con,$selectResults) or die( mysqli_error($con));

    // query upcoming match
    // $upcomingMatch="SELECT withTeam FROM `fixtures` order by date asc limit 1";
    // $resUpcminMatch=mysqli_query($con,$upcomingMatch) or die( mysqli_error($con));
    // $finalResUpcminMatch = mysqli_fetch_array($resUpcminMatch);

    //query total matches played
    // $totMatchesQuery="SELECT count(id) FROM `fixtures` where result not like ('TBD')";
    // $resTotMatch=mysqli_query($con,$totMatchesQuery) or die( mysqli_error($con));
    // $resTotMatchFinal = mysqli_fetch_array($resTotMatch);
    

?>
<!--
=========================================================
Material Dashboard - v2.1.2
=========================================================

Product Page: https://www.creative-tim.com/product/material-dashboard
Copyright 2020 Creative Tim (https://www.creative-tim.com)
Coded by Creative Tim

=========================================================
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. -->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
    <link rel="icon" type="image/png" href="assets/img/blasters-logo.jpg">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>
        Blasters Premier League 2020 Auction
    </title>
    <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
    <!-- CSS Files -->
    <link href="assets/css/material-dashboard.css?v=2.1.2" rel="stylesheet" />
    <link href="assets/css/version1.css" rel="stylesheet" />
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link href="assets/demo/demo.css" rel="stylesheet" />
</head>

<body class="">
    <div class="wrapper ">
        <div class="sidebar" data-color="purple" data-background-color="white" data-image="">
            <!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger"

        Tip 2: you can also add an image using data-image tag
    -->
            <div class="logo">
                <a href="#" class="simple-text logo-normal">
                    <span><img src="assets/img/blasters-logo.jpg" width="40px" height="40px"></span>BPL 2020 Auction
                </a>
            </div>
            <div class="sidebar-wrapper">
                <ul class="nav">
                    <li class="nav-item active  ">
                        <a class="nav-link" href="index.php">
                            <i class="material-icons">dashboard</i>
                            <p>Dashboard</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="players.php">
                            <i class="material-icons">person</i>
                            <p>Players</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="fixtures.php">
                            <i class="material-icons">today</i>
                            <p>Fixtures</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="results.php">
                            <i class="material-icons">flag</i>
                            <p>Results</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="tables.php">
                            <i class="material-icons">view_comfy</i>
                            <p>Tables</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="index.php">
                            <i class="material-icons">poll</i>
                            <p>Stats & Records</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="index.php">
                            <i class="material-icons">whatshot</i>
                            <p>Special Performances</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="index.php">
                            <i class="material-icons">monetization_on</i>
                            <p>Contribution</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="index.php">
                            <i class="material-icons">stars</i>
                            <p>Captaincy Records</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="index.php">
                            <i class="material-icons">swap_horizontal_circle</i>
                            <p>Internal Matches</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="index.php">
                            <i class="material-icons">timeline</i>
                            <p>Against Team Records</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="index.php">
                            <i class="material-icons">star</i>
                            <p>Achievements</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="index.php">
                            <i class="material-icons">account_balance</i>
                            <p>Committee Members</p>
                        </a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="index.php">
                            <i class="material-icons">photo_size_select_actual</i>
                            <p>Gallery</p>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="main-panel">
            <!-- Navbar -->
            <nav class="navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top ">
                <div class="container-fluid">
                    <div class="navbar-wrapper">
                        <a class="navbar-brand" href="javascript:;">Dashboard</a>
                    </div>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
            <span class="sr-only">Toggle navigation</span>
            <span class="navbar-toggler-icon icon-bar"></span>
            <span class="navbar-toggler-icon icon-bar"></span>
            <span class="navbar-toggler-icon icon-bar"></span>
          </button>
                    <div class="collapse navbar-collapse justify-content-end">
                        <form class="navbar-form">
                            <div class="input-group no-border">
                                <input type="text" value="" class="form-control" placeholder="Search...">
                                <button type="submit" class="btn btn-white btn-round btn-just-icon">
                  <i class="material-icons">search</i>
                  <div class="ripple-container"></div>
                </button>
                            </div>
                        </form>
                        <ul class="navbar-nav">
                            <!-- <li class="nav-item">
                                <a class="nav-link" href="javascript:;" title="Statistics">
                                    <i class="material-icons">dashboard</i>
                                    <p class="d-lg-none d-md-block">
                                        Stats
                                    </p>
                                </a>
                            </li> -->
                            <!-- <li class="nav-item dropdown">
                                <a class="nav-link" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" title="Notifications">
                                    <i class="material-icons">notifications</i>
                                    <span class="notification">5</span>
                                    <p class="d-lg-none d-md-block">
                                        Some Actions
                                    </p>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                    <a class="dropdown-item" href="#">Mike John responded to your email</a>
                                    <a class="dropdown-item" href="#">You have 5 new tasks</a>
                                    <a class="dropdown-item" href="#">You're now friend with Andrew</a>
                                    <a class="dropdown-item" href="#">Another Notification</a>
                                    <a class="dropdown-item" href="#">Another One</a>
                                </div>
                            </li> -->
                            <li class="nav-item dropdown">
                                <a class="nav-link" href="javascript:;" id="navbarDropdownProfile" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" title="Profile">
                                    <i class="material-icons">person</i>
                                    <p class="d-lg-none d-md-block">
                                        Account
                                    </p>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownProfile">
                                    <a class="dropdown-item" href="#">Profile</a>
                                    <a class="dropdown-item" href="#">Settings</a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="#">Log out</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <!-- End Navbar -->
            <div class="content">
                <div class="container-fluid">
                    <!-- Welcome Text -->
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12">
                            <div class="card card-stats">
                                <h1 class="headerTitle">Welcome to the <br>BPL Player Auction 2020</h1>
                            </div>
                        </div>
                    </div>
                    <!--  -->
                    <div class="row">
                        <div class="col-lg-3 col-md-6 col-sm-6">
                            <div class="card card-stats">
                                <div class="card-header card-header-warning card-header-icon">
                                    <div class="card-icon">
                                        <i class="material-icons">sports_handball</i>
                                    </div>
                                    <p class="card-category">Total No. of Players</p>
                                    <h3 class="card-title"><?php echo $row[0];?>
                                    </h3>
                                </div>
                                <div class="card-footer">
                                    <div class="stats">
                                        <i class="material-icons">add</i>
                                        <a href="players.php">Add a new player</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6 col-sm-6">
                            <div class="card card-stats">
                                <div class="card-header card-header-success card-header-icon">
                                    <div class="card-icon">
                                        <i class="material-icons">sports_cricket</i>
                                    </div>
                                    <p class="card-category">No. of matches played</p>
                                    <h3 class="card-title"><?php echo $resTotMatchFinal[0]; ?></h3>
                                </div>
                                <div class="card-footer">
                                    <div class="stats">
                                        <i class="material-icons">date_range</i> updated few seconds ago
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6 col-sm-6">
                            <div class="card card-stats">
                                <div class="card-header card-header-danger card-header-icon">
                                    <div class="card-icon">
                                        <i class="material-icons">calendar_today</i>
                                    </div>
                                    <p class="card-category">Upcoming Match</p>
                                    <h3 class="card-title"><?php echo $finalResUpcminMatch[0]; ?></h3>
                                </div>
                                <div class="card-footer">
                                    <div class="stats">
                                        <i class="material-icons">view_list</i> View all upcoming matches
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6 col-sm-6">
                            <div class="card card-stats">
                                <div class="card-header card-header-info card-header-icon">
                                    <div class="card-icon">
                                        <i class="material-icons">stars</i>
                                    </div>
                                    <p class="card-category">Player of the week</p>
                                    <h3 class="card-title">Haafi Ka</h3>
                                </div>
                                <div class="card-footer">
                                    <div class="stats">
                                        <i class="material-icons">update</i> updated weekly
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- <div class="row">
                        <div class="col-md-4">
                            <div class="card card-chart">
                                <div class="card-header card-header-success">
                                    <div class="ct-chart" id="dailySalesChart"></div>
                                </div>
                                <div class="card-body">
                                    <h4 class="card-title">Daily Sales</h4>
                                    <p class="card-category">
                                        <span class="text-success"><i class="fa fa-long-arrow-up"></i> 55% </span> increase in today sales.</p>
                                </div>
                                <div class="card-footer">
                                    <div class="stats">
                                        <i class="material-icons">access_time</i> updated 4 minutes ago
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="card card-chart">
                                <div class="card-header card-header-warning">
                                    <div class="ct-chart" id="websiteViewsChart"></div>
                                </div>
                                <div class="card-body">
                                    <h4 class="card-title">Email Subscriptions</h4>
                                    <p class="card-category">Last Campaign Performance</p>
                                </div>
                                <div class="card-footer">
                                    <div class="stats">
                                        <i class="material-icons">access_time</i> campaign sent 2 days ago
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="card card-chart">
                                <div class="card-header card-header-danger">
                                    <div class="ct-chart" id="completedTasksChart"></div>
                                </div>
                                <div class="card-body">
                                    <h4 class="card-title">Completed Tasks</h4>
                                    <p class="card-category">Last Campaign Performance</p>
                                </div>
                                <div class="card-footer">
                                    <div class="stats">
                                        <i class="material-icons">access_time</i> campaign sent 2 days ago
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div> -->
                    <div class="row">
                        <div class="col-lg-6 col-md-12">
                            <div class="card">
                                <div class="card-header card-header-primary">
                                    <h4 class="card-title">Match Fixtures</h4>
                                    <p class="card-category">List of upcoming matches</p>
                                </div>
                                <div class="card-body table-responsive">
                                    <table class="table table-hover">
                                        <thead class="text-primary">
                                            <th>With</th>
                                            <th>Match Date</th>
                                            <th>Time</th>
                                            <th>Ground</th>
                                        </thead>
                                        <tbody>
                                        <?php
                                            while($rows=mysqli_fetch_array($resultFix))
                                            {
                                        ?>
                                            <tr>
                                                <td> <?php echo $rows['withTeam']; ?> </td>
                                                <td> <?php echo $rows['date']; ?> </td>
                                                <td> <?php echo $rows['time']; ?> </td>
                                                <td> <?php echo $rows['ground']; ?> </td>
                                            </tr>
                                            <?php
                                                }
                                            ?>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-12">
                            <div class="card">
                                <div class="card-header card-header-success">
                                    <h4 class="card-title">Match Statistics</h4>
                                    <p class="card-category">Summary of recently played matches</p>
                                </div>
                                <div class="card-body table-responsive">
                                    <table class="table table-hover">
                                        <thead class="text-primary">
                                            <th>With</th>
                                            <th>Match Date</th>
                                            <th>Result</th>
                                            <th>Ground</th>
                                        </thead>
                                        <tbody>
                                        <?php
                                            while($rows1=mysqli_fetch_array($resultMatchResults))
                                            {
                                        ?>
                                            <tr>
                                                <td> <?php echo $rows1['withTeam']; ?> </td>
                                                <td> <?php echo $rows1['date']; ?> </td>
                                                <td> <?php echo $rows1['result']; ?> </td>
                                                <td> <?php echo $rows1['ground']; ?> </td>
                                            </tr>
                                            <?php
                                            }
                                            ?>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <footer class="footer">
                <div class="container-fluid">
                    <nav class="float-left">
                        <ul>
                            <li>
                                <a href="https://www.creative-tim.com">
                  Blasters Sports Club Puttalam
                </a>
                            </li>
                        </ul>
                    </nav>
                    <div class="copyright float-right">
                        &copy;
                        <script>
                            document.write(new Date().getFullYear())
                        </script>, made with <i class="material-icons">favorite</i> by
                        <a href="www.zolatik.com" target="_blank">Adam</a>
                    </div>
                </div>
            </footer>
        </div>
    </div>
    
    <!--   Core JS Files   -->
    <script src="assets/js/core/jquery.min.js"></script>
    <script src="assets/js/core/popper.min.js"></script>
    <script src="assets/js/core/bootstrap-material-design.min.js"></script>
    <script src="assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
    <!-- Plugin for the momentJs  -->
    <script src="assets/js/plugins/moment.min.js"></script>
    <!--  Plugin for Sweet Alert -->
    <script src="assets/js/plugins/sweetalert2.js"></script>
    <!-- Forms Validations Plugin -->
    <script src="assets/js/plugins/jquery.validate.min.js"></script>
    <!-- Plugin for the Wizard, full documentation here: https://github.com/VinceG/twitter-bootstrap-wizard -->
    <script src="assets/js/plugins/jquery.bootstrap-wizard.js"></script>
    <!--	Plugin for Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->
    <script src="assets/js/plugins/bootstrap-selectpicker.js"></script>
    <!--  Plugin for the DateTimePicker, full documentation here: https://eonasdan.github.io/bootstrap-datetimepicker/ -->
    <script src="assets/js/plugins/bootstrap-datetimepicker.min.js"></script>
    <!--  DataTables.net Plugin, full documentation here: https://datatables.net/  -->
    <script src="assets/js/plugins/jquery.dataTables.min.js"></script>
    <!--	Plugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->
    <script src="assets/js/plugins/bootstrap-tagsinput.js"></script>
    <!-- Plugin for Fileupload, full documentation here: http://www.jasny.net/bootstrap/javascript/#fileinput -->
    <script src="assets/js/plugins/jasny-bootstrap.min.js"></script>
    <!--  Full Calendar Plugin, full documentation here: https://github.com/fullcalendar/fullcalendar    -->
    <script src="assets/js/plugins/fullcalendar.min.js"></script>
    <!-- Vector Map plugin, full documentation here: http://jvectormap.com/documentation/ -->
    <script src="assets/js/plugins/jquery-jvectormap.js"></script>
    <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
    <script src="assets/js/plugins/nouislider.min.js"></script>
    <!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js"></script>
    <!-- Library for adding dinamically elements -->
    <script src="assets/js/plugins/arrive.min.js"></script>
    <!--  Google Maps Plugin    -->
    <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
    <!-- Chartist JS -->
    <script src="assets/js/plugins/chartist.min.js"></script>
    <!--  Notifications Plugin    -->
    <script src="assets/js/plugins/bootstrap-notify.js"></script>
    <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
    <script src="assets/js/material-dashboard.js?v=2.1.2" type="text/javascript"></script>
    <!-- Material Dashboard DEMO methods, don't include it in your project! -->
    <script src="assets/demo/demo.js"></script>
    <script>
        $(document).ready(function() {
            $().ready(function() {
                $sidebar = $('.sidebar');

                $sidebar_img_container = $sidebar.find('.sidebar-background');

                $full_page = $('.full-page');

                $sidebar_responsive = $('body > .navbar-collapse');

                window_width = $(window).width();

                fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();

                if (window_width > 767 && fixed_plugin_open == 'Dashboard') {
                    if ($('.fixed-plugin .dropdown').hasClass('show-dropdown')) {
                        $('.fixed-plugin .dropdown').addClass('open');
                    }

                }

                $('.fixed-plugin a').click(function(event) {
                    // Alex if we click on switch, stop propagation of the event, so the dropdown will not be hide, otherwise we set the  section active
                    if ($(this).hasClass('switch-trigger')) {
                        if (event.stopPropagation) {
                            event.stopPropagation();
                        } else if (window.event) {
                            window.event.cancelBubble = true;
                        }
                    }
                });

                $('.fixed-plugin .active-color span').click(function() {
                    $full_page_background = $('.full-page-background');

                    $(this).siblings().removeClass('active');
                    $(this).addClass('active');

                    var new_color = $(this).data('color');

                    if ($sidebar.length != 0) {
                        $sidebar.attr('data-color', new_color);
                    }

                    if ($full_page.length != 0) {
                        $full_page.attr('filter-color', new_color);
                    }

                    if ($sidebar_responsive.length != 0) {
                        $sidebar_responsive.attr('data-color', new_color);
                    }
                });

                $('.fixed-plugin .background-color .badge').click(function() {
                    $(this).siblings().removeClass('active');
                    $(this).addClass('active');

                    var new_color = $(this).data('background-color');

                    if ($sidebar.length != 0) {
                        $sidebar.attr('data-background-color', new_color);
                    }
                });

                $('.fixed-plugin .img-holder').click(function() {
                    $full_page_background = $('.full-page-background');

                    $(this).parent('li').siblings().removeClass('active');
                    $(this).parent('li').addClass('active');


                    var new_image = $(this).find("img").attr('src');

                    if ($sidebar_img_container.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {
                        $sidebar_img_container.fadeOut('fast', function() {
                            $sidebar_img_container.css('background-image', 'url("' + new_image + '")');
                            $sidebar_img_container.fadeIn('fast');
                        });
                    }

                    if ($full_page_background.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {
                        var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');

                        $full_page_background.fadeOut('fast', function() {
                            $full_page_background.css('background-image', 'url("' + new_image_full_page + '")');
                            $full_page_background.fadeIn('fast');
                        });
                    }

                    if ($('.switch-sidebar-image input:checked').length == 0) {
                        var new_image = $('.fixed-plugin li.active .img-holder').find("img").attr('src');
                        var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');

                        $sidebar_img_container.css('background-image', 'url("' + new_image + '")');
                        $full_page_background.css('background-image', 'url("' + new_image_full_page + '")');
                    }

                    if ($sidebar_responsive.length != 0) {
                        $sidebar_responsive.css('background-image', 'url("' + new_image + '")');
                    }
                });

                $('.switch-sidebar-image input').change(function() {
                    $full_page_background = $('.full-page-background');

                    $input = $(this);

                    if ($input.is(':checked')) {
                        if ($sidebar_img_container.length != 0) {
                            $sidebar_img_container.fadeIn('fast');
                            $sidebar.attr('data-image', '#');
                        }

                        if ($full_page_background.length != 0) {
                            $full_page_background.fadeIn('fast');
                            $full_page.attr('data-image', '#');
                        }

                        background_image = true;
                    } else {
                        if ($sidebar_img_container.length != 0) {
                            $sidebar.removeAttr('data-image');
                            $sidebar_img_container.fadeOut('fast');
                        }

                        if ($full_page_background.length != 0) {
                            $full_page.removeAttr('data-image', '#');
                            $full_page_background.fadeOut('fast');
                        }

                        background_image = false;
                    }
                });

                $('.switch-sidebar-mini input').change(function() {
                    $body = $('body');

                    $input = $(this);

                    if (md.misc.sidebar_mini_active == true) {
                        $('body').removeClass('sidebar-mini');
                        md.misc.sidebar_mini_active = false;

                        $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar();

                    } else {

                        $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar('destroy');

                        setTimeout(function() {
                            $('body').addClass('sidebar-mini');

                            md.misc.sidebar_mini_active = true;
                        }, 300);
                    }

                    // we simulate the window Resize so the charts will get updated in realtime.
                    var simulateWindowResize = setInterval(function() {
                        window.dispatchEvent(new Event('resize'));
                    }, 180);

                    // we stop the simulation of Window Resize after the animations are completed
                    setTimeout(function() {
                        clearInterval(simulateWindowResize);
                    }, 1000);

                });
            });
        });
    </script>
    <script>
        $(document).ready(function() {
            // Javascript method's body can be found in assets/js/demos.js
            md.initDashboardPageCharts();

        });
    </script>
</body>

</html>