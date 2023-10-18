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
when 하나의 변수를 여러개의 변수랑 비교가능
when 조건에 맞을때 동작되게 하는거(여러개 조건이 맞으면 먼저 부합하는 조건이 실행)
 */
/*
fun main(){
    var a =7
    if(a>7){
        print("뿌에엥")
    }
    else {
        print("뿌ㅡ에에에에엥")
    }

    dd(1)
    dd("sda")
    dd("asdassd")
    dd(12L)
    dd(3.12312)
}
fun dd(a : Any){ //Any : 어떤자료형이든 상관없이 호환되는거(코틀린의 최상위 자료형)
    when(a){ //a랑 비교할 조건값들
        1 -> println("정수 1임")        //a가 1일씨 "정수 1임 출력"
        "sda" ->println("문자열임")
        is Long -> println("long")
        !is String -> println("string 아님")
        else -> println(" 어떤 조건도 만족 ㄴ")
    }
}
 */

//6.반복문과 증감연산자
/*
조건형 반복문 - while, do while(조건없이 구문실행후 조건을 체크함, 조건없이 반드시 한번은 사용할때 사용)
범위형 반복문 - for
 */
/*

fun main(){
    var a =0
    while(a<5){
        println(a++)
    }

    do
    {
        println(a++)
    }while(a<5)

    for(i in 0..9){ //i를 0부터 9까지 반복
        print(i)
    }
    println()
    for(i in 0..9 step 3){ //증가값 3으로 두기
        print(i) //0369
    }
    println()
    for(i in 9..0){ //실행 ㄴ
        print(i)
    }
    println()
    for(i in 9 downTo 0){ //9부터 0까지 감소하는거(감소도 step가능)
        print(i)
    }
    println()
    for(i in 'a'..'e'){ //문자도가능?
        print(i)
    }
    println()
}
 */

//7.흐름제어와 논리연산자
/*
코틀린은 다중반복문에서 break continue가 적용되는 반복문을 label을 통해 지정가능
논리 연산자 - && and   || or     ! not
 */
/*
fun main(){
    for (i in 1..10) {
        if (i == 3) break //continue
        print(i)
    }
    println()
    for(i in 1..10){
        for(j in 1..10){
            if(i==1 && j ==2)break
            print(i)
            print(j)
        }
    }
    println()
    looooop@for(i in 1..10){ //레이블이름looooop과 @달기
        for(j in 1..10){
            if(i==1 && j ==2)break@looooop //@과 레이블이름 달기
            println("i : $i, j : $j")  //""안에서ㅏ 변수 출력할때는 변수명앞에 $표시 해주면됨
        }
    }
}
 */
//8. 클래스 기본구조
/*
fun main(){
    var a = P("이동수",1998)           //인스턴스
    println("나는 ${a.name}이고 ${a.birth}년생입니다") //변수명.속성명
    a.introduce()
}

class P(var name : String, val birth :Int){ //() 안에있는게 클래스 속성임,속성선언과 동시에 생성자역시 선언하는거( 클래스는 인스턴스르 만드는 틀임)
    fun introduce(){        //함수
        println("나는 ${name}이고 ${birth}년생입니다")
    }
}
 */

//9.클래스 생성자
/*
생성자 - 새로운 인스턴스를 만들기위해 호출하는 특수한 함수
init - 패러미터나 반환형이 없는 특수한함수, 생성자를 통해 인스턴스가 만들어질때 호출되는함수
보조생성자 - 년도가 1996년생이 90%면 다 입력하기 비효울적이자나 그때쓰이는구만
 */
/*
fun main(){
    var a = P("이동수",1998)   //이게 출력되네

    var d  = P("심성재")   //보조 생성자가 1996년으로 해놨음
}

class P(var name : String, val birth :Int){
    init{       //함수
        println("나는 ${this.name}이고 ${this.birth}년생입니다")
    }

    constructor(name : String) : this(name,1996){ //보조생성자함수 ()안에있는게 파라미터임, 년도는 1996으로 고정했다느뜻
        println("보조생성자 사용")
    }
}
 */

//10.클래스 상속
/*
코틀린은 상속 금지가 기본값임, 클래스 상속해주려면 open 상태로해야함
코틀린에서 서브클래스는 수퍼클래스에 존재하는 속성과 '같은 이름'의 속성을 가질수 없음
                , 생성될때는 반드시 수퍼클래스의 생성자까지 호출해야함
 */
/*
fun main(){
    var a = animal("별이", 5, "개")
    var b = Dog("별이",5)
    //위에 두개 같음
    a.intro()
    b.intro()

    b.bark()
}
open class animal(var name : String, var age : Int, var type : String){
    fun intro(){
        println("저는 $name 이고, $age 살 입니다")
    }
}
class Dog (name : String, age : Int) : animal(name,age,"개"){ //  : animal()이 상속받는다는뜻
    fun bark(){
        println("왈왈")
    }
    fun animal(){

    }
}
class Cat(name: String, age : Int) : animal(name,age,"고양이"){ //생성자에서 이름과 나이르 받긴함, 클래스 자체 속성으로 만들어주는 var 붙이지않음 일반 패러미터로받는다(var,val을 붙이면 속성으로 선언)
    fun meow(){
        println("냐옹")
    }
}
*/

 // 11.오버라이딩과 추상화
/*
a수퍼클래스 a서브클래스 불가능(이름 ㄴ)
인터페이스 - 속성,추상함수,일반함수   생성자x  (구현부 있으면 open함수로 생각, 없으면 abstract함수로 생각      그래서 작성 안해도된다), 한번에 여러 인터페이스 상속받을수있음
추상화 - 생성자o

오버라이드 - 이미 구현된거를 서브클래스에서 재정의
추상화 - 이름만 만들어 논거를 서브클래스에서 제대로 만듬
인터페이스 - 서로다른 기능들을 여러개 물려주어야할때 유용
 */
/*
fun main(){
    var t = Tiger()
     t.intro()
}
open class animal(){
    open fun intro(){ //수퍼클래스에서 open이 붙은 함수는 서브클래스 오버라이드 해서 제구현가능
        println("저는 입니다")
    }
}
class Tiger : animal(){
    override fun intro() {      //오버라이딩
        println("오버라이드 됐지롱")
    }
}
 */

/*
fun main(){

}
abstract class animal(){        
    abstract fun eat()          //abstract가 붙은 추상클래스는 일부함수ㅡ가 구현되지않은거니까 단독으로 인스턴스 만들수없음
    fun intro(){
        println("저는 입니다")
    }
}
class rabit : animal(){
    override fun eat(){
        println("당근냠")
    }
}
 */
/*
fun main(){

}
interface  run{
    fun r()
}
interface eat{
    fun e(){
        print("내ㅑㅁ")
    }
}
class ddog : run, eat{      //dog는 두인터페이스 상속받은 서브클래스
    override fun e() {
        super.e()
    }

    override fun r() {
        TODO("Not yet implemented")
    }
}
 */

//12.기본 프로젝트 구조
/*
한 프로젝트는 여러개의 모듈이있고 그안에는 리소스파일,폴더,파일들이 있다(물리적구조)
패키지(논리적구조)-서비스 도메인 youtube.com 이면  ->com.youtube.dongsuproject
                             기능별 세분화     ->com.youtube.dongsuproject.gogo
                             기능별 세분화     ->com.youtube.dongsuproject.back
package 안적으면 디폴트 패키지로 적용
코틀린 - 폴더구조와 패키지명을 일치시키지 않아도됨 (패키지 이름만 같으면됨)
패키지안에서는 변수, 함수 ,클래스 그냥 다 공유가능( 패키지 다르면 못씀 )
그럴땐 import해서 써야함
코틀린은 클래스명과 파일명이 일치하지 않아도됨
하나의 파일에 여러개 클래스 넣어도 됨
 */

//13.변수, 함수, 클래스의 접근범위와 접근 제한자
/*
스코프 - 변수 함수 클래스 공유하여 사용할 범위 지정
패키지 클래스 함수
스코프 외부에서는 스코프내부 멤버를 참조연산자로만 참조가능함(a.eat(), import)
동일 스코프내에서는 멤버공유가능
패키지 명시안하면 디폹트 패키로 됨. 그러면 패키지  표ㅗ시안한애들은 다 같은 패키지에 속했음
접근 제한자 - public internal provate protected
public 어떤 패키지에서도 접근가능
internal 같은 모듈내에서만
private 같은 파일내에서만
protected 자신과 상속받은 애들만 사용가능
 */

//14.고차함수 람다함수
/*
고차함수        (String) -> Unit
람다함수
 */
/*
fun main(){
    b(::a)                  //고차함수, b가 호출함 함수 a    출력
    //a함수를 b함수에 패러미터로 넘김 -> b함수는  받아온a함수에 'b가 호출함'이라는 값을 넘겨서 호출함 -> 최종적으로 a라는 함수가 실행(str = 'b가 호출함')
    val c : (String) -> Unit = { str -> println("$str 람다함수") }  //람다함수
    b(c)                    //b가 호출함 람다함수   출력
}
fun a (str:String){
    println("$str 함수 a")
}
fun b (funcio: (String)->Unit){ //(패러미터)->반환형  Unit=값이없다는 뜻
    funcio("b가 호출함")
}
*/

//15.스코프 함수
/*
람다함수 이용한 스코프함수 - apply, run, with, also, let

람다함수도 여러줄로 표현이 가능,여러줄이되면 마지막 구문 결과값이 반환됨
람다함수가 패러미터가 없으면 실행할 구문만 나열하면댐
람다함수가 패러미터가 하나면 it을 사용  $it
 */
/*
fun main(){

    var a = Book("동수책",10000)
    a.name = "[초특가]"+a.name
    a.discount()

    var b = Book("동수책2",20000).apply {  //main함수와 별도의 스코프에서 인스턴스의 변수를 함수를 조작함(코드 깔끔해짐)
        name = "[초특가]"+name
        discount()
    }
    b.run {
        println("$name , $price")               //[초특가]동수책2 , 18000 출력
    }
    //a.rum{} = with(a){}
     b


}
class Book(var name : String, var price : Int){
    fun discount(){
        price = price - 2000
    }
}
 */

//16.오브젝트
/*
object -
static - 클래스 내부에서 별도의 영역에 고정적으로 존재해, 인스턴스를 생성하지 않아도 공용으로 사용가능한 속성이나 함수
 */
/*
fun main(){
    var jj = food("자장")
    var jp = food("짬뽕")
    jj.vote()

    jp.vote()
    jp.vote()


}
class food(val name : String){
    companion object{
        var total = 0       //전체 투표수
    }
    var count = 0           //개별 투표수

    fun vote(){
        total++
        count++
    }
}
*/

//17.익명객체와 옵저버 패턴
/*
옵저버 - 감시자, 이벤트쓸때 필요
옵저버 패턴 - 이벤트 수신클래스, 이벤트 발생및 전달 클래스 필요
 */
fun main(){


}
interface EventListergogo{
    fun onEvent(count:Int)
}
class EventPrinter(){

}
class Counter(var lister: EventListergogo){

}