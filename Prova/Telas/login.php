<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <form action="logar.php" method="post">
    <div class="div-geral">
        <h1>Login</h1>
        <label for="">Nome:</label><br>
        <input type="text" name="nome"><br>

        <label for="">Login:</label><br>
        <input type="text" name="login"><br>

        <label for="">Senha:</label><br>
        <input type="password" name="senha"><br>

        <button type="submit" class="bnt">Cadastrar</button>

    </div>
    </form>
</body>
</html>