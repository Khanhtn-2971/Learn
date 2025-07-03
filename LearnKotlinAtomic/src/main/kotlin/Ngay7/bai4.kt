package org.example.Ngay7.tools

//Tạo file `tracker.kt` với:
//- Package `tools`.
//- Lớp `Task` với:
//  - Thuộc tính `private var priority: Int` (mặc định `0`).
//  - Property `public var description: String` (mặc định `""`, setter chỉ gán nếu độ dài `>= 3`).
//  - Hàm `public fun setPriority(level: Int)`: Gán `level` vào `priority` nếu `level in 1..5`.
//  - Hàm `public fun report(): String`: Trả về `"Task: description, priority Priority."` (dùng `"None"` nếu `description` rỗng).
//- Tạo file `main.kt` với package `system`, nhập `tools.Task`, tạo `Task`, gọi `setPriority(3)`, đặt `description = "Fix bug"`, in `report()`, gọi `setPriority(6)`, in `report()`.
//**Đầu ra**:
//```
//Task: Fix bug, priority 3.
//Task: Fix bug, priority 3.

class Task{
    private var priority: Int = 0
    var description: String = ""
        set(value){
            if(value.length >= 3) {
                field = value
            }
        }
    fun setPriority(level: Int) {
        if(level in 1..5) {
            priority = level
        }
    }
    fun report(): String =
        if(description.isEmpty()) {
            "None"
        }
        else {
            "Task: $description, priority $priority."
        }
}