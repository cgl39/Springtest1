<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<%--标签的值需要从数据库取--%>
<%--jsp能不能访问数据库取值  jsp能嵌入java代码  java jdbc访问数据库--%>
<%-- 单一职责原则 一个类不能太累了 --%>
<%= request.getAttribute("name")%>
<h3>动态的</h3>
</body>
</html>
