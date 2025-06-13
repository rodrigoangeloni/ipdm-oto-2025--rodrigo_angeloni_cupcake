
package com.example.cupcake.data

/**
 * Clase de datos que representa el estado actual de la interfaz de usuario en términos de [quantity], [flavor],
 * [dateOptions], [date] de recogida seleccionada y [price]
 */
data class OrderUiState(
    /** Cantidad de cupcakes seleccionada (1, 6, 12) */
    val quantity: Int = 0,
    /** Sabor de los cupcakes del pedido (como "Chocolate", "Vainilla", etc.) */
    val flavor: String = "",
    /** Fecha seleccionada para la recogida (como "Ene 1") */
    val date: String = "",
    /** Precio total del pedido */
    val price: String = "",
    /** Fechas de recogida disponibles para el pedido*/
    val pickupOptions: List<String> = listOf()
)
