<html>


<body>

<h1> SuccessFully Data Entered </h1>
<table>
<tr>
<td> Student Name: </td>
<td>${student.studentName}</td>
</tr>

<tr>
<td> Student Hobby: </td>
<td>${student.studentHobby}</td>
</tr>
<tr>
<td> Student Mobile No: </td>
<td>${student.studentMobile}</td>
</tr>
<tr>
<td> Student Birth Date: </td>
<td>${student.birthDate}</td>
</tr>
<tr>
<td> Student Skills : </td>
<td>${student.skillSets}</td>
</tr>

<tr>
<td> Student Address: </td>
<td> country: ${student.address.country} 
        city: ${student.address.city} 
      street: ${student.address.street} 
      pinCode:${student.address.pinCode} </td>
</tr>
</table>
</body>


</html>