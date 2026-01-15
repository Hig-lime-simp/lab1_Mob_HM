enum class Priority {
    LOW, MEDIUM, HIGH
}

data class Task(
    var title: String = "",
    var description: String = "",
    var isCompleted: Boolean = false,
    var priority: Priority = Priority.LOW
)