<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>

    <script type="text/javascript">
        $(function() {
            $("button#ch1").click(function() {
                $.ajax({
                    url:'${pageContext.request.contextPath}/ajaxPieChart1',
                    type:'POST',
                    contentType:'application/x-www-form-urlencoded; charset=UTF-8',
                    dataType:'script',
                    success:function(result){
                        console.log(result);
                    },
                    error:function(){
                        alert('error');
                    }
                });
            });
        });
    </script>

    <script type="text/javascript">

    </script>
</head>
<body>
    <button id="ch1">ADMINSAL</button>
    <div id="piechart" style="width: 900px; height: 500px;"></div>
</body>
</html>


