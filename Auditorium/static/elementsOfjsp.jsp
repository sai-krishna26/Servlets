
<html>
<body>
<!-- scriptlet = we can store the statements. we cannot print the result automatically-->
<%
    int a=2;
    int b=3;
    int c=a+b;
%>
<h2>Result of a+b=<%=c%></h2>
<hr>

<!-- Expression =we cannot store the statements. we can print the result automatically-->
<h2>Result by expression</h2>
<%=2+3%>
<hr>

</body>
</html>
