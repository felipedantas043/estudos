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
        require("Caneta.php");


        $c1 = new Caneta;

        $c1->modelo = "bic";
        $c1->cor = "azul";
        

        print_r($c1);




    ?>

    </pre>

</body>
</html>