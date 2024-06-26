<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee  Registeration Page</title>
</head>
<body>

  <h1 style='color: red'>Employee  Registeration </h1>
 
      
       <form:form method="post" action="home/register" modelAttribute="emp" >
              <table border="1" >
              <tr> 
                   <td> FirstName:</td> 
                   <td> <form:input path="fname" /> </td> 
              </tr>
              
              <tr>
                   <td>LastName:</td>
                   <td> <form:input path="lname" /> </td> 
              </tr>
              <tr> 
                   <td>City:</td> 
                   <td> <form:input path="ecity" /> </td> 
                   
               </tr>
              <tr> 
                    <td>salary:</td> 
                    <td> <form:input path="esal" /> </td>
               </tr>
               <tr> 
                    <td>Domain:</td> 
                    <td> <form:input path="edomain" /> </td>
               </tr>
             
              </table>
              <input type="submit" value="Register">
        </form:form>

</body>
</html>