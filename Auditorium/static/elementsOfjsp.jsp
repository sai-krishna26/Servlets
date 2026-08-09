
<html>
<body>
<!-- scriptlet = we can store the statements in _jspServlet() as local variables. we cannot print the result automatically-->
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

<!-- Declaration =we can store the statements in class level as a instance variables. we cannot print the result automatically-->
<%!
    int x=10;
    int y=20;
    int z=x+y;
%>

<%!
    public int add(int x,int y)
    {
        return x+y;
    }
%>

<%
    z++;
%>
<h2>Result of x+y=<%=z%></h2>
<h2>Result by add method=<%=add(10,20)%></h2>
<hr>

<!-- Page Directive = gives information about the page -->
<!-- Directives(3)=page,include,taglib -->
<!-- Page Directive
    language,contentType,import,pageEncoding,extends......etc
-->
<%@page language="java"
        contentType="text/html"
        pageEncoding="UTF-8"
        import="java.util.Date"
        session="true" %>
<h2>Page Directive<br>Current Time=<%=new Date()%></h2>
<hr>

<!--Include Directive= shares information between pages-->
<%@include file="sample.jsp" %>
<h2>welcome to jsp</h2>

<hr>

</body>
</html>
