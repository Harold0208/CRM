package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;

public final class PosiblesClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("  <title> Posibles Clientes </title>\n");
      out.write("  <!-- Bootstrap core CSS-->\n");
      out.write("  <link href=\"vendor/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- Custom fonts for this template-->\n");
      out.write("  <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <!-- Custom styles for this template-->\n");
      out.write("  <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <!-- Core plugin JavaScript-->\n");
      out.write("  <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("  <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            
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
        
      out.write("\n");
      out.write("          \n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtMensaje\" \n");
      out.write("               value=\"");
      out.print( request.getAttribute("stMensaje") );
      out.write("\" />\n");
      out.write("        \n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtTipo\" \n");
      out.write("               value=\"");
      out.print( request.getAttribute("stTipo") );
      out.write("\" />\n");
      out.write("        <script> \n");
      out.write("            var mensaje =  document.getElementById(\"txtMensaje\").value;\n");
      out.write("            var tipo = document.getElementById(\"txtTipo\").value;\n");
      out.write("            \n");
      out.write("            swal(\"Mensaje\",mensaje,tipo);\n");
      out.write("            </script>\n");
      out.write("        ");
 
          }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <div class=\"card mx-auto mt-5\" >\n");
      out.write("                <div class=\"card-header\">Posibles Clientes </div>\n");
      out.write("                <div class=\"card-body\" > \n");
      out.write("                    <form action=\"PosiblesClientesController\" method=\"post\">\n");
      out.write("                        <!-- fila -->\n");
      out.write("                   <div class=\"form-group\">     \n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    \n");
      out.write("                    <!-- columna -->\n");
      out.write("                    <div class=\" cool-md-6\">\n");
      out.write("                        \n");
      out.write("                        <input type=\"submit\"value=\"Guardar\" class=\"btn btn-primary\" \n");
      out.write("                               name=\"btnGuardar\">\n");
      out.write("                        <input type=\"submit\"value=\"Modificar\" class=\"btn btn-primary\"\n");
      out.write("                               name=\"btnModificar\">\n");
      out.write("                        <input type=\"submit\"value=\"Cancelar\" class=\"btn btn-primary\" \n");
      out.write("                               name=\"btnCancelar\">\n");
      out.write("                          \n");
      out.write("                        \n");
      out.write("                         <a class=\"btn btn-primary\" href=\"Index.jsp\">Volver</a>\n");
      out.write("                         <input type=\"text\"\n");
      out.write("                                name=\"codigoModificar\"\n");
      out.write("                                id=\"codigoModificar\"\n");
      out.write("                                value=\"");
      out.print( obclsPosiblesClientes.getInCodigo() );
      out.write("\"\n");
      out.write("                                hidden=\"\"/> \n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                    <hl>Informacion de Posible cliente</hl>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- fila -->\n");
      out.write("                        <div class=\"form-group\">     \n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                 <label name=\"lblEmpresa\">Empresa</label>\n");
      out.write("                                 <input type=\"text\"placeholder=\"Empresa\" name=\"txtEmpresa\" \n");
      out.write("                                        class=\"form-control\" \n");
      out.write("                                        value=\"");
      out.print( obclsPosiblesClientes.getStEmpresa() !=null ? obclsPosiblesClientes.getStEmpresa() :""  );
      out.write("\" />\n");
      out.write("                                         \n");
      out.write("                                </div>\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                <label name=\"lblNombre\">Nombre</label>\n");
      out.write("                                <input type=\"text\"placeholder=\"Nombre\" name=\"txtNombre\" \n");
      out.write("                                       class=\"form-control\" \n");
      out.write("                                       value=\"");
      out.print( obclsPosiblesClientes.getStNombre()!=null ? obclsPosiblesClientes.getStNombre():""  );
      out.write("\"/>\n");
      out.write("                                 \n");
      out.write("                                </div>\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                <label name=\"lblApellidos\">Apellidos</label>\n");
      out.write("                                 <input type=\"text\"placeholder=\"Apellidos\" name=\"txtApellidos\" \n");
      out.write("                                        class=\"form-control\" \n");
      out.write("                                         value=\"");
      out.print( obclsPosiblesClientes.getStApellidos()!=null ? obclsPosiblesClientes.getStApellidos():""  );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                <label name=\"lblTitulo\">Titulo</label>\n");
      out.write("                                 <input type=\"text\"placeholder=\"Titulo\" name=\"txtTitulo\" \n");
      out.write("                                        class=\"form-control\"\n");
      out.write("                                         value=\"");
      out.print( obclsPosiblesClientes.getStTitulo()!=null ? obclsPosiblesClientes.getStTitulo():""  );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- fila -->\n");
      out.write("                        <div class=\"form-group\">     \n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                 <label name=\"lblCorreoElectronico\">Correo electronico</label>\n");
      out.write("                                 <input type=\"text\"placeholder=\"Correo electronico\" name=\"txtCorreoElectronico\" \n");
      out.write("                                        class=\"form-control\" \n");
      out.write("                                         value=\"");
      out.print( obclsPosiblesClientes.getStCorreoElectronico()!=null ? obclsPosiblesClientes.getStCorreoElectronico():""  );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                <label name=\"lblTelefono\">Telefono</label>\n");
      out.write("                                 <input type=\"text\"placeholder=\"Telefono\" name=\"txtTelefono\" \n");
      out.write("                                        class=\"form-control\"\n");
      out.write("                                         value=\"");
      out.print( obclsPosiblesClientes.getStTelefono()!=null ? obclsPosiblesClientes.getStTelefono():""  );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                <label name=\"lblFax\">Fax</label>\n");
      out.write("                                 <input type=\"text\"placeholder=\"Fax\" name=\"txtFax\" \n");
      out.write("                                        class=\"form-control\"\n");
      out.write("                                         value=\"");
      out.print( obclsPosiblesClientes.getStFax()!=null ? obclsPosiblesClientes.getStFax():""  );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                <label name=\"lblMovil\">Movil</label>\n");
      out.write("                                 <input type=\"text\"placeholder=\"Movil\" name=\"txtMovil\" \n");
      out.write("                                        class=\"form-control\"\n");
      out.write("                                        value=\"");
      out.print( obclsPosiblesClientes.getStMovil()!=null ? obclsPosiblesClientes.getStMovil():""  );
      out.write("\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                         <!-- fila -->\n");
      out.write("                        <div class=\"form-group\">     \n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                 <label name=\"lblSitioWeb\">Sitio web</label>\n");
      out.write("                                 <input type=\"text\"placeholder=\"Sitio web\" name=\"txtWeb\"\n");
      out.write("                                        class=\"form-control\"\n");
      out.write("                                         value=\"");
      out.print( obclsPosiblesClientes.getStSitioWeb()!=null ? obclsPosiblesClientes.getStSitioWeb():""  );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                              \n");
      out.write("                           \n");
      out.write("                         <div class=\"col-md-3\">\n");
      out.write("                             <label name=\"lblFuentePosibleCliente\">Fuente de posible cliente</label>\n");
      out.write("                             <select class=\"form-control\" name=\"ddlFuentePosibleCliente\">\n");
      out.write("                             <option value=\"1\" ");
      out.print( obclsPosiblesClientes.obclsFuentePosibeCliente != null ? obclsPosiblesClientes.obclsFuentePosibeCliente.getInCodigo() == 1 ? "selected" : "" :""  );
      out.write(">Ninguno</option>\n");
      out.write("                             <option value=\"2\"");
      out.print( obclsPosiblesClientes.obclsFuentePosibeCliente != null ? obclsPosiblesClientes.obclsFuentePosibeCliente.getInCodigo() == 2 ? "selected" : "" :""  );
      out.write(">Aviso</option>\n");
      out.write("                             <option value=\"3\"");
      out.print( obclsPosiblesClientes.obclsFuentePosibeCliente != null ? obclsPosiblesClientes.obclsFuentePosibeCliente.getInCodigo() == 3 ? "selected" : "" :""  );
      out.write(">Llamada no solicitada</option>\n");
      out.write("                             <option value=\"4\"");
      out.print( obclsPosiblesClientes.obclsFuentePosibeCliente != null ? obclsPosiblesClientes.obclsFuentePosibeCliente.getInCodigo() == 4 ? "selected" : "" :""  );
      out.write(">Recomendacion de empleado</option>\n");
      out.write("                             <option value=\"5\"");
      out.print( obclsPosiblesClientes.obclsFuentePosibeCliente != null ? obclsPosiblesClientes.obclsFuentePosibeCliente.getInCodigo() == 5 ? "selected" : "" :""  );
      out.write(">Recomendacion externa</option>\n");
      out.write("                             <option value=\"6\"");
      out.print( obclsPosiblesClientes.obclsFuentePosibeCliente != null ? obclsPosiblesClientes.obclsFuentePosibeCliente.getInCodigo() == 6 ? "selected" : "" :""  );
      out.write(">Tienda en linea</option>\n");
      out.write("                             </select>\n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"col-md-3\">\n");
      out.write("                             <label name=\"lblEstadoPosibleCliente\">Estado de posible cliente</label>\n");
      out.write("                             <select class=\"form-control\" name=\"ddlEstadoPosibleCliente\">\n");
      out.write("                               <option value=\"1\"");
      out.print( obclsPosiblesClientes.obclsEStadoPosibleCliente != null ? obclsPosiblesClientes.obclsEStadoPosibleCliente.getInCodigo() == 1 ? "selected" : "" :""  );
      out.write(" >Ninguno</option>\n");
      out.write("                                 <option value=\"2\"");
      out.print( obclsPosiblesClientes.obclsEStadoPosibleCliente != null ? obclsPosiblesClientes.obclsEStadoPosibleCliente.getInCodigo() == 2 ? "selected" : "" :""  );
      out.write(" >Intento de contacto</option> \n");
      out.write("                                 <option value=\"3\"");
      out.print( obclsPosiblesClientes.obclsEStadoPosibleCliente != null ? obclsPosiblesClientes.obclsEStadoPosibleCliente.getInCodigo() == 3 ? "selected" : "" :""  );
      out.write("> Contactar en el futuro</option>\n");
      out.write("                                 <option value=\"4\"");
      out.print( obclsPosiblesClientes.obclsEStadoPosibleCliente != null ? obclsPosiblesClientes.obclsEStadoPosibleCliente.getInCodigo() == 4 ? "selected" : "" :""  );
      out.write(" > Contactado </option>\n");
      out.write("                                 <option value=\"5\"");
      out.print( obclsPosiblesClientes.obclsEStadoPosibleCliente != null ? obclsPosiblesClientes.obclsEStadoPosibleCliente.getInCodigo() == 5 ? "selected" : "" :""  );
      out.write(" > Posible cliente no solicitado </option>\n");
      out.write("                                 <option value=\"6\"");
      out.print( obclsPosiblesClientes.obclsEStadoPosibleCliente != null ? obclsPosiblesClientes.obclsEStadoPosibleCliente.getInCodigo() == 6 ? "selected" : "" :""  );
      out.write(" >Posible cliente perdido</option>\n");
      out.write("                             </select>\n");
      out.write("                             \n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"col-md-3\">\n");
      out.write("                             <label name=\"lblSector\">Sector</label>\n");
      out.write("                             <select class=\"form-control\" name=\"ddlSector\">\n");
      out.write("                             <option value=\"1\"");
      out.print( obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 1 ? "selected" : "" :""  );
      out.write(">Ninguno</option>\n");
      out.write("                              <option value=\"2\"");
      out.print( obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 2 ? "selected" : "" :""  );
      out.write(" >APS (Proveedor de servicios de aplicaciones)</option>\n");
      out.write("                              <option value=\"3\"");
      out.print( obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 3 ? "selected" : "" :""  );
      out.write(" >OEM de datos </option>\n");
      out.write("                              <option value=\"4\"");
      out.print( obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 4 ? "selected" : "" :""  );
      out.write(" >ERP (Planificacion de recursos de empresa) </option>\n");
      out.write("                              <option value=\"5\"");
      out.print( obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 5 ? "selected" : "" :""  );
      out.write(" >Gobierno/Ejercito </option>\n");
      out.write("                              <option value=\"6\"");
      out.print( obclsPosiblesClientes.obclsSector != null ? obclsPosiblesClientes.obclsSector.getInCodigo() == 6 ? "selected" : "" :""  );
      out.write(" >Empresa grande </option>\n");
      out.write("                              </select>\n");
      out.write("                         </div>\n");
      out.write("                                  </div>\n");
      out.write("                         </div>\n");
      out.write("                           <!-- fila -->\n");
      out.write("                         <div class=\"form-group\">     \n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                 <label name=\"lblCantidadEmpleados\">Cantidad de empleados</label>\n");
      out.write("                                 <input type=\"number\"placeholder=\"Cantidad de empleados\" name=\"txtCantidadEmpleados\"\n");
      out.write("                                        class=\"form-control\"\n");
      out.write("                                        value=\"");
      out.print( obclsPosiblesClientes.getInCantidadEmpleados()!=0 ? obclsPosiblesClientes.getInCantidadEmpleados():""  );
      out.write("\" />\n");
      out.write("                                </div>\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                <label name=\"lblIngresosAnuales\">Ingresos Anuales</label>\n");
      out.write("                                 <input type=\"number\"placeholder=\"Ingresos Anuales\" name=\"txtIngresosAnuales\" \n");
      out.write("                                        class=\"form-control\"\n");
      out.write("                                         value=\"");
      out.print( obclsPosiblesClientes.getDbIngresosAnuales()!=0 ? obclsPosiblesClientes.getDbIngresosAnuales():""  );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                             <label name=\"lblCalificacion\">Calificacion</label>\n");
      out.write("                             <select class=\"form-control\" name=\"ddlCalificacion\">\n");
      out.write("                              <option value=\"1\"");
      out.print( obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 1 ? "selected" : "" :""  );
      out.write(" >Ninguno</option>\n");
      out.write("                                 <option value=\"2\"");
      out.print( obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 2 ? "selected" : "" :""  );
      out.write(" >Adquirido</option>\n");
      out.write("                                  <option value=\"3\"");
      out.print( obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 3 ? "selected" : "" :""  );
      out.write(" >Activo</option>\n");
      out.write("                                  <option value=\"4\"");
      out.print( obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 4 ? "selected" : "" :""  );
      out.write(" >Contactado</option>\n");
      out.write("                                  <option value=\"5\"");
      out.print( obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 5 ? "selected" : "" :""  );
      out.write(">Fallo de mercado</option>\n");
      out.write("                                  <option value=\"6\"");
      out.print( obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 6 ? "selected" : "" :""  );
      out.write(">Proyecto cancelado</option>\n");
      out.write("                                  <option value=\"7\"");
      out.print( obclsPosiblesClientes.obclsCalificacion != null ? obclsPosiblesClientes.obclsCalificacion.getInCodigo() == 7 ? "selected" : "" :""  );
      out.write(">Apagar</option>\n");
      out.write("                              </select>\n");
      out.write("                                </div>\n");
      out.write("                              <div class=\"col-md-3\">\n");
      out.write("                                  <label name=\"lblNoParticipacionCorreoElectronico\">\n");
      out.write("                                      \n");
      out.write("                                      <input type=\"checkbox\" name=\"chkNoParticipacionCorreoElectronico\"/>\n");
      out.write("                                      No participacion correo electronico\n");
      out.write("                                  </label>    \n");
      out.write("                           </div>       \n");
      out.write("                         </div>\n");
      out.write("                            </div> \n");
      out.write("                              <!-- fila -->\n");
      out.write("                        <div class=\"form-group\">     \n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                \n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                <label name=\"lblIDSkype\">ID de Skype</label>\n");
      out.write("                                 <input type=\"text\"placeholder=\"IDSkype\" name=\"txtIDSkype\" \n");
      out.write("                                        class=\"form-control\" \n");
      out.write("                                         value=\"");
      out.print( obclsPosiblesClientes.getStIDSkype()!=null ? obclsPosiblesClientes.getStIDSkype():""  );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- columna -->\n");
      out.write("                                <div class=\"col-md-3\"> \n");
      out.write("                                <label name=\"lblNombre\">Twitter</label>\n");
      out.write("                                <input type=\"text\"placeholder=\"Twitter\" name=\"txtTwitter\" \n");
      out.write("                                       class=\"form-control\" \n");
      out.write("                                       value=\"");
      out.print( obclsPosiblesClientes.getStTwitter()!=null ? obclsPosiblesClientes.getStTwitter():""  );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                 <!-- columna -->\n");
      out.write("                                <div class=\"col-md-6\"> \n");
      out.write("                                <label name=\"lblCorreoElectronicoSecundario\">correo electronico secundario</label>\n");
      out.write("                                 <input type=\"text\"placeholder=\"correo electronico secundario\" name=\"txtCorreoElectronicoSecundario\" \n");
      out.write("                                        class=\"form-control\" \n");
      out.write("                                         value=\"");
      out.print( obclsPosiblesClientes.getStCorreoElectronicoSecundario()!=null ? obclsPosiblesClientes.getStCorreoElectronicoSecundario():""  );
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <!--FILA-->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div clases=\"form-row\">\n");
      out.write("                                   <!-- COLUMNA-->\n");
      out.write("                                   <div class=\"col-12\">\n");
      out.write("                                       <b>\n");
      out.write("                                           <i class=\"fa fa-clipboard\"></i>\n");
      out.write("                                           Registros: ");
      out.print( lstclsPosiblesClientes.size() );
      out.write("\n");
      out.write("                                           \n");
      out.write("                                       </b>\n");
      out.write("                                       \n");
      out.write("                                     </div>  \n");
      out.write("                                     </div>  \n");
      out.write("                                   </div>\n");
      out.write("                                    \n");
      out.write("                                <!-- FILA -->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"form-row\">\n");
      out.write("                                        \n");
      out.write("                                        <!-- COLUMNA-->\n");
      out.write("                                        <div class=\"col-12\"> \n");
      out.write("                                            <table class=\"table table-bordered\n");
      out.write("                                                   table-responsive\"> \n");
      out.write("                                            <!-- FILA -->     \n");
      out.write("                                            <tr>\n");
      out.write("                                           <!-- COLUMNA-->     \n");
      out.write("                                           <td>Empresa </td>\n");
      out.write("                                           <td>Nombre</td> \n");
      out.write("                                           <td>Apellidos </td> \n");
      out.write("                                           <td>Titulo</td> \n");
      out.write("                                           <td>Correo electronico </td> \n");
      out.write("                                           <td>Telefono</td> \n");
      out.write("                                           <td>Fax</td> \n");
      out.write("                                           <td>Movil</td> \n");
      out.write("                                           <td>Sitio web </td> \n");
      out.write("                                           <td>Fuente de posible cliente</td> \n");
      out.write("                                           <td>Estado de posible cliente </td> \n");
      out.write("                                           <td>Sector</td> \n");
      out.write("                                           <td>Cantidad de empleados</td> \n");
      out.write("                                           <td>Ingresos Anuales </td> \n");
      out.write("                                           <td>Calificacion </td> \n");
      out.write("                                           <td>No participacion correo electronico</td> \n");
      out.write("                                            <td>ID de skype </td>\n");
      out.write("                                            <td>Twitter</td>\n");
      out.write("                                            <td>Correo electronico secundario</td>\n");
      out.write("                                            <td>Opciones</td>\n");
      out.write("                                               \n");
      out.write("                                            </tr>\n");
      out.write("                                            ");

                                            for (Models.clsPosiblesClientes item: lstclsPosiblesClientes ){
                                              Models.clsFuentePosibeCliente obclsFuentePosibeCliente = item.getObclsFuentePosibeCliente();
                                              Models.clsEStadoPosibleCliente obclsEStadoPosibleCliente =item.getObclsEStadoPosibleCliente();
                                              Models.clsSector obclsSector=item.getObclsSector();
                                              Models.clsCalificacion obclsCalificacion=item.getObclsCalificacion();

                                            
      out.write("\n");
      out.write("                                            <tr>  \n");
      out.write("                                           <td>");
      out.print( item.getStEmpresa() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( item.getStNombre() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( item.getStApellidos() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( item.getStTitulo() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( item.getStCorreoElectronico() );
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print( item.getStTelefono() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( item.getStFax() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( item.getStMovil() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( item.getStSitioWeb() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( obclsFuentePosibeCliente.getStDesripcion());
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print( obclsEStadoPosibleCliente.getStDesripcion() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( obclsSector.getStDesripcion()  );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( item.getInCantidadEmpleados() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( item.getDbIngresosAnuales() );
      out.write(" </td> \n");
      out.write("                                           <td>");
      out.print( obclsCalificacion.getStDesripcion() );
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print( item.getChNoParticipacionCorreoElectronico() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( item.getStIDSkype() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( item.getStTwitter() );
      out.write("</td> \n");
      out.write("                                           <td>");
      out.print( item.getStCorreoElectronicoSecundario()  );
      out.write("</td> \n");
      out.write("                                           <td>\n");
      out.write("                                               <a class=\"btn btn-success btn-sm\"\n");
      out.write("                                                  href=\"PosiblesClientesController?stOpcion=M&codigoSeleccionado=");
      out.print( item.getInCodigo());
      out.write(" \">\n");
      out.write("                                                   Modificar</a>\n");
      out.write("                                                   <a class=\"btn btn-danger btn-sm\"\n");
      out.write("                                                  href=\"PosiblesClientesController?stOpcion=E&codigoSeleccionado=");
      out.print( item.getInCodigo());
      out.write(" \">\n");
      out.write("                                                   Eliminar</a>\n");
      out.write("                                           </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            \n");
      out.write("                                            ");

                                            }
                                            
      out.write("\n");
      out.write("                                            \n");
      out.write("                                            </table>\n");
      out.write("                                        </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("            \n");
      out.write("                            </form>\n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                           \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
