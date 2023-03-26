<?php

class Caneta{
    public $modelo;
    public $cor;
    private $ponta;
    protected $carga;
    public $tampada;

    // public function __construct(){
    //     $this->cor = "AZUL";
    //     $this->tampar();
    // }

    // public function Caneta(){  colocar a função construtora com o mesmo nome da classe também funciona
    //     $this->cor = "azul";
    // }

    public function __construct($m, $c, $p)
    {
        $this->modelo = $m;
        $this->cor = $c;
        $this->ponta = $p;
        $this->carga = 100;
        $this->tampar();
    }

    public function tampar(){
        $this->tampada = true;
    }

    public function getModelo(){
        return $this->modelo;
    }

    public function setModelo($m){
        $this->modelo = $m;
    }

    public function getPonta(){
        return $this->ponta;
    }
    public function setPonta($p){
        $this->ponta = $p;
    }

}

?>