<%@page import="java.util.Date" session="false"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="css/style.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Examples Servlet</title>
    <style>
    
    </style>
</head>




<body>
    <div class="container-xl">
        <div class="table-responsive">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="login-form">
                            <s:actionerror />
                            <s:form action="/login" method="post">
                                <div class="form-group">
                                    <s:textfield name="login" class="form-control" key="label.username" size="20" />
                                </div>
                                <div class="form-group">
                                    <s:password name="password" class="form-control" key="label.password" size="20" />
                                </div>
                                <div class="form-group">
                                <s:submit method="execute" key="label.login" cssClass="btn btn-black"  />
<%--                                 <s:submit method="Login" key="label.register" cssClass="btn btn-secondary"  />
 --%>                                </div>
                            </s:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
        
                
   
</body>

</html>