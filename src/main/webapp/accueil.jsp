<jsp:include page="header.jsp"></jsp:include>
<!-- dashboard inner -->
<div class="midde_cont">
   <div class="container-fluid">
      <div class="row column_title">
         <div class="col-md-12">
            <div class="page_title">
               <h2>Dashboard</h2>
            </div>
         </div>
      </div>
      <div class="row column1">
         <div class="col-md-6 col-lg-3">
            <div class="full counter_section margin_bottom_30">
               <div class="couter_icon">
                  <div> 
                     <i class="fa fa-list yellow_color"></i>
                  </div>
               </div>
               <div class="counter_no">
                  <div>
                     <p class="total_no">25</p>
                     <p class="head_couter">Articles</p>
                  </div>
               </div>
            </div>
         </div>
         <div class="col-md-6 col-lg-3">
            <div class="full counter_section margin_bottom_30">
               <div class="couter_icon">
                  <div> 
                     <i class="fa fa-check-square-o blue1_color"></i>
                  </div>
               </div>
               <div class="counter_no">
                  <div>
                     <p class="total_no">12</p>
                     <p class="head_couter">Commandes</p>
                  </div>
               </div>
            </div>
         </div>
         <div class="col-md-6 col-lg-3">
            <div class="full counter_section margin_bottom_30">
               <div class="couter_icon">
                  <div> 
                     <i class="fa fa-money green_color"></i>
                  </div>
               </div>
               <div class="counter_no">
                  <div>
                     <p class="total_no">8</p>
                     <p class="head_couter">Paiements</p>
                  </div>
               </div>
            </div>
         </div>
         <div class="col-md-6 col-lg-3">
            <div class="full counter_section margin_bottom_30">
               <div class="couter_icon">
                  <div> 
                     <i class="fa fa-cart-plus red_color"></i>
                  </div>
               </div>
               <div class="counter_no">
                  <div>
                     <p class="total_no">5</p>
                     <p class="head_couter">Paniers</p>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- graph -->
      <div class="row column2 graph margin_bottom_30">
         <div class="col-md-l2 col-lg-12">
            <div class="white_shd full">
               <div class="full graph_head">
                  <div class="heading1 margin_0">
                     <h2>Diagramme statistique des produits en fonction du stock</h2>
                  </div>
               </div>
               <div class="full graph_revenue">
                  <div class="row">
                     <div class="col-md-12">
                        <div class="content">
                           <div class="area_chart">
                              <canvas height="120" id="canvas"></canvas>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- end graph -->
   </div>
   <!-- footer -->
   <jsp:include page="footer.jsp"></jsp:include>