<html>
	<head>	
	<meta name = "layout" content = "main"/>
	<title>Video Selection</title>	
	</head>
	<body>
		<table>
			<tr>
				<g:sortableColumn title = "Name" property = "name"/>		
				<th>Genre</th>
				<g:sortableColumn title = "Movie Length" property = "length" />
				<g:sortableColumn title = "Release Date" property = "releaseDate"/>
				<g:sortableColumn title = "Rating" property = "rating"/>			
			</tr>
			<g:each in ="${videos}" var = "video">
				<tr>
					<td><g:link action = "rentVideo" param = "[id:'${video.id}' ]">${video.name}</g:link></td>
					<td>${video.genres}</td>
					<td>${video.length}</td>
					<td>${video.releaseDate}</td>
					<td>${video.ratingName}</td> 
				</tr>
			</g:each>
		</table>
		`			
	</body>
</html>