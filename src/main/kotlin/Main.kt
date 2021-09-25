import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main() {
    val json = toJson(
        toDoList = ToDoList(
            toDos = listOf(
                "kotlinx.serialization 라이브러리 사용해보기",
                "제네릭도 직렬화해주는 멋진 라이브러리를 찾은 거에 감사하기",
            ),
            writerName = "이진혁",
        )
    )
    println("json: $json")
}

fun toJson(toDoList: ToDoList) =
    Json.encodeToString(toDoList)

@Serializable
data class ToDoList(
    val toDos: List<String>,
    val writerName: String,
)