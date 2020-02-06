<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Names</title>
</head>
<body>
<?php
//temp                                                                                localhost:8081/lab2/index.php
//MISSING connect to the database
$servername = "localhost";
$username = "root";
$password = "";
$db = "lab2";

//MISSING select the database
// Create connection
$con = mysqli_connect($servername, $username, $password,$db);

// Check connection //why not?!
if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
}


//MISSING construct query string for all the contents of people
//MISSING execute the query
$sql = "SELECT * FROM people";
$result = mysqli_query($con,$sql);
	


echo "<table border=1 ><th>ID</th><th>First</th><th> Last</Th>\n";
$none = 0;
while($row=mysqli_fetch_row($result)) {
$none=1;
printf("<tr><td>%d</td><td>%s</td><td>%s</td></tr>\n",$row[0],
$row[1],$row[2]);
}
?>
</table>
<?php
if($none==0)
Echo "<h3>No matching records found.</h3>\n";
?>
<p><INPUT type="button" value="Cancel" id=button1 name=button1
onclick="go_home()">
<script language=Javascript>
function go_home() {
window.location.replace("index.php");
}
</script>
</body>
</html>