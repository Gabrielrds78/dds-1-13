<?php
$pdo = new PDO('mysql:host=localhost;dbname=livraria-gabriel;','root','');
$pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
$pdo->exec("SET CHARACTER SET utf8");
?>