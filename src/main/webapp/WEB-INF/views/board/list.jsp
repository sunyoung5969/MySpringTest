<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
		<c:forEach var="board" items="${list}">
			<tr>
				<td>${board.bno}</td>
				<td>${board.title}</td>
				<td>${board.writer}</td>
				<td>${board.regdate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>