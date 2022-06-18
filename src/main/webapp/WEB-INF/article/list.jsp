<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../../header.jsp"></jsp:include>

               <!-- dashboard inner -->
               <div class="midde_cont">
                  <div class="container-fluid">
                     <div class="row column_title">
                        <div class="col-md-12">
                           <div class="page_title">
                              <h2>Article</h2>
                           </div>
                        </div>
                     </div>
                     <!-- row -->
                     <div class="row">
                        <!-- table section -->
                        <div class="col-md-6">
                           <div class="white_shd full margin_bottom_30">
                              <div class="full graph_head">
                                 <div class="heading1 margin_0">
                                    <h2>Formulaire pour ajouter un article</h2>
                                 </div>
                              </div>
                              <div class="table_section padding_infor_info">
                                 <div class="table-responsive-sm">
				                     <form>
				                        <fieldset>
				                           <div style="display: block">
				                              <label class="label_field">Nom</label>
				                              <input style="width: 100%; outline: none; border: 1px solid #d8d8d8; height: 40px; padding-left: 10px;" type="text" name="nom" placeholder="Nom" />
				                           </div>
				                           <div style="margin-top: 20px;">
				                              <label class="label_field">Stock</label>
				                              <input style="width: 100%; outline: none; border: 1px solid #d8d8d8; height: 40px; padding-left: 10px;" type="number" name="stock" placeholder="Stock" />
				                           </div>
				                           <div style="margin: 0 auto; margin-top: 30px; width: 135px; ">
				                              <button class="main_bt center">Enregistrer</button>
				                           </div>
				                        </fieldset>
				                     </form>
                                 </div>
                              </div>
                           </div>
                        </div>
                        <!-- table section -->
                        <div class="col-md-6">
                           <div class="white_shd full margin_bottom_30">
                              <div class="full graph_head">
                                 <div class="heading1 margin_0">
                                    <h2>Liste des articles</h2>
                                 </div>
                              </div>
                              <div class="table_section padding_infor_info">
                                 <div class="table-responsive-sm">
                                    <table class="table table-striped">
                                       <thead>
                                          <tr>
                                             <th>#</th>
                                             <th>Nom</th>
                                             <th>Stock</th>
                                          </tr>
                                       </thead>
                                       <tbody>
                                          <tr>
                                             <td>1</td>
                                             <td>Ordinateur</td>
                                             <td>3 500</td>
                                          </tr>
                                          <tr>
                                             <td>2</td>
                                             <td>Meuble</td>
                                             <td>2 500</td>
                                          </tr>
                                          <tr>
                                             <td>3</td>
                                             <td>Téléphone</td>
                                             <td>2 800</td>
                                          </tr>
                                          <tr>
                                             <td>4</td>
                                             <td>Lit</td>
                                             <td>4 080</td>
                                          </tr>
                                       </tbody>
                                    </table>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
                  
<jsp:include page="../../footer.jsp"></jsp:include>