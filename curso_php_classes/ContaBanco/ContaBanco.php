<?php

    /**
     * Criar uma conta no Banco Dantas
     */
    class ContaBanco{
        public $numConta;       //Número da conta
        protected $tipo;        //Tipo da conta(Corrente ou Poupança)
        private $dono;          //Nome do dono da conta
        private $saldo;         //Saldo da conta
        private $status;        //Status para saber se a conta está ativa ou não
        private $msg;           //Variável que armazena a mensagem de resposta

        /**
         * Summary of __construct: Método que é execultado sempre que uma nova classe for instanciada, ou seja, virar um objeto.
         * @param string $nome Nome do dono da conta
         */
        public function __construct(string $nome){
            $this->setSaldo(0);
            $this->setDono($nome);
            $this->setStatus(false);
        }

        /**
         * @param int $numero_conta Número da conta
         * @param string $tipoConta Tipo da conta: corrente(cc) ou poupança(cp)
         */
        public function abrirConta(int $numero_conta, string $tipoConta){
            if ($tipoConta == "cc") {
                $this->setSaldo(50);
                $this->setTipo("Conta Corrente");
                $this->setNumConta($numero_conta);
                $this->setStatus(true);

            }elseif ($tipoConta == "cp") {
                $this->setSaldo(150);
                $this->setTipo("Conta Poupança");
                $this->setNumConta($numero_conta);
                $this->setStatus(true);

            }else{
                echo "ERROR! Conta inválida.";
            }
        }

        /**
         * @param int $numConta Número da conta a ser fechada
         */
        public function fecharConta(int $numConta){

            if ($numConta == $this->getNumConta()) {                    //verifica se o numero da conta digitado está correto

                if ($this->getStatus()) {                       //Verifica se a conta está ativa

                    if ($this->getSaldo() == 0) {                       //Verifica se o saldo é igual a zero
                        $this->setStatus(false);                        //desativa a conta
                        $this->setMsg("Conta fechada com sucesso!");

                    }elseif ($this->getSaldo() > 0){
                        $this->setMsg("ERRO: Voce nao pode fechar sua conta com dinheiro dentro!");
                    
                    }else{
                        $this->setMsg("ERRO: Voce nao pode fechar sua conta com saldo negativo!");
                    
                    }
                }else {
                    $this->setMsg("ERRO: Sua conta está desativada, não é possível fechar conta.");
                }
                
            }else{
                $this->setMsg("Conta não encontrada!");
            }

        }
        public function depositar(float $valor){
            if ($this->getStatus()) {                           //verifica se tem saldo
                $this->setSaldo($this->getSaldo() + $valor);    
                $this->setMsg("Deposito realizado!");

            } else {
                $this->setMsg("Não foi possível realizar a operação: Conta desativada.");
            }
            


        }
        public function sacar(float $valor){
            
            if ($this->getStatus()) {                     //verifica se a conta está ativada

                if ($this->getSaldo() > 0) {                    //verifica se tem saldo na conta
                    $saldo = $this->getSaldo();
                    if ($valor <= $this->getSaldo()) {                     //verifica se o saldo na conta é maior que o valor de saque
                        $this->setSaldo($saldo - $valor);
                        $this->setMsg("saque realizado");
                    }else {
                        $this->setMsg("Não foi possível realizar a operação, saldo insuficiente.");
                    }
                }else{
                    $this->setMsg("ERRO: Saldo insuficiente!");
                }
            }else {
                $this->setMsg("ERRO: Sua conta não esta ativa, não é possível realizar o saque.");
            }
        }
        public function pagarMensalidade(){
            if ($this->getTipo() == "Conta Corrente") {
                $this->sacar(12);
                $this->setMsg("Mensalidade de R$ 12,00 paga com sucesso!");

            }elseif($this->getTipo() == "Conta Poupança"){
                $this->sacar(20);
                $this->setMsg("Mensalidade de R$ 20,00 paga com sucesso!");

            }else{
                $this->setMsg("Não foi possível pagar a mensalidade, verefique seu saldo.");
            }
        }


        //getters and setters


        public function setNumConta(int $n){
            $this->numConta = $n;
        }
        
        public function getNumConta(){
            return $this->numConta;
        }

        public function setTipo(string $t){
            $this->tipo = $t;
        }

        public function getTipo(){
            return $this->tipo;
        }

        public function setDono(string $d){
            $this->dono = $d;
        }

        public function getDono(){
            return $this->dono;
        }

        public function setSaldo(float $n){
            $this->saldo = $n;
        }

        public function getSaldo(){
            return $this->saldo;
        }
        
        public function setStatus(bool $s){
            $this->status = $s;
        }

        public function getStatus(){
            return $this->status;
        }

        public function setMsg(string $msg){
            $this->msg = $msg;
        }

        public function getMsg(){
            return $this->msg;
        }
    }
?>