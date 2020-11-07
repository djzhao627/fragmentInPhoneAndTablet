package cn.djzhao.newspractice.utils

/**
 * 计算字符串中字符的个数  <br />
 * 扩展函数
 */
fun String.countLetters(): Int {
    var n = 0
    for (char in this) {
        if (char.isLetter()) {
            n++
        }
    }
    return n
}

/**
 * 字符串乘法操作 <br />
 * 扩展函数+自定义操作符
 */
operator fun String.times(n: Int): String {
    return repeat(n)
}