<html>
	<head>
		<meta name = "layout" content = "main"/>
		<title>Login</title>
	</head>
	<body>
	<br>
	<br>
		<form>
			Username: <g:textField name="username"/><br>
			Password:  <g:passwordField name="password"/><br>
			<g:actionSubmit value="Login" action = "loginAttempt"/>
		</form>
	</body>
</html>