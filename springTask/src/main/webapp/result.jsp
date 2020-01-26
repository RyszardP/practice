<taglib xmlns="http://java.sun.com/xml/ns/j2ee"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee web-jsptaglibrary_2_0.xsd"
        version="2.0">
<html>
<head>
    <title>result</title>
</head>
<body>

result page

<br/>

Coordinates:
<br/>
latitude - <c:out value="${latitude}"/>
<br/>
longitude -<c:out value="${longitude}"/>
<hr>
<br/>
time zone <c:out value="${timezone}"/>
<br/>

current weather in the area  <c:out value="${summary}"/>
<br/>

current time <c:out value="${time}"/>
<br/>

humidity <c:out value="${humidity}"/>
<br/>

wind speed <c:out value="${windSpeed}"/>

</body>

</html>
</taglib>