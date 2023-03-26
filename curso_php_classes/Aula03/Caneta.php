<?php

class Caneta{
    public $modelo;
    public $cor;
    private $ponta;
    protected $carga;
    public $tampada;

    function tampar(){
        $this->tampada = true;
    }
    function destampar(){
        $this->tampada = false;
    }

}

?>