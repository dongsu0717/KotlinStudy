/* 처음에 있는거
fun main(args: Array<String>) {

    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
*/

/*
자바스크립트, 스위프트랑 연동개발 가능
안드로이드 스튜디오, 인텔리제 사용
함수형 언어임
 */

//2. 변수와 자료형
/*
 ;안붙여도됨
 클래스 - 파스칼(대문자)
 함수,변수 - 카멜(소문자)
 var - 언제든지 읽쓰가능
 val - 변경안되는거
 변수 선언위치에따라 이름바뀜 - 클래스에 선언된변수 : property
                         - scope 내에 선연 : local variable(로컬변수)
정수
Byte-8
Short -16
Int - 32
Long -64(뒤에 L)
실수
Float - 32(뒤에f)
Double - 64
 */
/*
fun main(){
    var a : Int //
    a=10
    val b : Int = 20
    var c : Int? = null
    var bigint : Long = 10L //L붙이기
    print(a)
    println(b)

    var aa : Char = '가'
    var aaa : Boolean = true
    val hihi = "아이아옹와어ㅏㄱ" //문자열
    val hihi2 = """asdadsadasd
        |asdasdad
        |asdsa
        |"""
}
*/
//3.형변환과 배열
/*
형변환 함수 toShort()처럼 to뒤에 바뀔자료형을 쓰면댐
 */
/*
fun main(){
    var a : Int = 543
    var b : Long =a.toLong()
    var intAr = arrayOf(1,2,3,4,5) //arrayOf() 배열
    var nA = arrayOfNulls<Int>(5) //arrayOfNulls<배열에 할당할 자료형(제너릭 이라함)>(배열크기)     크기 5의 비어있는 함수
    intAr[2] = 10
    println(intAr)
    print(intAr[2])
}
*/

//4.타입추론과 함수
/*
타입추론 : 알아서 추론해서 자료형 정해주는거
var intAr = arrayOf(1,2,3,4,5)              이게 아니라
var intAr : Array<Int> = arrayOf(1,2,3,4,5) 원래 이게 맞는거임
var a : String = " 쿠ㅡ우ㅡㅋ우"
무저건 자료형 지정해야하는거 아니면 타입추론 기능을 이용해 작성하자
var a = 10

 */
/*
fun main(){
    println(add(5,6,7))
}
fun add(a: Int, b: Int, c: Int): Int {   //( 받아야할 자료형 ) : 반화해줄 자료형(반환값 없으면 생략가능)
    return a+b+c
} // = un add(a: Int, b: Int, c: Int) = a+b+c 반환형의 타입추론도 가능
*/

//5.조건문, 비교연산자
/*
자료형 맞나 체크하는 is  (형변환도 해줌)
자료형 틀린거 체크하는 !is
a is Int

다중조건문  when - switch편리하게한거
if 는 참과 거짓만
when 하나의 변수를 여러개으 변수랑 비교가능

 */
fun main(){
    var a =7
    if(a>7){
        print("뿌에엥")
    }
    else {
        print("뿌ㅡ에에에에엥")
    }
}
fun dd(a : Any){ //Any : 어떤자료형이든 상관없이 호환되는거(코틀린의 최상위 자료형)
    when(a){
        1 ->println("정수 1임")
        "sda" ->println("문자열임")
    }
}








