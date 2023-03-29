export class Controle{
        
        constructor(){
            this.ligado = false
            this.tocando = false
            this.volume = 50
        }
        
        setLigado(l) {
            this.ligado = l
        }
        setTocando(t){
            this.tocando = t
        }
        setVolume(v){
            this.volume = v
        }
        // setMenuAcionado(m){
            // this.menu_acionado = m
        // }
        getLigado() {
            return this.ligado
        }
        getTocando(){
            return this.tocando
        }
        getVolume(){
            return this.volume
        }
        // getMenuAcionado(){
            // return this.menu_acionado
        // }

        power(){
            let led = ""
            if (this.getLigado()) {
                this.setLigado(false)
                led = "red"
                window.location.reload()
            }else{
                this.setLigado(true)
                led = "green"
            }
            return led
        }
        menuAcionado(){
            return true
        }
        
        abrirMenu(){
            let statusLigado = "Está ligado? " +this.getLigado()+"\n"
            let statusTocando = "Está tocando? " +this.getTocando()+"\n"
            let statusVolume = "Volume: "+ this.getVolume()+"\n"
            let res = [statusLigado, statusTocando, statusVolume]
            let barra = ""

            for (let i = 0; i < this.getVolume(); i+=10) {
                barra+="| "
            }

            res[4] = barra

            if (!(this.getLigado())) {
                res[3] = "red"
            }else{
                res[3] = "green"
            }

            if (!(this.menuAcionado())) {
                return res = ["", "", "","red", ""]
            }else{
                return res
            }
        }
        maisVolume(){
            let res = ""
            if (this.getLigado()) {
                if (this.getVolume() < 100) {
                    
                    this.setVolume(this.getVolume() + 5)
                }else{
                    res = "Você alcançou o volume máximo\n"
                }
            }else{
                this.abrirMenu()
            }
            return res
        }
        menosVolume(){
            let res = ""
            if (this.getLigado()) {
                if (this.getVolume() > 0) {
                    this.setVolume(this.getVolume() - 5)
                    res = ""
                }else{
                    res = "Você alcançõu o volume mínimo\n"
                }
            }
            return res
        }
        mudo(){
            if (this.getLigado()) {
                if (this.getVolume() != 0 ) {
                    this.setVolume(0)
                }else{
                    this.setVolume(50)
                }
            }
        }
        play(){
            if (this.getLigado() && !(this.getTocando())) {
                this.setTocando(true)
            }
        }
        pause(){
            if (this.getLigado() && this.getTocando()) {
                this.setTocando(false)
            }
        }
}
