data class Task(
    var title: String = "",
    var description: String = "",
    var isCompleted: Boolean = false
){
    enum class priority {
        low, medium, high
    }
}
