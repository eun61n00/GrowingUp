import com.hellomygreenworld.sample.Person as Person

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val intro: String = "안녕하세요"
    val num: Int = 20

    println("intro: $intro, num: $num")

    val person0 = Person("권은빈", 20)
    println(person0.name)
    println(person0.age)
}