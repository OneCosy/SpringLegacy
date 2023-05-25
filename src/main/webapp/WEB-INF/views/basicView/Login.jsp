<%--
  Created by IntelliJ IDEA.
  User: SangJin
  Date: 2023-05-22
  Time: 오후 4:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>

    <script>
        <%--$(function(){--%>
        <%--   $("input#login").click(function(){--%>
        <%--      $.ajax({--%>
        <%--          url: '${pageContext.request.contextPath}/loginCheck',--%>
        <%--          type: 'POST',--%>
        <%--          data: {--%>
        <%--              "id": $("input#id").val(),--%>
        <%--              "pass": $("input#pass").val()--%>
        <%--          },--%>
        <%--          async: false,--%>
        <%--          success: function(data) {--%>
        <%--              if (data.trim() == 'T') {--%>
        <%--                  document.location.href = '${pageContext.request.contextPath}/listCheck';--%>
        <%--              } else {--%>
        <%--                  $("input[name='id']").val('').focus();--%>
        <%--                  $("input[name='pass']").val('');--%>
        <%--              }--%>
        <%--          }--%>
        <%--      });--%>
        <%--   });--%>
        <%--});--%>
    </script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/loginCheck" method="post">
        <input type="text" name="id" id="id">
        <input type="password" name="pass" id="pass">
        <input type="submit" value="로그인" id="login">
    </form>
</body>
</html>
