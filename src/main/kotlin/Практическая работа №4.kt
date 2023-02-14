fun main(){
    println("Введите координаты точки: ")
    val x = readLine().toString().toInt()
    println("Введите координаты точки: ")
    val y = readLine().toString().toInt()
    if (x > 0 && y > 0) println("Точка принадлежит 1-ой четверти")
    else if (x < 0 && y > 0) println("Точка принадлежит 2-ой четверти")
    else if (x < 0 && y < 0) println("Точка принадлежит 3-ой четверти")
    else if (x > 0 && y < 0) println("Точка принадлежит 4-ой четверти")
}