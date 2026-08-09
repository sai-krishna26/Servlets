<%@page language="java"
        contentType="text/html"
        pageEncoding="UTF-8"
        import="java.util.Date"
        session="true" %>

<!DOCTYPE html>
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

<!--
<%
    z++;
%>
-->
<h2>Result of x+y=<%=z%></h2>
<h2>Result by add method=<%=add(10,20)%></h2>
<hr>

<!-- Page Directive = gives information about the page -->
<!-- Directives(3)=page,include,taglib -->
<!-- Page Directive
    language,contentType,import,pageEncoding,extends......etc
-->

<h2>Page Directive<br>Current Time=<%=new Date()%></h2>
<hr>

<!--Include Directive= shares information between pages-->
<%@include file="sample.jsp" %>
<h2>welcome to jsp</h2>

<hr>

<!-- taglib = makes the taglib available in the jsp page-->
<!--uri and prefix are 2 attributes of taglib
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="i" begin="1" end="5">
    <p>${i}</p>
</c:forEach>
-->
<hr>

<!-- JSP Actions = standard tags for runtime behavior -->
<!-- jsp:include = includes another page at runtime -->
<!-- <jsp:include page="sample.jsp" /> -->
<hr>

<!-- jsp:forward = forwards request to another page -->
<!-- <jsp:forward page="sample.jsp" /> -->
<hr>

<!-- jsp:param = passes parameters to included/forwarded page -->
<!-- <jsp:include page="sample.jsp">
    <jsp:param name="title" value="JSP Actions" />
</jsp:include> -->
<hr>

<!-- jsp:useBean = instantiates or accesses a JavaBean -->
<!-- <jsp:useBean id="user" class="com.example.User" /> -->
<!-- <jsp:setProperty name="user" property="name" value="John" /> -->
<!-- <jsp:getProperty name="user" property="name" /> -->
<hr>

</body>
</html>
