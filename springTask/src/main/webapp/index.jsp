<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"     "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Insert Latitude and Longitude</h2>

<form id="coord" action="/result" method="post" modelAttribute="${coords}">
    <p>Latitude : <input type="number" step=any id="latitude"></p>
    <p>Longitude : <input type="number" step=any id="longitude"></p>
    <input type="submit" value="result">
</form>

<br/>


</body>
</html>
