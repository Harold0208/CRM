<%-- 
    Document   : Login
    Created on : 2/12/2020, 10:49:43 PM
    Author     : darkb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Login</title>
        <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
  <link href="css/sweetalert.css" rel="Stylesheet">
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
        <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
   
  <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
  <script src="js/sweetalert.min.js" type="text/javascript"/>
  
  <script>
      
          swal("Buen trabajo!", "se realizo proceso con exito!", "success")
      
      </script>
      
    </head>
    <body class="bg-dark"> 
        <!--SCRIPLETS -->
        <% 
        if(request.getAttribute("stError") != null ) {
            
        
        %>
        <input type="text" hidden="" id="txtMensaje" value="<%=request.getAttribute("stError").toString()%>"/>
        <script> 
         
        swal("Mensaje!",document.getElementById("txtMensaje").value , "error");
        </script>
        <% 
        }
        
        %>
  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Login</div>
      <div class="card-body">
          <form action="LoginController" method="post" >
          <div class="form-group">
            <label for="lblEmail">Email</label>
            <input class="form-control" name="txtEmail" type="email" aria-describedby="emailHelp" placeholder="ingrese email">
          </div>
          <div class="form-group">
            <label for="lblPassword">Password</label>
            <input class="form-control" name="txtPassword" type="password" placeholder="Password">
          </div>
          <div class="form-group">
            <div class="form-check">
              <label class="form-check-label">
                <input class="form-check-input" type="checkbox" name="chkRecordar"> Recordar  Password</label>
            </div>
          </div>
         <input name="btnAceptar" type="submit" class="btn btn-primary btn-block" value="Aceptar"/>
        </form>
        <div class="text-center">
            <a class="d-block small mt-3" href="Register.jsp">Registrar cuenta</a>
        </div>
      </div>
    </div>
      
  </div>
  
</body>

</html> 
   
