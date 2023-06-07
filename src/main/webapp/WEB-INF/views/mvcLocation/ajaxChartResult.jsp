<%--
  Created by IntelliJ IDEA.
  User: SangJin
  Date: 2023-06-02
  Time: 오전 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart() {

    var data = google.visualization.arrayToDataTable([
        ${data}
        <%--['Task', 'Hours per Day'],
        ['Work',     11],
        ['Eat',      2],
        ['Commute',  2],
        ['Watch TV', 2],
        ['Sleep',    7]--%>

        <%--['Group by JOB', 'MaxSql'],
        ['CLERK', 1300],
        ['SALESMAN', 1600],
        ['MANAGER', 2975],
        ['ANALYST', 3000],
        ['PRESIDENT', 5000]--%>
    ]);

    var options = {
        title: 'My Daily Activities'
    };

    var chart = new google.visualization.PieChart(document.getElementById('piechart'));

    chart.draw(data, options);
}
