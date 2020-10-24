package org.unitec.localizaamigos

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ServicioUsuario {
    //Vamos a seguir la ruta de servicios esti;p rest

    //Primero, siguiendo el estilo REST usamos el metodo POST
    //EL METODO post "SIEMPRE" SE USAR PARA "GUARDAR"
    //A la siguiente anotacion se le conoce como construccion de una API REST
    //aihjsidna
    @POST("api/usuario")
    fun guardar(@Body usuario:Usuario):Call<Estatus>

    //El siguiente metodo sirve para buscar todos los usuarios que ya guardaste
    @GET("api/usuario")

    fun buscarTodos():List<Usuarios>

}