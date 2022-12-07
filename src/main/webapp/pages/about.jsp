<!DOCTYPE HTML>
<html>
    <head>
        <title>Spring boot course</title>
        <meta http-equiv='Content-Type' content="text/html" charset=UTF-8 >
    </head>
    <body>
        <h1>Find out about us</h1>
        contact us here
        <form action="" method="get">
            <input type="text" name="name" placeholder="name..." /><br><br>
            <input type="text" name="email" placeholder="email..." /><br><br>
            <textarea type="text" name="message" placeholder="message..."></textarea><br><br>

            <input type="submit" value="Send message" />


          <br />
          <br />

          your message was successfully sent
           ${obj.name} ${ obj.email } ${ obj.message }
        </form>
    </body>

</html>