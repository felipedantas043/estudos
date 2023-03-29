<?php
    session_start();
    require_once("ControleRemoto.php");
    $c = new ControleRemoto;
?>

<!DOCTYPE html>
<html lang="pt_br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        #controle{
            width: 300px;
            height: 600px;
            background-color: rgba(0,0,0,.7);
            padding:5px;
            border-radius: 20px;
            
        }
        #interface{
            width: 90%;
            height: 97%;
            margin: 5px auto;
            background-color: whitesmoke;
            position:relative;
        }
        .container_botao{
            position:absolute;
            width: 100%;
            top:120px;

            list-style: none;
            display: grid;
            grid-template-areas:
            "power ."
            "mais menos"
            "menu menu"
            "play pause"
            ;
            grid-template-rows: 1fr 1fr;
            grid-template-columns: 1fr 1fr;
            
        }
        #btn_power{
            grid-area: power;
        }
        #btn_mais{
            grid-area: mais;
        }
        #btn_menos{
            grid-area: menos;
        }
        #btn_menu{
            grid-area: menu;
        }
        #btn_play{
            grid-area: play;
        }
        #btn_pause{
            grid-area: pause;
        }
        input{
            margin: 15px ;
            padding: 15px;
            border-radius: 50px;
            border: solid 1px ;
        }
        input:hover{
            cursor:pointer;
            background-color: beige;
        }
        section{
            display: flex;
            justify-content: space-between;
            flex-wrap: wrap;
            width: 87%;
            margin: 0 auto;
        }
        pre{
            margin: 0 auto;
        }
    </style>
</head>
<body>

    <section>
        <div id="controle">
            <div id="interface">
                <nav class="container_botao">
                    <input type="button" id="btn_power" onclick="<?php $c->ligar(); ?>" value="power">
                    <input type="button" id="btn_mais" value="+" onclick="<?php echo $c->maisVolume(); ?>">
                    <input type="button" id="btn_menos" value="-">
                    <input type="button" id="btn_menu" value="menu">
                    <input type="button" id="btn_play" value="play">
                    <input type="button" id="btn_pause" value="pause" onclick="contar()">
                </nav>
            </div>
        </div>
        <pre>
            <h1>Controle Remoto</h1>
            <p id="p">

            </p>
            <?php
                
                $c->abrirMenu();
            ?>
        </pre>
    </section>
    <script>

        let p = document.querySelector("#p")
        
        let num = 0
        function contar() {
            num ++
            p.innerHTML = num
        }
    </script>
</body>
</html>