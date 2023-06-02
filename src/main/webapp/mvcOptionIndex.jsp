<%--
  Created by IntelliJ IDEA.
  User: SangJin
  Date: 2023-05-30
  Time: 오전 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>

        <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>

        <script type="text/javascript">
            function ajaxProcess(url, type, contentType, dataType, data) {
                $.ajax({
                    url: url,
                    type: type,
                    contentType: contentType,
                    dataType: dataType,
                    data: data,
                    success: function(val) {
                        console.log(val);
                    }, error: function(e) {
                        alert('error');
                    }
                });
            }

            $(function() {
                $("input.exception").click(function(){
                    switch (this.id) {
                        case "exception1":
                            document.location.href = '${pageContext.request.contextPath}/nullPoint';
                            break;

                        case "exception2":
                            document.location.href = '${pageContext.request.contextPath}/classCast';
                            break;

                        case "exception3":
                            document.location.href = '${pageContext.request.contextPath}/numberFormat';
                            break;

                        default:
                            break;
                    }
                });

                $("input.header").click(function() {
                    if (this.id == 'header1') {
                        document.location.href = '${pageContext.request.contextPath}/header1';
                    }

                    if (this.id == 'header2') {
                        document.location.href = '${pageContext.request.contextPath}/header2';
                    }
                });

                $("input[type='button']").click(function(){
                    switch(this.id) {
                        // MvcOptionConroller
                        case 'ajax1':
                            ajaxProcess('${pageContext.request.contextPath}/ajaxTest1', 'POST', null, 'html', null);
                            break;

                        case 'ajax2':
                            var jsonValue={"id":"blue", "name":"abc", "weight":55.7, "height":189.9};
                            ajaxProcess('${pageContext.request.contextPath}/ajaxTest2', 'POST', "application/json", "text", JSON.stringify(jsonValue));
                            break;

                        case 'ajax3':
                            var jsonValue={"name":"oop", "since":1980, "message":"hi"};
                            ajaxProcess('${pageContext.request.contextPath}/ajaxTest3', 'POST', "application/json", "json", JSON.stringify(jsonValue));
                            break;

                        case 'ajax4':
                            var jsonValue={"userName":"SpringBoot", "userLoc":"localhost", "wait":1000};
                            ajaxProcess('${pageContext.request.contextPath}/ajaxTest4', 'POST', "application/json", "json", JSON.stringify(jsonValue));
                            break;

                        // RestControllerEx
                        case 'ajax5':
                            // var jsonValue={"userName":"SpringBoot", "userLoc":"localhost", "wait":1000};
                            ajaxProcess('${pageContext.request.contextPath}/ajaxTest5', 'POST', "application/json", "text", null);
                            break;

                        case 'ajax6':
                            // var jsonValue={"userName":"SpringBoot", "userLoc":"localhost", "wait":1000};
                            ajaxProcess('${pageContext.request.contextPath}/ajaxTest6', 'POST', "application/json", "json", JSON.stringify(jsonValue));
                            break;

                        case 'ajax7':
                            // var jsonValue={"userName":"SpringBoot", "userLoc":"localhost", "wait":1000};
                            ajaxProcess('${pageContext.request.contextPath}/ajaxTest7', 'POST', "application/json", "json", JSON.stringify(jsonValue));
                            break;

                        case 'ajax8':
                            // var jsonValue={"userName":"SpringBoot", "userLoc":"localhost", "wait":1000};
                            ajaxProcess('${pageContext.request.contextPath}/ajaxTest8', 'POST', "application/json", "json", JSON.stringify(jsonValue));
                            break;

                        default:
                            break;
                    }
                });
            });
        </script>
    </head>
    <body>
        <%-- SMITH : {ename}, SALESMAN : {job} --%>
        <%--<a href="${pageContext.request.contextPath}/pathParam">EMPLIST</a>
        <a href="${pageContext.request.contextPath}/pathParam/JONES">EMPLIST1</a>
        <a href="${pageContext.request.contextPath}/pathParam/SALESMAN">EMPLIST2</a>
        <a href="${pageContext.request.contextPath}/pathParam/SMITH/SALESMAN">EMPLIST3</a>
        <a href="${pageContext.request.contextPath}/pathParam/ALLEN/MANAGER">EMPLIST4</a>--%>

        <input type="button" value="AjaxValue1" id="ajax1"/>
        <input type="button" value="AjaxValue2" id="ajax2"/>
        <input type="button" value="AjaxValue3" id="ajax3"/>
        <input type="button" value="AjaxValue4" id="ajax4"/>
        <input type="button" value="AjaxValue5" id="ajax5"/>
        <input type="button" value="AjaxValue6" id="ajax6"/>
        <input type="button" value="AjaxValue7" id="ajax7"/>
        <input type="button" value="AjaxValue8" id="ajax8"/><br><br>

        <input type="button" value="Header1" id="header1" class="header"/>
        <input type="button" value="Header2" id="header2" class="header"/><br><br>

        <input type="button" value="Exception1" id="exception1" class="exception"/>
        <input type="button" value="Exception2" id="exception2" class="exception"/>
        <input type="button" value="Exception3" id="exception3" class="exception"/>
        <input type="button" value="Exception4" id="exception4" class="exception"/>
    </body>
</html>
