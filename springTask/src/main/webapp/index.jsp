<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"     "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Insert Latitude and Longitude</h2>

<form action="result.jsp" method="GET">

    <input type="text" id="latitude" name="latitude" value="<c:out value="${selectedLatitude}" />
    <input type="text" name="longitude" name="longitude"   value="<c:out value="${selectedLongitude}"/>
    <input type="submit" />

</form>


<br/>


</body>
</html>
