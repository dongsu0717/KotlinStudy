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

 변수 선언위치에따라 이름바뀜
  - 클래스 내에 선언된변수 : property(프로퍼티)
  - scope 내에 선연 : local variable(로컬변수)

코틀린은 기본 변수에서 null은 허용하지않음 (다른 언어들은 변수가 초기화되지 않으면 null처리)
var c : Int? = null (변수에 null을 허용한다, 이렇게하면 null됨)

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
형변환 함수 toShort()처럼 to뒤에 바뀔자료형을 쓰면댐\
형변환 할때 직접 개발자가 변환해야함 (.toInt()해서)
 var iAr : Array<Int>  = arrayOf(1,2,3,4,5)
var nA = arrayOfNulls<Int>(5) 크기 5의 비어있는 함수 만들기
<>는 제너릭이라함
배열 장점 : 한번 선언해두면 다른 자료구조보다 빠른 입출력 가능
배열 단점 : 한번 선언해두면 크기를 바꿀수없다,
 */
/*
fun main(){
    var a : Int = 543
    var b : Long =a.toLong()
    var iAr = arrayOf(1,2,3,4,5) //arrayOf() 배열
    var nA = arrayOfNulls<Int>(5) //arrayOfNulls<배열에 할당할 자료형(제너릭 이라함)>(배열크기)     크기 5의 비어있는 함수 만들기
    intAr[2] = 10
    println(iAr)
    print(iAr[2])
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

return이 오면 뒤에 뭐가 있든 함수 종료

var iAr = arrayOf(1,2,3,4,5) 함수를 변수

fun add(a: Int, b: Int, c: Int) : Int = a+b+c  변수에 값을 할당하듯 사용할수도 있다
함수 - 내부적인 기능을 가진형태
    - 외부적으로 봤을때는 파라미터를 넣는다는 점 외에는 자료형이 결정된 변수라는 개념으로 접근하자
 */
/*
fun main(){
    println(add(5,6,7))
}
fun add(a: Int, b: Int, c: Int): Int {   //( 받아야할 자료형 ) : 반화해줄 자료형(반환값 없으면 생략가능)
    return a+b+c
    fun add(a: Int, b: Int, c: Int) = a+b+c
}
// = fun add(a: Int, b: Int, c: Int) = a+b+c 반환형의 타입추론도 가능
*/


//5.조건문, 비교연산자
/*
자료형 맞나 체크하는 is  (형변환도 해줌)
a is Int (a가 Int인가 확인 and Int로 형변환 시켜줌)
자료형 틀린거 체크하는 !is
a is Int

다중조건문  when - switch편리하게한거
if 는 참과 거짓만
when 하나의 변수를 여러개의 변수랑 비교가능
when 조건에 맞을때 동작되게 하는거(여러개 조건이 맞으면 먼저 부합하는 조건이 실행)
등호나 부등호 사용못함
여러개 만족하면 먼저 만족하는 부분만 실행
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
범위형 반복문 - for (step 붙여서 변하는 값 범위 정할 수 있음, downTo는 감소할때 쓸수있음)
                    ('a'..'e'같은 문자열도 가능)
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
코드흐름 return break continue

코틀린은 다중반복문에서 break continue가 적용되는 반복문을 label을 통해 지정가능
반복문이 여러개면 종료하고싶을때 각각 반복문에 종료하는거를 다 넣어줘야 하는데 끝내버릴 반복문 맨앞과 맨뒤에 변수@맨앞  맨뒤@변수 를 해줘숴 한번에 종료시킬수있다(continue도 가능)

논리 연산자 -
    && and
    || or
    ! not
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

        }
    }
    println()
    loop2@for(i in 1..10){ //레이블이름(아무거나) @달기
        for(j in 1..10){
            if(i==1 && j ==2)break@loop2 //@과 레이블이름 달기
            println("i : $i, j : $j")  //""안에서ㅏ 변수 출력할때는 변수명앞에 $표시 해주면됨
        }
    }
}
 */


//8. 클래스 기본구조
/*
클래스 : 고유의 특징값(속성)
        기능의 구현(함수)
함수없이 속성만 갖춘 클래스는 class P(var name : String, val birth :Int) 이렇게 끝낼수있다

클래스는 인스턴스를 만드는 틀
인스턴스 - 클래스를 이용해 만들어내는 서로다른 속성의 객체를 지칭하는 용어

자주 사용하는 공통적 기능은 클래스내에 함수로 넣자
 */
/*
fun main(){
    var a = P("이동수",1998)           //인스턴스
    var b = P("심섬재",1997)
    var c = P("소진호",1999)
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
class P(var name : String, val birth :Int) 클래스 속성들을 선언함과 동시에 생성자도 선언한 것

생성자 - 새로운 인스턴스를 만들기위해 호출하는 특수한 함수
        인스턴스 속성을 초기화
        인스턴스 생성시 필요한 구문을 수행 (init을 통해 가능)
init - 패러미터나 반환형이 없는 특수한함수, 생성자를 통해 인스턴스가 만들어질때 호출되는함수
       생성자를 통해 인스턴스가 만들어 질 때 호출되는 함수
       클래스 함수는 .를 통해 호출해야하는데 이거는 그냥 바로 호출되나보다

보조생성자 - constructor() 키워드 사용
           년도가 1996년생이 90%면 다 입력하기 비효울적이자나 그때쓰이는구만
           보조생성자 만들때 반드시 기본 생성자를 통해 속성을 초기화 해주어야함
           보조생성자가 기본생성자를 호출하려면 : 붙이고 this라는 키워드를 사용하고 기본생성자가 필요로 하는 패러미터를 ()에 넣으면된다
           constructor(name : String) : this(name,1996)  이름은 받은 그대로 넘겨주고 년도는 1996년을 초기화함
 */
/*
fun main(){
    var a = P("이동수",1998)           //인스턴스
    var b = P("심섬재",1997)           //위에는 아무 것도 출력을 못하는데 이거는 인스턴스 생성을하면서 init 이 호출돼 바로 init함수 실행
    var c = P("소진호",1999)
    var d  = P("심성재")   //보조 생성자가 1996년으로 해놨음
                          출력
                          나는 심성재 1996년생입니다
                          보조생성자 사용


}

class P(var name : String, val birth :Int){
    init{       //함수
        println("나는 ${this.name}이고 ${this.birth}년생입니다") //this는 인스턴스 자신의 속성이나 함수를 호출하기위해 클래스 내부에서 사용되는 키워드 임
    }

    constructor(name : String) : this(name,1996){ //보조생성자함수 ()안에있는게 파라미터임, 년도는 1996으로 고정했다느뜻
        println("보조생성자 사용")
    }
}
 */


//10.클래스 상속
/*
속성과 함수를 물려주는 쪽이 수퍼클래스

코틀린은 상속 금지가 기본값임, 클래스 상속해주려면 open 상태로해야함

코틀린에서 서브클래스는 수퍼클래스에 존재하는 속성과 '같은 이름'의 속성을 가질수 없음
class Dog (name : String, age : Int)  클래스 자체 속성을 만들어주는 var을 붙이지 않음, 일반 패러미터로 받아 animal클래스 생성자에 직접 넘겨주어야함
                                      var, val을 붙이면 속성으로 선언됨
서브클래스가 생성될때는 반드시 수퍼클래스의 생성자까지 호출해야함

상속은 class 뒤에 : 를 붙이고 수퍼클래스의 생성자를 호출할수 있도록 해주면됨
class Dog (name : String, age : Int) : animal (name,age,"개") 개는 고정된 값을 넘김
var a = animal("별이", 5, "개")  이 두개가 같음
var b = Dog("별이",5)
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
기본적으로 super class에있는 fun와 같은 이름과 같은형태를 가진 함수는 sub class에서 만들 수 없다
super class fun a(b : int) -> sub class fun a(b : int)  xxxxxxxxxxxxxxx
그러나 이것도 수퍼클래스 함수 open을해서 허용하면 서브클래스에서 오버라이딩해 쓸 수 있다

추상화 - 이름만 만들어 논거를 서브클래스에서 제대로 만듬
abstract class animal(){ //일부 함수가 구현되지 않은 미완성 클래스, 단독으로는 인스턴스를 만들 수 없음
    abstract fun eat()
}
class rabit : animal(){
    override fun eat(){
        println("당근냠")
    }
}

추상화를 하는 다른 방법 - 인터페이스
원래의 인터페이스 - 추상함수로만 이루어져 있는 '순수 추상화 기능'
추상함수 - 생성자 가질 수 있음
인터페이스 - 서로다른 기능들을 여러개 물려주어야할때 유용
           생성자 가질 수 없음
           구현부가 있는 함수 -> open함수로 기본적으로 간주(별도의 키워드 없어도됨)
           구현부가 없는 함수 -> abstract함수로 기본적으로 간주(별도의 키워드 없어도됨)
           open abstract 없어도 서브클래스에서 구현, 재정의 가능(서브클래스에서는 override 써야함)

           한번에 여러 인터페이스 상속받을 수 있음
           class dog : run, eat
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
    var r = rabit()
    r.eat()
    r.intro
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
범위 - 패키지 클래스 함수

스코프 외부에서는 스코프내부 멤버를 참조연산자로만 참조가능함(a.eat(), import)
동일 스코프내에서는 멤버공유가능
스코프의 같은 레벨에서는 같은 이름의 변수를 만들면 안된다. but 하위 스코프에서는 같은 이름의 변수를 만들어 쓸 수 있다

패키지 명시안하면 디폹트 패키로 됨. 그러면 패키지  표시안한애들은 다 같은 패키지에 속했음

접근 제한자 - public internal provate protected
패키지
public 어떤 패키지에서도 접근가능
internal 같은 모듈내에서만
private 같은 파일내에서만
protected 사용 x
클래스
public 클래스 외부에서 가능
internal 사용 x
private 클래스 내부에서만
protected 자신과 상속받은 애들만 사용가능
*/


//14.고차함수 람다함수
/*
고차함수 - 함수를 클래스에서 만들어낸 인스턴스처럼 취급하는 방식
         함수를 패러미터로 넘겨주거나 결과값으로 반환 받을수 있음
         코틀린에서 모든 함수를 고차함수로 사용가능
(String) -> Unit

람다함수 - 일반함수와 달리 그 자체가 고차함수임, 별도의 연산자 없이 변수에 담을 수 있다
         고차함수말고 람다함수를 쓰자, 가독성 더좋고 쓰기편함
 */
/*
fun main(){
    b(::a)      //함수 b를 호출하는데 함수a를 패러미터로 넘겨줌
                //일반 함수를 고차함수로 변경해주는 연산자
                //str = "b가 호출한"
                //최종적으로 a라는 함수가 실행
                //출력 b가 호출한 함수 a

    val c : (String)->Unit = {str: String -> println("$str 람다함수") } //str은 String으로 받아온 값을 람다함수 내에서 사용할 변수이름임
    val d                  = {str: String -> println("$str 람다함수") }
    val e : (String)->Unit = {str         -> println("$str 람다함수") }

    b(c)        //출력 b가 호출한 람다함수
                //b(::a)랑 동일한거
    b(d)
    b(e)
}
fun a (str: String) { //a라는 함수는 문자열을 패러미터로 받음, 문자열은 받고 반환형은 없는 함수
    println("$str 함수 a")
}
fun b (funcion: (String)->Unit) {       //(함수가 받을 패러미터(자료형)) -> 자료형(반환형)
    funcion("b가 호출한")
}
*/


//15.스코프 함수
/*
val c : (String)->Unit = {str: String -> println("$str 람다함수") } 이 표현 말고도

람다함수도 여러줄로 표현 가능
val c:(String) -> Unit = { str ->
    println()
    println()
    println()
}
여러줄일경우 마지막 구문의 결과값이 반환됨(a+b가 int로)
val cal: (Int,Int) -> Int(반환) = {a,b ->
    println(a)
    println(b)
    a+b
}
패러미터가 없는 람다함수는 실행할 구문만 나열하면댐
val a :() -> Unit = { print() }
패러미터가 하나뿐이면 it을 사용
val c:(String) -> Unit ={ print(it) }

스코프함수 - 함수형 언어의 특징을 좀 더 편리하게 사용할수 있도록 제공하는 함수
람다함수 이용한 스코프함수 - apply, run, with, also, let
apply - 인스턴스 생성후 변수에 담기전에 '초기화 과정'을 수행할때 사용
run - 이미 인스턴스가 만들어진후에 함수 인스턴스의 함수나 속성을 스코프 내에서 사용해야할때 유용
with - run과 동일한기능, 인스턴스 참조연산자 대신 패러미터로 받는다는 차이만 있다(a.run{} = with(a){} 똑같네)

apply,also - 처리가 끝나면 인스턴스를 반환
run,let - 처리가 끝나면 최종값으 반환
also,let - 패러미터로 인스턴스를 넘긴것처럼 it을통해 인스턴스를 사용할수있다(패러티터를 통해 인스턴스를 사용한다)
         - 같은 이름의 변수나 함수가 스코프 바깥에 중복되어 있는 경우에 혼란을 방지하기 위해사용

람다함수도 여러줄로 표현이 가능,여러줄이되면 마지막 구문 결과값이 반환됨
람다함수가 패러미터가 없으면 실행할 구문만 나열하면댐
람다함수가 패러미터가 하나면 it을 사용  $it
 */
/*
fun main(){
    //var price = 5000
    var a = Book("동수책",10000)
    a.name = "[초특가]"+a.name
    a.discount()

    var b = Book("동수책2",20000).apply {  //main함수와 별도의 스코프에서 인스턴스의 변수를 함수를 조작함(코드 깔끔해짐)
        name = "[초특가]"+name     //a. 처럼 참조연산자 없이 사용가능
        discount()
    }
    println("${a.name}, ${a.price}")  //출력 - [초특가]동수책, 8000

    b.run {                   //apply처럼 {}안에서 참조 연산자 사용 안해도됨
        println("$name , $price")     //출력 - [초특가]동수책2 , 18000
    }                                 //var price = 5000넣으면 초특가]동수책2 , 5000 출력  <- 이럴때 let씀
                                       //also도 apply대신에 쓰면댐
    b.let{
        println("${it.name} , ${it.price}")  //출력 - [초특가]동수책2 , 18000
    }
}

class Book(var name : String, var price : Int){
    fun discount(){
        price = price - 2000
    }
}
 */


//16.오브젝트
/*
기존 클래스 - 인스턴스를 만들기위한 틀 -> 내부에 잌ㅆ는 속성이나 함수를 사용하려면 생성자를 통해 인스턴스 객체를 만들어야함( ex) val c = person("이동수",1996))
          - 그러나 여러개의 인스턴스 객체가 필요하지 않고 단 하나의 객체만으로 공통적인 속성과 함수를 사용해야 하는 코드에서는 클래스말고 object쓰면댐

object - 생성자 없이 직접 객체를 만들어냄
       - 인스턴스 생성안해도됨, 그자체가 객체임
싱글턴 패턴 - 클래스의 인스턴스를 단 하나만 만들어 사용하도록 하는 코딩 아키텍쳐 패턴

object는 인스턴스 생성 없이 쓸수있음
오브젝트 이름에 직접 참조연산자를 붙여 사용한다
object로 선언된 객체는 최초사용시 자동생성
이후에는 코드 전체에서 공용으로 사용될 수 있음(프로그램이 종료될때까지 공통적으로 사용되는 것을 묶어 만드는게 좋다)

클래스안에도 object사용가능(companion object)
클래스 인스턴스 기능은 그대로 사용하면서, 인스턴스간에 공통을 사용할 함수를 만드는거 (static이랑 비슷)
ex) 각각 투표수, 토탈 투표수

static - 클래스 내부에서 별도의 영역에 고정적으로 존재해, 인스턴스를 생성하지 않아도 공용으로 사용가능한 속성이나 함수
 */
/*
fun main(){
    println(Counter.count)

    Counter.countUp()
    println(Counter.count)
}
object Counter { //인스턴스 자체가 객체이므로 생성자 사용x
    var count = 0

    fun countUp(){
        count++
    }
    fun clear(){
        count = 0
    }
}
 */

/*
fun main(){
    var jj = food("자장")
    var jp = food("짬뽕")
    jj.vote()

    jp.vote()
    jp.vote()

    println("${jj.name} : ${jj.count}")  //1
    println("${jp.name} : ${jp.count}")  //2
    println("총계 : ${food.total}")       //3
}

class food(val name : String){
    var count = 0           //개별 투표수

    companion object{
        var total = 0       //전체 투표수
    }
    fun vote(){
        total++
        count++
    }
}
 */


//17.익명객체와 옵저버 패턴(아직 잘 모르겠다)
/*
옵저버 - 감시자, 이벤트쓸때 필요
      - 많이 쓰임

옵저버 패턴에서 필요한거 - A.이벤트 받는(수신) 클래스, B.이벤트 발생 및 전달 클래스
A,B 통신하는법 - B에서 이벤트가 발생할때 A에서 이벤트를 처리하는 함수를 호출해서 알려주면댐
             - A는 B를 직접 참조할수 있지만 B는 A를 참조할수 없다
             - 그사이에 인터페이스를 끼어넣는다
             - 그 인터페이스를 observer, 코틀린에서는 listener라고 부른다
             - 이벤트를 넘겨주는 행위를 callback이라고함
 */

/*
fun main(){
    EventPrinter().start()  //5-10...100-
}
interface EventListener {                        //밑에 두개 클래스 연결시킴
    fun onEvent(count: Int)        //추상함수
}

class Counter(var listener: EventListener){     //숫자를 카운터해 5의 배수마다 이벤트를 발생시킬거,
                                                // 속성으로 인터페이스를 받음
    fun count(){
        for(i in 1..100){
            if(i % 5 == 0 ){
                listener.onEvent(i) //5의 배수가되면 인터페이스 함수 호출
            }
        }
    }
}
/*
class EventPrinter: EventListener{               //인터페이스를 상속해 구현해야함, 이벤트 수신해서 출력
    override fun onEvent(count: Int) {
        print("${count}-")
    }
    fun start(){
        val counter = Counter(this) //this 키워드로 인터페이스 구현부를 넘겨준다
                                            //this는 EventPrinter 객체 자신을 나타내지만 받는 쪽에서
        counter.count()
    }
}
*/
class EventPrinter{ //인터페이스 상속 안받음, 위에랑 똑같음
    fun start(){
        val counter = Counter(object: EventListener{    //패러미터에 익명객체를 만들어 넘김
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}
*/


//18. 클래스의 다형성
/*
var a: Drink = Cola() //드링크 기능만 사용, 업케스팅
var b: Cola = Cola()  //콜라 기능도 사용가능

업 케스팅(up casting) - 콜라 인스턴스를음료 변수에 담는 행위(상위 자료형인 수퍼클래스로 변환한다)
다운 케스팅(down casting) - 하위 자료형으로 변환

업 케스팅 - var a: Drink = Cola() 처럼 간단하게 됨
다운 케스팅 - as, is필요함

as - 변수를 호환되는 자료형으로 변환 캐스팅연산자
a as Cola a는 cola로 동작함
is - 변수가 자료형에 호환되는지 먼저 체크한후 변환 해주는 캐스팅 연산자(조건문에서 쓰임, 조건문 안에서만 다운됨)
 */
/*
fun main(){
    var a = Drink()
    a.drink()               //음료 을 마십니다.

    var b: Drink = Cola()   //Drink타입의 변수 b를 할당
                            //아 타입할당을 class로 할수 있는건가보다
    b.drink()               //음료 중에 콜라 를 마십니다
                            //그러나 b는 Drink변수입으로 washDishes()함수 실행을 못한다

    if(b is Cola){          //다운 케스팅, b가 콜라와 호환되는지 여부확인 후 다운함
        b.washDishes()      //조건문 안에서만 다운 케스팅됨
    }                       //콜라로 설거지를 합니다

    // b.washDishes() 오류  //is는 조건문 안에서만 다운 케스팅되니까
    var c = b as Cola
    c.washDishes()          //콜라로 설거지를 합니다
    b.washDishes()          //콜라로 설거지를 합니다
}
open class Drink{
    var name = "음료"

    open fun drink(){
        println("$name 을 마십니다.")
    }
}
class Cola: Drink(){
    var type = "콜라"

    override fun drink() {
        println("$name 중에 $type 를 마십니다")
    }
    fun washDishes(){
        println("${type}로 설거지를 합니다")
    }
}
 */

//19. 제너릭
/*
제너릭 - 클래스나 함수에서 사용하는 자료형
캐스팅 연산을 거치면 프로그래밍 속도를 저하시킴 - 그래서 제너릭이라는 개념이나옴

제너릭 - 함수나 클래스를 선언할때 고정적인 자료형 대신, 실제 자료형으로 대체되는 타입 패러미터를 받아 사용하는 방법
fun<Int> a (param: T): T
class A<Int> (var pref: T)
특정한 수퍼 클래스를 상속받은 클래스 타입으로만 제한하려면 - <T: superclass이름> 쓰면됨
 */
/*
fun main(){
    Using(A()).doShout() //A
    Using(B()).doShout() //B
    Using(C()).doShout() //C

    doShouting(B())  //B
}
open class A {
    open fun shout(){
        println("A")
    }
}
class B : A() {
    override fun shout(){
        println("B")
    }
}

class C: A(){
    override fun shout() {
        println("C")
    }
}

class Using<T: A> (val t : T){
    fun doShout(){
        t.shout()
    }
}

fun <T: A> doShouting(t: T){
    t.shout()
}
 */


//20. 리스트
/*
collection - list, set, map
list - 여러데이터를 원하는 순서로 넣어 관리
set - 순서상관없이
map - 키,값으로
Mutable붙이면 - 추가,삭제,변경 가능

MutableList - add(데이터,인덱스)
              remove(데이터)
              removeAt(인덱스)
              shiffle() 무작위섞기
              sort() 정렬
 */
/*
fun main(){
    val a = listOf("가","나","다")
    println(a)      //[가,나,다]

    for(i in a){
        print("$i") //가나다
    }
    println()

    val b = mutableListOf(6,3,1)
    println(b) //[6, 3, 1]

    b.add(4)
    println(b) //[6, 3, 1, 4]

    b.add(2, 8) //[2]에 8추가 나머지는 뒤로밀림
    println(b) //[6, 3, 8, 1, 4]

    b.removeAt(1) //[1]삭제
    println(b)  //[6, 8, 1, 4]

    b.shuffle()
    println(b)

    b.sort()    //오름차순정렬
    println(b)  //[1, 4, 6, 8]

    b.reverse() //뒤집기
    println(b)  //[8, 6, 4, 1]

}
 */

//21. 문자열 다루는법
/*
toLoewrCase() - 싹다 소문자
toUpperCase() - 싹다 대문자
split() - 특정기준으로 문자열 나눠서 배열에 저장
split(".") - .기준으로 문자열 나눠서 배열에 저장
joinToString() - 배열을 하나의 문자열로 합치기
joinToString("-") - 배열에 있는 문자열을 - 넣어서 합치기
substring(시작..끝) - 특정부분 문자열만 쓰기

isNullOrEmpty() - null이거나 empty이면 true 반환
isNullOrBlank() - null이거나 black(공백)이면 true 반환

startsWith("a") - a로시작되면 true
endsWith("a") - a로 끝나면 true
contains("a") - a가 들어있으면 true
 */
/*
fun main(){
    val test1 = "abc.asd.sdasda.asdasd"

    val test2 = test1.split(".")
    println(test2)                           //[abc, asd, sdasda, asdasd]

    println(test2.joinToString())            //abc, asd, sdasda, asdasd
    println(test2.joinToString("--"))//abc--asd--sdasda--asdasd

    println(test1.substring(5..10)) //sd.sda

    val nullSring: String? = null //코틀린에서는 이렇게 해야 null변수가 됨
    val empty = ""
    val black = " "
    val nomal = "A"

    println(nullSring.isNullOrEmpty()) //t
    println(empty.isNullOrEmpty())  //t
    println(black.isNullOrEmpty())  //f  (문자열은 있지만 공백문자도 확인)
    println(nomal.isNullOrEmpty())  //f

    println()

    println(nullSring.isNullOrBlank())  //t
    println(empty.isNullOrBlank())      //t
    println(black.isNullOrBlank())      //t
    println(nomal.isNullOrBlank())      //f
}
 */

//22. null처리와 동일성확인
/*
null상태로 속성이나 함수를 쓰려고하면 오류발생
null을 쓰려면 null체크 없이 코드가 컴파일 되지않음
if(a !=null)~~ 처럼 if문으로 할수있다
그러나 일일이 if문쓰면 귀찮다

null체크하기 위해 if문 대신 쓰면 편한것들
? - 앞에 변수가 null O →null반환, null X → 뒤실행
?: - 앞에 변수가 null O → 뒤실행, null X → 앞실행
!! -  널값이 안들어온다는 보증을 해주는 연산자가 !! 연산자

내용의 동일성 : ==
객체의 동일성 : ===
override fun equals(other: Any?): Boolean
 */


//23. 함수의 arguments다루는 법과 infix함수
/*
코틀린은 오버로딩도 지원함
vararg(패러미터에서 var자리에 vararg 쓰면댐) - 갯수가 지정되지 않은 패러미터
                                         - 다른 패러미터와 같이 쓸때는 맨 마지막에 써야함
                                         - (a: String, b: Int, varage z: Int)

infix함수 - 연산자처럼 쓸 수 있음
infix fun 자료형.이름() =
 */
/*
fun main(){
    a(1)
    a("오오")             //오오
    a("오",3)        //오 3 집
    a("오",3,"dk")//오 3 dk
    //a("크아", ,"쿵따딱") 오류
    a("크아", z = "쿵따딱") //크아 1 쿵따딱

    b(1,2,3,4,5,6,6,12,10) //vararg로 받음, 49출력

    var c = 5 abc 4 //infix함수 호출
    println(c)             //20
    println(6 abc 4)       //24
    println(6.abc(4))//24  위에랑 같음
}
fun a(){

}
fun a(x : Int){
    println("$x")
}
fun a(x : String){
    println("$x")
}
fun a(x: String, y: Int =1, z: String = "집"){
    println("$x $y $z")
}

fun b(vararg num: Int){     //몇개의 패러미터가 들어올지 모름
    var sum = 0
    for(n in num){
        sum += n
    }
    println(sum)
}

infix fun Int.abc(gogo: Int): Int = this * gogo
//class안에서 쓸때는 밑에처럼 표현
//infix fun abc(gogo: Int): Int = this * gogo
*/


//24.중첩클래스, 내부클래스
/*
중첩 클래스 - 하나의 클래스가 다른클래스와 강하게 연관되어 있다는 의미
          - 형태만 내부에 있고 실제 내용을 공유할수는 없음(다른 클래스라는 뜻)
class a{
    class b{

    }
}
사용시 - a.b()로 사용

내부 클래스 - 혼자서는 객체를 만들수는 없고 외부 클래스의 객체가 있어야 생서과 사용이 가능
          - 외부클래스의 속성, 함수 사용가능
class a{
    inner class b{

    }
}

 */
/*
fun main(){
    Outer.Nested().intro() //nested class

    val outer = Outer()
    val a = outer.Ine()

    a.introin()         //inner class
    a.introout()        //inner class
}
class Outer{
    var text = "outer class"
    class Nested{
        fun intro(){
            var text = "nested text"
            println("nested class")
        }
    }

    inner class Ine{
        var text = "inner class"

        fun introin(){
            println(text)
        }
        fun introout(){
            println(this@Outer.text)        //outer text쓰려면
                                            //this@바깥 클래스.변수
        }
    }
}
 */


//25. data, enum class
/*
data class - 데이터를 다루는데 최적화된 class
            -5가지 제공
            -equals() : 내용 동일성판단
            -hashcode() : 객체 내용에서 고유한 코드를 생성
            -toString() : 포함된 속성을 보기쉽게 나타냄
            -copy() : 객체를 복사해 새 객체를 만듬
            -componenetX() : 속성을 순서대로 반환
            -사용자가 직접 호출하기위한 함수가아닌 배열이나 list등에 데이터 클래스에 객체가 담겨있을때 이 내용을 자동을 꺼낼수있는 기능을 지원하는 함수

enum class - 몇개의 상수 값을 가지는 데이터 형식(열거형)
            -이러한 상수 값은 주로 서로 연관된 항목을 그룹화하고 명명하는데 사용
            -객체들은 대문자로 기술
            -객체들은 고유의 속성을 가질수있다
 */
/*
fun main(){
    val a = General("보영",100)

    //3개다 제대로 구현안됨 data class아니니까
    println(a == General("보영", 100)) //equals - false
    println(a)                                  //toString -  General@4fca772d
    println(a.hashCode())                       //hashCode - 1338668845

    val b = Data("루다",200)

    println(b == Data("루다",200))     //true
    println(b.hashCode())                       //46909772
    println(b)                                  //Data(name=루다, id=200)

    println(b.copy())                           //Data(name=루다, id=200)
    println(b.copy("아린"))                //Data(name=아린, id=200)
    println(b.copy(id = 300))                   //Data(name=루다, id=300)

    val l = listOf(Data("보영",100),  //Data클래스 객체들이 담긴 리스트
                    Data("동수",200),
                    Data("진호",300))

    for ((a,b) in l){       //a는 component1이고, b는 component2이다
        println("$a , $b") //보영 , 100
                            //동수 , 200
    }

    var state = State.SING
    println(state)          //SING

    state = State.SLEEP
    println(state.isSleep())//true

    state = State.EAT
    println(state.mes)      //밥먹기

}
class General(val name: String, val id: Int)
data class Data(val name: String, val id: Int)

enum class Color{
    RED,
    BLUE,
    GREEN
}
enum class Color2(val number: Int){
    RED(1),
    BLUE(2),
    GREEN(3);

    fun isRed() = this == Color2.RED //비교할 대상은 자기 자신이므로 this로 해주어야함
                                    //boolean값으로 반환
}

enum class  State(val mes: String){
    SING("노래를 부릅니다"),
    EAT("밥먹기"),
    SLEEP("잠자기");

    fun isSleep() = this == State.SLEEP
}
 */

//26. set, map
/*
set - 순서x정렬
    - 중복x
    - 인덱스사용x
    - contains()로 객체가 포함되나 확인
    - add, remove 사용가능

map - key, value
    - 객체 위치가 아닌 고유한 key를 통해 객체를 참조
    - 같은 key에 다른객체를 넣으면 기존의 객체가 대체됨
    - put(키,값)추가
    - remove(키)삭제
    - print(a[키]) 해서 값 출력가능
    - (key to value, key to value)형태로 저장
*/
/*
fun main(){
    val a = mutableMapOf("레드벨벳" to "아이린",
                            "트와이스" to "쯔위")
    println(a)                            //{레드벨벳=아이린, 트와이스=쯔위}
    for (i in a){
        println("${i.key} : ${i.value}") //레드벨벳 : 아이린
                                         //트와이스 : 쯔위
    }
    a.put("오마이걸","이동수")
    println(a)                          //{레드벨벳=아이린, 트와이스=쯔위, 오마이걸=이동수}

    a.remove("트와이스")
    println(a)                          //{레드벨벳=아이린, 오마이걸=이동수}

    println(a["레드벨벳"])                //아이린
}
 */

//27. 컬렉션 함수 - 람다함수를 사용해 컬렉션을 좀 더 편리하게 쓰는 함수
/*
지금까지 for(i in collection)같이 for문으로 반복해 포함된 아이템을 하나하나 꺼내썼다
컬렉션 함수를 이용하면 좀 더 편하게 쓸 수 있다
일반함수, 람다함수 형태를 사용해 for문없이 아이템을 순회, 조건을걸고 구조의 변경까지 가능하게함

forEach{ print(it) } - 컬렉션안의 모든 함수를 it이라는 변수로 순서대로 참조가능
filter{ it < 4 } - 특정한 조건걸기, 조건에 맞는 컬렉션만 반환해줌
map{ it * 2 } - it에 수식을 적용해 값을 변형해 반환해줌

any{ 조건 } - 하나라도 조건에 맞으면 true
all{ 조건 } - 모두 조건에 맞으면 true
none{ 조건 } - 모두 조건에 맞지 않으면 true

일반함수로쓰는건(), 람다함수식으로{} 이렇게 쓰면 밑처럼 쓰임
first{ it > 3 } - 조건에 맞는 첫번째 아이템 반환
(first는 일반함수()로 쓰면 첫번째 객체반환, 앞에서 배움)
last{ it > 3 } - 조건에 맞는 마지막 아이템 반환
first -> find     대체가능
last -> findLast  대체가능
fisrt, last쓸때 객체가 없으면 에러발생 -> firstOrNull, LastOrNull사용 하면됨(객체 없으면 null반환)

count{ 조건 } - 조건에 맞는 아이템 갯수 반환
(일반함수()로 쓰면 모든 아이템갯수 반환)
 */

//28. 컬렉션 함수(복잡한)
/*
associateBy{} - 객체에서 key를 추출해 map으로 변환하는 함수
a.associateBy{ it.name } // key로 사용할 속성을 넣어주면댐
이동수 to 1998, 소진호 to 1997에서, 심성재 to 1997
(이동수 =(이동수 = 1998)), (소진호 = (소진호 = 1997)), (심성재 =~~)로

groupNy{} - key가 같은 아이템끼리 배열로 묶어 map으로 만드는 함수
a.groupBy{ it.birthday } //
1998 = (이동수 =1998), 1997 = ((소진호 = 1997),(심성재 = 1997))

partition{ 조건 } - 아이템에 조건을 걸어 두개의 컬렉션으로 나누어 줌(true or false로 나눔)
                -first, second로 참조해 사용
val(over2002, under2002) = a.partition{ it.birthaday > 2002 }
over2002, under2002 조건 2개생김

flatMap{} - 아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수
a.flatMap{ listOf(it*3,it+3) } - 처음에 2,3있었으면 6,5,9,6됨

getOrElse(){} - 인덱스 위치에 아이템이 있으면 아이템을 반환하고, 아닌경우 지정한 기본값을 반환하는 함수
a.getOrElse(1){ 50 } - ()안의 인덱스에 객체가 있으면 해당객체반환(1 있으면 [1]반환)
                     - ()안의 인덱스에 객체가 없으면 {}객체 반환(1에 아무것도 없으면 [1] =50 넣음)
a = (1,2,3,4,5)
a.getOrElse(1){50} = 2
a.getOrElse(6){50} = 50

컬렉션 zip 컬렉션 - 컬렉션 두개의 아이템을 1:1로 매칭해 새 컬렉션을 만듬
                - 결과리스트의 아이템 갯수는 더 작은 컬렉션을 따라가게됨
a = listOf(1,2,3,4)
b = listOf(a,b,c,d,e,f)
a zip b
[(1,a),(2,b),(3,c),(4,d)]

 */
/*
fun main(){
    data class Person(val name : String, val birthday: Int) //함수안에 class, data class되네?

    val personList = listOf(Person("유나",1992),
                            Person("조이", 1996),
                            Person("츄", 1999),
                            Person("유나", 2003))

    println(personList.associateBy { it.birthday })
    //{1992=Person(name=유나, birthday=1992), 1996=Person(name=조이, birthday=1996), 1999=Person(name=츄, birthday=1999), 2003=Person(name=유나, birthday=2003)}
    println(personList.groupBy { it.name })
    //{유나=[Person(name=유나, birthday=1992), Person(name=유나, birthday=2003)], 조이=[Person(name=조이, birthday=1996)], 츄=[Person(name=츄, birthday=1999)]}

    val(over1998, under1998) = personList.partition { it.birthday > 1998 }
    println(over1998) //[Person(name=츄, birthday=1999), Person(name=유나, birthday=2003)]
    println(under1998) //[Person(name=유나, birthday=1992), Person(name=조이, birthday=1996)]
}
*/

//29. 변수 고급 기술. 상수, lateinit, lazy
/*
상수 쓰는 이유 - 변수는 런타임시 객체 생성하는데 시간이 더 오래걸림, 성능하락
             - 늘 고정적으로 사용할 값은 상수사용으로 성능 향상함

var - 계속 초기화가능
val - 한번 초기화하면 다음에는 못함
    - 런타임 시에 초기화 되는거임, 런타임에서 한번 값을 할당한 후 변경할 수 없다
    - 할당된 객체를 바꿀수 없을 뿐이지 객체 내부의 속성을 변경할수 없는건 아니다
const val - 컴파일 시점에 결정되어 절대 바꿀수 없는 값
          - 클래스 수준이 아닌 최상위 수준에서 사용
          - 런타임에 값을 할당하거나 변경할 수 없다
          - 런타임에 생성되는 거는 못 담음
          - 기본 자료형만 선언 가능함
          - 사용불가 : 사용자 정의 클래스
                      프로퍼티
                      함수
                      클래스 내 변수(클래스 내에서 쓰려면 companion object 안에서 사용가능)
                      null허용되는 타입
                      제너릭타입

즉 var은 런타임시 초기화되며, 값을 변경할 수 없는 변수를 선언할 때 사용되고,
const는 컴파일 타임에 초기화되는 상수를 정의할 때 사용

늦은 초기화
lateinit var - 초기값 할당 전까지 변수를 사용할 수 없음
             - 기본 자료형에는 사용할 수 없음(String 클래스는 가능)
             - lateinit 변수가 초기화 되었나 확인 할때는 ::a.isInitalized해서 초기화 됐나 확인하고 사용

초기화 지연
lazy - 변수를 사용하는 시점까지 초기화를 자동으로 늦춰줌
     - 변수를 사용할때 초기화 돼서 코드 실행시간을 최적화 할 수 있음
     - 람다함수로 초기화가 진행됨(여러개의 구문이 들어갈 수 있음)
     - 마지막의 결과가 변수에 할당됨(처음 실행시 {}안에 다 실행되고 그 다음부터는 맨마지막 값만 할당되서 쓰임
     - val a : Int by lazy {
        println("초기화됨")
        7           //lazy 값이라는 뜻
    }
    println(a)          //초기화됨 7
    println(a)          //7
 */
/*
fun main(){
    val foodCourt = FoodCourt()
    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    //크림파스타 가격은 13000 입니다
    //피자 가격은 15000 입니다
    //스테이크 가격은 25000 입니다

    lateinit var b : String
    //lateinit var a = "아" 오류뜸 lateinit은 초기화를 하면 안되네

    var lateInitSample = LateInitSample()
    println(lateInitSample.getLateInitTest())   // 기본값
    lateInitSample.text = "쿵따딱"
    println(lateInitSample.getLateInitTest())   // 쿵따닥


    val a : Int by lazy {
        println("초기화됨")
        7           //lazy 값이라는 뜻
    }
    println(a)          //초기화됨 7
    println(a)          //7

}
class FoodCourt{
    fun searchPrice(foodName: String){
        val price = when(foodName){
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }
        println("$foodName 가격은 $price 입니다")
    }

    companion object{
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}

class LateInitSample{
    lateinit var text: String

    fun getLateInitTest(): String {
        if(::text.isInitialized){
            return text
        } else {
            return "기본값"
        }
    }
}
 */

//30. 비트연산
/*
실무에서 비트연산은 거의 사용되지 않고, 정수형의 값을 비트단위로 나누어 데이터를 좀 더 작은단위로 담아 경제성을 높이기 위해 사용
and
or
xor
inv() - 비트반전

shl
shr
 */