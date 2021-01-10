package oop;

public class InheritanceAndPolymorphism {
    public static void main(String[] args){
        /*
子类  用的关键字是extends，表示子类不是父类的子集 而是父类的扩展
子类是一种特殊的父类

    public class SubClassName extends CLassName{}
    子类会继承父类中所有的属性和方法，除了private和不在同一个包的(缺省)

    java子类不同于cpp 只能单继承


方法的重载overload

    同一个类中允许存在同名方法，只要参数个数和参数类型不同即可(传参顺序不同也可)

方法的重写override    子类重写父类的方法

    只能重新编写方法体，static parmaList 和 return_type 需要相同
    不能使用比父类更严格的访问权限
    抛出异常不能大于父类方法的抛出异常


对象的多态性
    引用变量有两个类型：编译时类型和运行时类型
    若编译时类型和运行时类型不同 则出现多态

    Person p = new Student();
    父类类型的变量引用子类类型的变量    向上转型upcasting



instanceof
    x instanceof A  判断x是否为A或A子类的对象    返回值为Boolean


Object类
    Object类是所有类的根父类 如果类的声明没有extends 则默认extends Object
    未完

        */
    }
}
