public class ejercicio6 {



    //¿Qué hace?
    //Te pide que introduzcas la capital de Francia, en este caso París, y te dice si es correcto o no.
    //Si es incorrecto, te muestra cuantos intentos te quedan hasta que lo adivines.
    //El bucle se repetirá hasta que se introduzca la respuesta correcta o se agoten los intentos máximos permitidos(5)

    //Algoritmo incorrecto
    //No se está incrementa la variable numIntento después de cada intento del usuario, por lo tanto no te suma los intentos
    //que le quedan al usuario, quedándose siempre en el mismo número.
    // Debe incluir tanto la verificación de que la respuesta del usuario es incorrecta como el control del número de intentos


//TODO: ALGORITMO YA CORREGIDO
    /*public static void algoritmoCorregido(){
        Variable numIntento : entero <- 1
        Variable valorIntroducido : texto
        Constante MAX_INTENTOS : entero <- 5

        Inicio
        valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")

        MientrasQue valorIntroducido ≠ "París" y numIntento < MAX_INTENTOS
        escribir("Respuesta incorrecta")
        escribir("Solo quedan " & MAX_INTENTOS - numIntentos & " intento(s)")
        numIntento <- numIntento + 1
        valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")
        FMq

        Si valorIntroducido = "París" Entonces
        escribir("Bravo")
        Si no
        escribir("Revise sus conocimientos en geografía")
        FSi
                Fin

    }*/
}
