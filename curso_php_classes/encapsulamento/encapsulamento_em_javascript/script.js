import { Controle } from "./Controle.js";
var c = new Controle


let power = document.querySelector("#btn_power")

let menos = document.querySelector("#btn_menos")

let led = document.querySelector("#led")

let mais = document.querySelector("#btn_mais")
let mudo = document.querySelector("#btn_mudo")
let menu = document.querySelector("#btn_menu")
let play = document.querySelector("#btn_play")
let pause = document.querySelector("#btn_pause")

let res = document.querySelector("#res")
menu.addEventListener("click", () => {
    let msg = c.abrirMenu()
    res.innerHTML = msg[0]+msg[1]+msg[2]+msg[4]

    led.style.backgroundColor = "yellow"

    setTimeout(() => {
        led.style.backgroundColor = msg[3]
    }, 200);
})
power.addEventListener("click", () => {
    led.style.backgroundColor = c.power()

})
mais.addEventListener("click", () => {
    res.innerHTML = c.maisVolume()
    let msg = c.abrirMenu()
    res.innerHTML += msg[0]+msg[1]+msg[2]+msg[4]

    led.style.backgroundColor = "yellow"

    setTimeout(() => {
        led.style.backgroundColor = msg[3]
    }, 200);
})
menos.addEventListener("click", () => {
    res.innerHTML = c.menosVolume()
    let msg = c.abrirMenu()
    res.innerHTML += msg[0]+msg[1]+msg[2]+msg[4]

    led.style.backgroundColor = "yellow"

    setTimeout(() => {
        led.style.backgroundColor = msg[3]
    }, 200);
})
mudo.addEventListener("click", () => {
    c.mudo()
    let msg = c.abrirMenu()
    res.innerHTML = msg[0]+msg[1]+msg[2]+msg[4]

    led.style.backgroundColor = "yellow"

    setTimeout(() => {
        led.style.backgroundColor = msg[3]
    }, 200);
})

play.addEventListener("click", () => {
    c.play()
    let msg = c.abrirMenu()
    res.innerHTML = msg[0]+msg[1]+msg[2]+msg[4]

    led.style.backgroundColor = "yellow"

    setTimeout(() => {
        led.style.backgroundColor = msg[3]
    }, 200);
})
pause.addEventListener("click", () => {
    c.pause()
    let msg = c.abrirMenu()
    res.innerHTML = msg[0]+msg[1]+msg[2]+msg[4]

    led.style.backgroundColor = "yellow"

    setTimeout(() => {
        led.style.backgroundColor = msg[3]
    }, 200);
})