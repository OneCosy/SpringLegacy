<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

    <script type="text/javascript">
        $(function(){
            $("button").click(function() {
                $("form").submit();
            });
        });
    </script>
</head>
<body>
    <h1>EMPVIEW</h1>
    <h2>Contextual Classes</h2>
    <button type="button" class="btn btn-success">Delete</button>
    <form action="${pageContext.request.contextPath}/deleteCheck" method="post">
        <table class="table">
            <thead>
                <tr>
                    <th>NO</th>
                    <th>EMPNO</th>
                    <th>ENAME</th>
                    <th>JOB</th>
                    <th>MGR</th>
                    <th>HIREDATE</th>
                    <th>SAL</th>
                    <th>COMM</th>
                    <th>DEPTNO</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="i" items="${empList}" varStatus="cnt">
                    <c:choose>
                        <c:when test="${cnt.count mod 2 eq 0}">
                            <tr class="table-primary">
                        </c:when>
                        <c:otherwise>
                            <tr class="table-success">
                        </c:otherwise>
                    </c:choose>

                    <td>
                        <input type="checkbox" name="empnoCk" value="${i.empno}">
                        ${cnt.count}
                    </td>
                    <td>${i.empno}</td>
                    <td>${i.ename}</td>
                    <td>${i.job}</td>
                    <td>${i.mgr}</td>
                    <td>${i.hiredate}</td>
                    <td>${i.sal}</td>
                    <td>${i.comm}</td>
                    <td>${i.deptno}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </form>
</body>
</html>
