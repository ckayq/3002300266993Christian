    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    <html>
    <head>
        <title>Title</title>
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
              rel="stylesheet">
        <style>
            h1 {
                text-align: center;
            }
        </style>
    </head>
    <body>

    <div class="container">
        <div class="container">
            <div class="row">

                <div class="col-md-8 col-md-offset-2">

                    <h1>Edit record</h1>
                    <form action="EditRecord" method="post">
                        <div class="form-group">
                            <label>Title <span class="require">*</span></label>
                            <input type="text" class="form-control" name="studentName" maxlength="25"/>
                        </div>

                        <div class="form-group">
                            <label>Body <span class="require">*</span></label>
                            <input type="text" class="form-control" name="studentNum" maxlength="25"/>
                        </div>

                        <div class="form-group">
                            <p><span class="require">*</span> - required fields</p>
                        </div>

                        <div class="form-group">
                            <button type="submit" class="btn btn-primary" value="Update Record">
                                Update
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </body>
    </html>
