@file:Suppress("UNUSED_PARAMETER")

package lesson11.task1

/**
 * Класс "комплексое число".
 *
 * Общая сложность задания -- лёгкая.
 * Объект класса -- комплексное число вида x+yi.
 * Про принципы работы с комплексными числами см. статью Википедии "Комплексное число".
 *
 * Аргументы конструктора -- вещественная и мнимая часть числа.
 */
class Complex(val re: Double, val im: Double) {

    /**
     * Конструктор из вещественного числа
     */
    constructor(x: Double) : this(x, 0.0)

    /**
     * Конструктор из строки вида x+yi
     */
    constructor(s: String) : this(s.replace("-", "+-").substringBefore('+').toDouble(),
        s.replace("-", "+-").substringAfter('+').substringBefore('i').toDouble())

    /**
     * Сложение.
     */
    operator fun plus(other: Complex): Complex = Complex(re + other.re, im + other.im)

    /**
     * Смена знака (у обеих частей числа)
     */
    operator fun unaryMinus(): Complex = Complex(im * (-1), re * (-1))

    /**
     * Вычитание
     */
    operator fun minus(other: Complex): Complex = Complex(re - other.re, im - other.im)

    /**
     * Умножение
     */
    operator fun times(other: Complex): Complex {
        return Complex(re * other.re - im * other.im, re * other.im + other.re * im)
    }

    /**
     * Деление
     */
    operator fun div(other: Complex): Complex = TODO()

    /**
     * Сравнение на равенство
     */
    override fun equals(other: Any?): Boolean = TODO()

    /**
     * Преобразование в строку
     */
    override fun toString(): String = TODO()
}