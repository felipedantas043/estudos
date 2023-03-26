<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <pre>

    <?php
        require_once("caneta.php");

        $c1 = new Caneta("BIC", "VERMELHA", 0.7);
        print_r($c1);
        // $c1->setModelo("bic");
        // $c1->setPonta(0.5);
        // echo "Eu tenho uma caneta {$c1->getModelo()} de ponta {$c1->getPonta()}";
    ?>

    </pre>

</body>
</html>