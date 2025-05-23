package org.example.Ngay9

/*
Yêu cầu:
Viết lớp MessageFormatter với:
Extension function String.formatMessage(prefix: String = "", suffix: String = ".") trả về chuỗi thêm prefix và suffix.

Hai hàm overloaded processMessage:
processMessage(text: String): Gọi formatMessage với prefix = ">> " và suffix = "!".
processMessage(text: String, upper: Boolean): Gọi formatMessage với prefix = ">> " và suffix = "!", chuyển hoa nếu upper = true.
Trong main, tạo MessageFormatter, gọi cả hai hàm với "Hello" và "Hello" với upper = true, in "Message: result.".

Đầu ra:
Message: >> Hello!.
Message: >> HELLO!.

Gợi ý:
Dùng named arguments cho formatMessage (Atom 3.2).
Hàm: uppercase(), plus() (Atom 3.1).
 */

class MessageFormatter {
    fun String.formatMessage(prefix: String = "", suffix: String = ".") = prefix + this + suffix
    fun processMessage(text: String) =
        text.formatMessage(">> ", "!")


    fun processMessage(text: String, upper: Boolean) =
        if (upper == true) {
            text.uppercase().formatMessage(">> ", "!")
        } else
            text.formatMessage(">> ", "!")
}

fun main() {
    var messageFormatter = MessageFormatter()
    println("Massage: ${messageFormatter.processMessage("Hello")}.")
    println(
        "Massage: ${
            messageFormatter.processMessage("Hello", true)
        }."
    )
}