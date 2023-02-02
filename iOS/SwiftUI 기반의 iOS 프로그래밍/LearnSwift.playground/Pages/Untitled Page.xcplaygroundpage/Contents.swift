import UIKit

var greeting = "Hello, playground"

print("Welcome to Swift")

var x = 10

for index in 1...20 {
    let y = index * x
    x -= 1
    print(y)
}

print("Int32 Min = \(Int32.min) Int32 Max = \(Int32.max)")

//: 이것은 한 줄 문서 텍스트다
/*:
이것은 여러 줄로 구성된
 문서 텍스트 블록이다.
 */

/*:
 # Welcome to Playgrounds
 This is your *first* playground which is inented to demonstrate:
 * The use of **Quick Look**
 * Placing results **in-line** with the code
 */

//var userCount = 10
let maxUserCount = 20

var userCount: Int
userCount = 10
print(userCount)

var signalStrengh = 2.231
let companyName = "My Company"

let bookTitle: String

if userCount == 10 {
    bookTitle = "SwiftUI Essentials"
} else {
    bookTitle = "Android Studio Development Essentials"
}

print(bookTitle)

let myTuple = (10, 432.432, "This is a String")
let myString  = myTuple.2
print(myString)

var index: Int?
index = 3
var treeArray = ["Oak", "Pine", "Yew", "Birch"]
if index != nil {
    print(treeArray[index!])
} else {
    print("index doew not contain a value")
}
