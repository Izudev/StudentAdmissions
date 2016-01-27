
<%@taglib prefix= "form"  uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1> Admission Login Form for Entering Student Personal Information </h1>

<h2>${modelmessage}</h2>

<form:errors path ="student.*"/>

<form action="/MVCGontu3rdProject/submitAdmissionForm.html" method="post" >

<table> 
<tr>
<td>Student's Name: </td> <td> <input type="text" name="studentName" /> </td>
</tr>
<tr>
<td> Student's hobby: </td> <td> <input type="text" name="studentHobby" /> </td>
</tr>

<tr>
<td> Student's Mobile No: </td> <td> <input type="text" name="studentMobile" /> </td>
</tr>

<tr>
<td> Student's Birth date: </td> <td><input type="text" name="birthDate" /></td>
</tr>
<tr>
<td> Student's Programming Skills: </td> <td> <select name= "skillSets" multiple>
                              <option value="Java Core"> java Core</option>
                              <option value=" Spring Core"> Spring Core</option>
                              <option value="AngularJs Core"> AngularJs Core</option>
                              </select> <td>
</tr>
</table>
<table>

<tr> <td> Student Address : </td> </tr>
<tr>
<td> Country: <input type="text" name="address.country" /></td>
<td> City: <input type="text" name="address.city" /></td>
<td> Street: <input type="text" name="address.street" /></td>
<td> PinCode: <input type="text" name="address.pinCode" /></td>
</tr>
 
</table>

 <input type="submit"  value="Submit this form by clicking here"  />
</form>

</body>
</html>