# ES6知识点
## 1. let const作用域
let 声明变量 允许创建块级作用域 代替`ES5`中的`var`
```js
let a = 2
// 大括号内 就是块级作用域
{
    let a = 3
    console.log("第二个a", a)
}
console.log("第一个a", a)
```
const 声明常量 不可被修改
```js
const b = 3
b = 2
```
报错：
```
Syntax Error: "b" is read-only
```
## 2. 字符串
### 拼接字符串

可以直接在${}里面写变量 用反引号`包裹字符串
代替用加号+拼接字符串
```js
let name = "ningyi"
// ES5
let str1 = "hello, my name is " + name + ", welecome!"
// ES6 
let str2 = `hello, my name is ${name}, welcome!`
```
## 3. 箭头函数
```js
function(a,b) {
    return a + b
}
```
`ES6`可以使用箭头函数 代替原来的函数形式
```js
(a,b) => {
    return a + b
}
```
## 4. 数组批量复制
```js
let arr = [1, 2]
let a = arr[0]
let b = arr[1]
```
`ES6`中支持数组的批量复制 a = 1, b = 2
```js
let arr = [1, 2]
let [a, b] = arr 
```
## 5. 模块化
模块功能主要由两个命令构成：`export`和`import`

`export`命令用于规定模块的对外接口

`import`命令用于引用其他模块提供的功能

一个模块就是一个独立的文件 该文件内部的所有变量 外部无法取得 如果你希望外部能够读取模块内部的某个变量 就必须使用`export`关键字往外暴露该变量

`config.js`
```js
// 定义一个 host 常量
const host = "http://localhost:5757"
// 用 export 暴露出 host 常量
export default host
```

如何使用`config.js`中的`host`
```js
// 引用host常量
import host from "@/config.js"

...

//打印 host 常量
console.log("host address:", host)
```
## 6. Promise异步执行
一个`Promise`是一个等待被异步执行的对象

当它执行成功 状态会变成`resoloved` 

执行失败时 状态会变成`rejected`

```js
promiseTest(num) {
    var result = new Premise(function(resolve, reject) {
        if(num > 2) {
            resolve("successed, state change to resolved")
        } else {
            reject("failed, state change to rejected")
        }
    });
    return result
}
```
测试方法
```js
let res = this.promiseTest(3)
console.log(res)
```
## 7. Async await异步等待
`async` 异步关键字 作为一个关键字放到函数的前面 用来表示该函数是一个异步函数

`await` 等待关键字 后面常放一个promise对象 `await` 关键字只可以放在`async`函数里面

```js
setTime() {
    return new Promise(function(resolve, reject){
        setTimeout(function(){
            resolove("this is " + num +  " second Timeout");
        }, 2000);
    });
},
async test() {
    let result = await this.setTime(1)
    console.log(result)
}
```
