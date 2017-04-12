<html>
    <head></head>
    <body>
        <ul>
            <g:each in="${contacts}" var="c">
                <li>${c.name}</li>
            </g:each>
        </ul>
    </body>
</html>