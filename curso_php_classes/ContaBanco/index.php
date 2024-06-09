<!DOCTYPE html>
<html lang="pt_br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        
    </style>
</head>
<body>
    <pre>

        <h1>Banco Dantas</h1>
        <?php

            include_once("ContaBanco.php");

            $usuario01 = new ContaBanco("usuario01");
            
            $usuario01->abrirConta(111, "cc");
            $usuario01->depositar(30);
            // $usuario01->pagarMensalidade();
            
            
            print_r($usuario01);
            
            $usuario02 = new ContaBanco("usuario02");
            $usuario02->abrirConta(2222, "cp");
            $usuario02->depositar(500);
            $usuario02->pagarMensalidade();
            $usuario02->sacar(630);
            $usuario02->fecharConta(2222);

            print_r($usuario02);


        ?>
    </pre>
</body>
</html>