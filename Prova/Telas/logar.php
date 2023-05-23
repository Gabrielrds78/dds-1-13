<?php
    include ('conn.php');

    $login = $_POST['login'];
    $senha = $_POST['senha'];

    $funcionario = $pdo->prepare('SELECT * FROM funcionario where senha=:senha AND login=:login');
    $funcionario->execute(array(
        ':senha'=>$senha,
        ':login'=>$login
        
    ));

        $rowTable = $funcionario->fetchAll();

        if(empty($rowTable)){
            echo "<script>
                  alert('Usuario e/ou senha inválidos')
                  </script>";
        } else {
            $sessao = $rowTable[0];
        
            if(!isset($_SESSION)) {
                session_start();
            }
            $_SESSION['idufuncionario'] = $sessao['idufuncionario'];
            $_SESSION['login'] = $sessao['login'];
        
            echo "<script>
            alert('Usuario Logado!')
            window.location.href='login.php'
            </script>";
        }

?>