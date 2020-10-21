package org.unitec.localizaamigos

import retrofit2.http.Body
import retrofit2.http.POST

interface ServicioUsuario {
    //Vamos a seguir la ruta de servicios esti;p rest

    //Primero, siguiendo el estilo REST usamos el metodo POST
    //EL METODO post "SIEMPRE" SE USAR PARA "GUARDAR"
    //A la siguiente anotacion se le conoce como construccion de una API REST
    //aihjsidna
    @POST("api/usuario")
    fun guardar(@Body usuario:Usuario):Call<Estatus>
}