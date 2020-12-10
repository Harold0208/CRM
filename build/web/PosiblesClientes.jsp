<%-- 
    Document   : PosiblesCientes
    Created on : 3/12/2020, 02:55:21 AM
    Author     : darkb
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title> Posibles Clientes </title>
  <!-- Bootstrap core CSS-->
  <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
    <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
  <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
  <script src="js/sweetalert.min.js" type="text/javascript"></script>
    </head>
    <body>
        
        <%
            
            Models.clsPosiblesClientes obclsPosiblesClientes = new Models.clsPosiblesClientes();
            
            if(request.getAttribute("obclsPosiblesClientes")!=null) {
             obclsPosiblesClientes = (Models.clsPosiblesClientes) request.getAttribute("obclsPosiblesClientes");
            }
            
         List<Models.clsPosiblesClientes> lstclsPosiblesClientes = 
                      new ArrayList<Models.clsPosiblesClientes> ();
         
           // existencia de la variable de sesion
             if (session.getAttribute("session_lstclsPosiblesClientes") != null){
                 
             // casting para darle un tipo de dato a la variable de sesion
                 lstclsPosiblesClientes = (List<Models.clsPosiblesClientes>) session.getAttribute("session_lstclsPosiblesClientes");
             }
             
         if (request.getAttribute("stMensaje") !=null && 
               request.getAttribute("stTipo") !=null)  {
        %>
          
        <input type="text" hidden="" id="txtMensaje" 
               value="<%= request.getAttribute("stMensaje") %>" />
        
        <input type="text" hidden="" id="txtTipo" 
               value="<%= request.getAttribute("stTipo") %>" />
        <script> 
            var mensaje =  document.getElementById("txtMensaje").value;
            var tipo = document.getElementById("txtTipo").value;
            
            swal("Mensaje",mensaje,tipo);
            </script>
        <% 
          }
        %>
        
        <div class="container"> 
            <div class="card mx-auto mt-5" >
                <div class="card-header">Posibles Clientes </div>
                <div class="card-body" > 
                    <form action="PosiblesClientesController" method="post">
                        <!-- fila -->
                   <div class="form-group">     
                <div class="form-row">
                    
                    <!-- columna -->
                    <div class=" cool-md-6">
                        
                        <input type="submit"value="Guardar" class="btn btn-primary" 
                               name="btnGuardar">
                        <input type="submit"value="Modificar" class="btn btn-primary"
                               name="btnModificar">
                        <input type="submit"value="Cancelar" class="btn btn-primary" 
                               name="btnCancelar">
                          
                        
                         <a class="btn btn-primary" href="Index.jsp">Volver</a>
                         <input type="text"
                                name="codigoModificar"
                                id="codigoModificar"
                                value="<%= obclsPosiblesClientes.getInCodigo() %>"
                                hidden=""/> 
                    </div>
                    </div>
                </div>  
                        <div class="form-group">
                            <div class="form-row">
                                    <hl>Informacion de Posible cliente</hl>
                            </div>
                        </div>
                        <!-- fila -->
                        <div class="form-group">     
                            <div class="form-row">
                                <!-- columna -->
                                <div class="col-md-3"> 
                                 <label name="lblEmpresa">Empresa</label>
                                 <input type="text"placeholder="Empresa" name="txtEmpresa" 
                                        class="form-control" 
                                        value="<%= obclsPosiblesClientes.getStEmpresa() !=null ? obclsPosiblesClientes.getStEmpresa() :""  %>" />
                                         
                                </div>
                                <!-- columna -->
                                <div class="col-md-3"> 
                                <label name="lblNombre">Nombre</label>
                                <input type="text"placeholder="Nombre" name="txtNombre" 
                                       class="form-control" 
                                       value="<%= obclsPosiblesClientes.getStNombre()!=null ? obclsPosiblesClientes.getStNombre():""  %>"/>
                                 
                                </div>
                                <!-- columna -->
                                <div class="col-md-3"> 
                                <label name="lblApellidos">Apellidos</label>
                                 <input type="text"placeholder="Apellidos" name="txtApellidos" 
                                        class="form-control" 
                                         value="<%= obclsPosiblesClientes.getStApellidos()!=null ? obclsPosiblesClientes.getStApellidos():""  %>"/>
                                </div>
                                <!-- columna -->
                                <div class="col-md-3"> 
                                <label name="lblTitulo">Titulo</label>
                                 <input type="text"placeholder="Titulo" name="txtTitulo" 
                                        class="form-control"
                                         value="<%= obclsPosiblesClientes.getStTitulo()!=null ? obclsPosiblesClientes.getStTitulo():""  %>"/>
                                </div>
                            </div>
                        </div>
                        <!-- fila -->
                        <div class="form-group">     
                            <div class="form-row">
                                <!-- columna -->
                                <div class="col-md-3"> 
                                 <label name="lblCorreoElectronico">Correo electronico</label>
                                 <input type="text"placeholder="Correo electronico" name="txtCorreoElectronico" 
                                        class="form-control" 
                                         value="<%= obclsPosiblesClientes.getStCorreoElectronico()!=null ? obclsPosiblesClientes.getStCorreoElectronico():""  %>"/>
                                </div>
                                <!-- columna -->
                                <div class="col-md-3"> 
                                <label name="lblTelefono">Telefono</label>
                                 <input type="text"placeholder="Telefono" name="txtTelefono" 
                                        class="form-control"
                                         value="<%= obclsPosiblesClientes.getStTelefono()!=null ? obclsPosiblesClientes.getStTelefono():""  %>"/>
                                </div>
                                <!-- columna -->
                                <div class="col-md-3"> 
                                <label name="lblFax">Fax</label>
                                 <input type="text"placeholder="Fax" name="txtFax" 
                                        class="form-control"
                                         value="<%= obclsPosiblesClientes.getStFax()!=null ? obclsPosiblesClientes.getStFax():""  %>"/>
                                </div>
                                <!-- columna -->
                                <div class="col-md-3"> 
                                <label name="lblMovil">Movil</label>
                                 <input type="text"placeholder="Movil" name="txtMovil" 
                                        class="form-control"
                                        value="<%= obclsPosiblesClientes.getStMovil()!=null ? obclsPosiblesClientes.getStMovil():""  %>" />
                                </div>
                            </div>
                        </div>
                         <!-- fila -->
                        <div class="form-group">     
                            <div class="form-row">
                                <!-- columna -->
                                <div class="col-md-3"> 
                                 <label name="lblSitioWeb">Sitio web</label>
                                 <input type="text"placeholder="Sitio web" name="txtWeb"
                                        class="form-control"
                                         value="<%= obclsPosiblesClientes.getStSitioWeb()!=null ? obclsPosiblesClientes.getStSitioWeb():""  %>"/>
                                </div>
                              
                           
                         <div class="col-md-3">
                             <label name="lblFuentePosibleCliente">Fuente de posible cliente</label>
                             <select class="form-control" name="ddlFuentePosibleCliente">
                             <option value="1" <%= obclsPosiblesClientes.obclsFuentePosibeCliente != null ? obclsPosiblesClientes.obclsFuentePosibeCliente.getInCodigo() == 1 ? "selected" : "" :""  %>>Ninguno</option>
                             <option value="2"<%= obclsPosiblesClientes.obclsFuentePosibeCliente != null ? obclsPosiblesClientes.obclsFuentePosibeCliente.getInCodigo() == 2 ? "selected" : "" :""  %>>Aviso</option>
                             <option value="3"<%= obclsPosiblesClientes.obclsFuentePosibeCliente != null ? obclsPosiblesClientes.obclsFuentePosibeCliente.getInCodigo() == 3 ? "selected" : "" :""  %>>Llamada no solicitada</option>
                             <option value="4"<%= obclsPosiblesClientes.obclsFuentePosibeCliente != null ? obclsPosiblesClientes.obclsFuentePosibeCliente.getInCodigo() == 4 ? "selected" : "" :""  %>>Recomendacion de empleado</option>
                             <option value="5"<%= obclsPosiblesClientes.obclsFuentePosibeCliente != null ? obclsPosiblesClientes.obclsFuentePosibeCliente.getInCodigo() == 5 ? "selected" : "" :""  %>>Recomendacion externa</option>
                             <option value="6"<%= obclsPosiblesClientes.obclsFuentePosibeCliente != null ? obclsPosiblesClientes.obclsFuentePosibeCliente.getInCodigo() == 6 ? "selected" : "" :""  %>>Tienda en linea</option>
                             </select>
                         </div>
                         <div class="col-md-3">
                             <label name="lblEstadoPosibleCliente">Estado de posible cliente</label>
                             <select class="form-control" name="ddlEstadoPosibleCliente">
                               <option value="1"<%= obclsPosiblesClientes.obclsEStadoPosibleCliente != null ? obclsPosiblesClientes.obclsEStadoPosibleCliente.getInCodigo() == 1 ? "selected" : "" :""  %> >Ninguno</option>
                                 <option value="2"<%= obclsPosiblesClientes.obclsEStadoPosibleCliente != null ? obclsPosiblesClientes.obclsEStadoPosibleCliente.getInCodigo() == 2 ? "selected" : "" :""  %> >Intento de contacto</option> 
                                 <option value="3"<%= obclsPosiblesClientes.obclsEStadoPosibleCliente != null ? obclsPosiblesClientes.obclsEStadoPosibleCliente.getInCodigo() == 3 ? "selected" : "" :""  %>> Contactar en el futuro</option>
                                 <option value="4"<%= obclsPosiblesClientes.obclsEStadoPosibleCliente != null ? obclsPosiblesClientes.obclsEStadoPosibleCliente.getInCodigo() == 4 ? "selected" : "" :""  %> > Contactado </option>
                                 <option value="5"<%= obclsPosiblesClientes.obclsEStadoPosibleCliente != null ? obclsPosiblesClientes.obclsEStadoPosibleCliente.getInCodigo() == 5 ? "selected" : "" :""  %> > Posible cliente no solicitado </option>
                                 <option value="6"<%= obclsPosiblesClientes.obclsEStadoPosibleCliente != null ? obclsPosiblesClientes.obclsEStadoPosibleCliente.getInCodigo() == 6 ? "selected" : "" :""  %> >Posible cliente perdido</option>
                             </select>
                             
                         </div>
                         <div class="col-md-3">
                             <label name="lblSector">Sector</label>
                             <select class="form-control" name="ddlSector">
                             <option value="1"<%= obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 1 ? "selected" : "" :""  %>>Ninguno</option>
                              <option value="2"<%= obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 2 ? "selected" : "" :""  %> >APS (Proveedor de servicios de aplicaciones)</option>
                              <option value="3"<%= obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 3 ? "selected" : "" :""  %> >OEM de datos </option>
                              <option value="4"<%= obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 4 ? "selected" : "" :""  %> >ERP (Planificacion de recursos de empresa) </option>
                              <option value="5"<%= obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 5 ? "selected" : "" :""  %> >Gobierno/Ejercito </option>
                              <option value="6"<%= obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 6 ? "selected" : "" :""  %> >Empresa grande </option>
                              </select>
                         </div>
                                  </div>
                         </div>
                           <!-- fila -->
                         <div class="form-group">     
                            <div class="form-row">
                                <!-- columna -->
                                <div class="col-md-3"> 
                                 <label name="lblCantidadEmpleados">Cantidad de empleados</label>
                                 <input type="number"placeholder="Cantidad de empleados" name="txtCantidadEmpleados"
                                        class="form-control"
                                        value="<%= obclsPosiblesClientes.getInCantidadEmpleados()!=0 ? obclsPosiblesClientes.getInCantidadEmpleados():""  %>" />
                                </div>
                                <!-- columna -->
                                <div class="col-md-3"> 
                                <label name="lblIngresosAnuales">Ingresos Anuales</label>
                                 <input type="number"placeholder="Ingresos Anuales" name="txtIngresosAnuales" 
                                        class="form-control"
                                         value="<%= obclsPosiblesClientes.getDbIngresosAnuales()!=0 ? obclsPosiblesClientes.getDbIngresosAnuales():""  %>"/>
                                </div>
                                <!-- columna -->
                                <div class="col-md-3">
                             <label name="lblCalificacion">Calificacion</label>
                             <select class="form-control" name="ddlCalificacion">
                              <option value="1"<%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 1 ? "selected" : "" :""  %> >Ninguno</option>
                                 <option value="2"<%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 2 ? "selected" : "" :""  %> >Adquirido</option>
                                  <option value="3"<%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 3 ? "selected" : "" :""  %> >Activo</option>
                                  <option value="4"<%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 4 ? "selected" : "" :""  %> >Contactado</option>
                                  <option value="5"<%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 5 ? "selected" : "" :""  %>>Fallo de mercado</option>
                                  <option value="6"<%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 6 ? "selected" : "" :""  %>>Proyecto cancelado</option>
                                  <option value="7"<%= obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 7 ? "selected" : "" :""  %>>Apagar</option>
                              </select>
                                </div>
                              <div class="col-md-3">
                                  <label name="lblNoParticipacionCorreoElectronico">
                                      
                                      <input type="checkbox" name="chkNoParticipacionCorreoElectronico"/>
                                      No participacion correo electronico
                                  </label>    
                           </div>       
                         </div>
                            </div> 
                              <!-- fila -->
                        <div class="form-group">     
                            <div class="form-row">
                                
                                <!-- columna -->
                                <div class="col-md-3"> 
                                <label name="lblIDSkype">ID de Skype</label>
                                 <input type="text"placeholder="IDSkype" name="txtIDSkype" 
                                        class="form-control" 
                                         value="<%= obclsPosiblesClientes.getStIDSkype()!=null ? obclsPosiblesClientes.getStIDSkype():""  %>"/>
                                </div>
                                <!-- columna -->
                                <div class="col-md-3"> 
                                <label name="lblNombre">Twitter</label>
                                <input type="text"placeholder="Twitter" name="txtTwitter" 
                                       class="form-control" 
                                       value="<%= obclsPosiblesClientes.getStTwitter()!=null ? obclsPosiblesClientes.getStTwitter():""  %>"/>
                                </div>
                                 <!-- columna -->
                                <div class="col-md-6"> 
                                <label name="lblCorreoElectronicoSecundario">correo electronico secundario</label>
                                 <input type="text"placeholder="correo electronico secundario" name="txtCorreoElectronicoSecundario" 
                                        class="form-control" 
                                         value="<%= obclsPosiblesClientes.getStCorreoElectronicoSecundario()!=null ? obclsPosiblesClientes.getStCorreoElectronicoSecundario():""  %>"/>
                                </div>
                                </div>
                                </div>
                                
                                
                                
                                
                                <!--FILA-->
                                <div class="form-group">
                                    <div clases="form-row">
                                   <!-- COLUMNA-->
                                   <div class="col-12">
                                       <b>
                                           <i class="fa fa-clipboard"></i>
                                           Registros: <%= lstclsPosiblesClientes.size() %>
                                           
                                       </b>
                                       
                                     </div>  
                                     </div>  
                                   </div>
                                    
                                <!-- FILA -->
                                <div class="form-group">
                                    <div class="form-row">
                                        
                                        <!-- COLUMNA-->
                                        <div class="col-12"> 
                                            <table class="table table-bordered
                                                   table-responsive"> 
                                            <!-- FILA -->     
                                            <tr>
                                           <!-- COLUMNA-->     
                                           <td>Empresa </td>
                                           <td>Nombre</td> 
                                           <td>Apellidos </td> 
                                           <td>Titulo</td> 
                                           <td>Correo electronico </td> 
                                           <td>Telefono</td> 
                                           <td>Fax</td> 
                                           <td>Movil</td> 
                                           <td>Sitio web </td> 
                                           <td>Fuente de posible cliente</td> 
                                           <td>Estado de posible cliente </td> 
                                           <td>Sector</td> 
                                           <td>Cantidad de empleados</td> 
                                           <td>Ingresos Anuales </td> 
                                           <td>Calificacion </td> 
                                           <td>No participacion correo electronico</td> 
                                            <td>ID de skype </td>
                                            <td>Twitter</td>
                                            <td>Correo electronico secundario</td>
                                            <td>Opciones</td>
                                               
                                            </tr>
                                            <%
                                            for (Models.clsPosiblesClientes item: lstclsPosiblesClientes ){
                                              Models.clsFuentePosibeCliente obclsFuentePosibeCliente = item.getObclsFuentePosibeCliente();
                                              Models.clsEStadoPosibleCliente obclsEStadoPosibleCliente =item.getObclsEStadoPosibleCliente();
                                              Models.clsSector obclsSector=item.getObclsSector();
                                              Models.clsCalificacion obclsCalificacion=item.getObclsCalificacion();

                                            %>
                                            <tr>  
                                           <td><%= item.getStEmpresa() %></td> 
                                           <td><%= item.getStNombre() %></td> 
                                           <td><%= item.getStApellidos() %></td> 
                                           <td><%= item.getStTitulo() %></td> 
                                           <td><%= item.getStCorreoElectronico() %></td>
                                           <td><%= item.getStTelefono() %></td> 
                                           <td><%= item.getStFax() %></td> 
                                           <td><%= item.getStMovil() %></td> 
                                           <td><%= item.getStSitioWeb() %></td> 
                                           <td><%= obclsFuentePosibeCliente.getStDesripcion()%></td>
                                           <td><%= obclsEStadoPosibleCliente.getStDesripcion() %></td> 
                                           <td><%= obclsSector.getStDesripcion()  %></td> 
                                           <td><%= item.getInCantidadEmpleados() %></td> 
                                           <td><%= item.getDbIngresosAnuales() %> </td> 
                                           <td><%= obclsCalificacion.getStDesripcion() %></td>
                                           <td><%= item.getChNoParticipacionCorreoElectronico() %></td> 
                                           <td><%= item.getStIDSkype() %></td> 
                                           <td><%= item.getStTwitter() %></td> 
                                           <td><%= item.getStCorreoElectronicoSecundario()  %></td> 
                                           <td>
                                               <a class="btn btn-success btn-sm"
                                                  href="PosiblesClientesController?stOpcion=M&codigoSeleccionado=<%= item.getInCodigo()%> ">
                                                   Modificar</a>
                                                   <a class="btn btn-danger btn-sm"
                                                  href="PosiblesClientesController?stOpcion=E&codigoSeleccionado=<%= item.getInCodigo()%> ">
                                                   Eliminar</a>
                                           </td>
                                            </tr>
                                            
                                            <%
                                            }
                                            %>
                                            
                                            </table>
                                        </div>
                                            </div>
                                            </div>
                                            </div>
            
                            </form>
                                            </div>
                                            </div>
                                           
</body>
</html>