<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- basic -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>Cours JEE JSP Servlet</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- site icon -->
      <link rel="icon" href="public/pages/images/fevicon.png" type="image/png" />
      <!-- bootstrap css -->
      <link rel="stylesheet" href="public/pages/css/bootstrap.min.css" />
      <!-- site css -->
      <link rel="stylesheet" href="public/pages/style.css" />
      <!-- responsive css -->
      <link rel="stylesheet" href="public/pages/css/responsive.css" />
      <!-- color css -->
      <link rel="stylesheet" href="public/pages/css/colors.css" />
      <!-- select bootstrap -->
      <link rel="stylesheet" href="public/pages/css/bootstrap-select.css" />
      <!-- scrollbar css -->
      <link rel="stylesheet" href="public/pages/css/perfect-scrollbar.css" />
      <!-- custom css -->
      <link rel="stylesheet" href="public/pages/css/custom.css" />
      <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
      <![endif]-->
   </head>
   <body class="dashboard dashboard_1">
      <div class="full_container">
         <div class="inner_container">
            <!-- Sidebar  -->
            <nav id="sidebar">
               <div class="sidebar_blog_1">
                  <div class="sidebar-header">
                     <div class="logo_section">
                        <a href="index.html"><img class="logo_icon img-responsive" src="public/pages/images/logo/logo_icon.png" alt="#" /></a>
                     </div>
                  </div>
                  <div class="sidebar_user_info">
                     <div class="icon_setting"></div>
                     <div class="user_profle_side">
                        <div class="user_img"><img class="img-responsive" src="public/pages/images/layout_img/user_img.jpg" alt="#" /></div>
                        <div class="user_info">
                           <h6>Malick COLY</h6>
                           <p><span class="online_animation"></span> Online</p>
                        </div>
                     </div>
                  </div>
               </div>
               <div class="sidebar_blog_2">
                  <h4>General</h4>
                  <ul class="list-unstyled components">
                  	<li><a href="Accueil"><i class="fa fa-dashboard orange_color"></i> <span>Accueil</span></a></li>
                     <li><a href="Article"><i class="fa fa-list yellow_color"></i> <span>Article</span></a></li>
                     <li><a href="Commande"><i class="fa fa-check-square-o blue1_color"></i> <span>Commande</span></a></li>
                     <li><a href="Paiement"><i class="fa fa-money green_color"></i> <span>Paiement</span></a></li>
                     <li><a href="Panier"><i class="fa fa-cart-plus red_color"></i> <span>Panier</span></a></li>
                  </ul>
               </div>
            </nav>
            <!-- end sidebar -->
            <!-- right content -->
            <div id="content">
               <!-- topbar -->
               <div class="topbar">
                  <nav class="navbar navbar-expand-lg navbar-light">
                     <div class="full">
                        <button type="button" id="sidebarCollapse" class="sidebar_toggle"><i class="fa fa-bars"></i></button>
                        <div class="right_topbar">
                           <div class="icon_info">
                              <ul class="user_profile_dd">
                                 <li>
                                    <a class="dropdown-toggle" data-toggle="dropdown"><img class="img-responsive rounded-circle" src="public/pages/images/layout_img/user_img.jpg" alt="#" /><span class="name_user">Malick COLY</span></a>
                                    <div class="dropdown-menu">
                                       <a class="dropdown-item" href="#"><span>Déconnexion</span> <i class="fa fa-sign-out"></i></a>
                                    </div>
                                 </li>
                              </ul>
                           </div>
                        </div>
                     </div>
                  </nav>
               </div>
               <!-- end topbar -->