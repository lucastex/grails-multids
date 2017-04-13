<html>
    <head></head>
    <body>
        <table width="100%" >
            <tr>
                <thead>
                    <tr>
                        <th>dataSource <g:link controller="contact" action="add" id="0">(add)</g:link></th>
                        <th>serverdb <g:link controller="contact" action="add" id="1">(add)</g:link></th>
                        <th>userdb <g:link controller="contact" action="add" id="2">(add)</g:link></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td width="33%" valign="top">
                            <ul>
                                <g:each in="${contactsDs}" var="c">
                                    <li>${c.name}</li>
                                </g:each>
                            </ul>
                        </td>
                        <td width="33%"  valign="top">
                            <ul>
                                <g:each in="${contactsServerdb}" var="c">
                                    <li>${c.name}</li>
                                </g:each>
                            </ul>
                        </td>
                        <td width="33%"  valign="top">
                            <ul>
                                <g:each in="${contactsUserdb}" var="c">
                                    <li>${c.name}</li>
                                </g:each>
                            </ul>
                        </td>
                    </tr>
                </tbody>
            </tr>
        </table>
        <ul>

        </ul>
    </body>
</html>