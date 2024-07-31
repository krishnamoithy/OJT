<%-- 
    Document   : firstjsp
    Created on : 31 Jul 2024, 15:18:13
    Author     : krishnamoorthy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome Harilal!</h1>
        
        <%
            String msg;
            int hour = java.time.LocalTime.now().getHour();

            if (hour < 12) {
            msg="Good Morning....";
            }
            else if(hour <18){
            msg="Good Afternoon....";
            }
            else if(hour >=18 && hour <20){
            msg="Good Eveyning....";
            }
            else{
            msg="Good Night....";
            }

        %>
        <h2><%= msg %></h2>
    </body>
</html>
