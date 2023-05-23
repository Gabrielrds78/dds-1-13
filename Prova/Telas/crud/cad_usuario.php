<?php
include("../conn.php");

$nome = $_POST['nome'];
$login = $_POST['login'];
$senha = $_POST['senha'];

$cad_usuario = $pdo->prepare('INSERT INTO funcionario (nome, senha, login) values (:nome, :senha, :login)');

$cad_usuario->execute(array(
        'nome'=>$nome,
        ':senha'=>$senha,
        ':login'=>$login
        
    ));

?>