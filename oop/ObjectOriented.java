package oop;

public class ObjectOriented {
    public static void main(String[] args){
    /*
类的声明
    [public] [abstract|final] class <class_name> [extends<class_name>] [implements<interface_name>] {
        // 定义属性部分
        <property_type><property>;
        // 定义方法部分
        function();
    }

    一个java文件可以写多个类，但只有一个是public
    每个 Java 程序的主类都必须是 public 类，作为公共工具供其他类和程序使用的类应定义为 public 类。

    abstract   抽象类，不能被实例化，可以有抽象方法（使用 abstract修饰的方法）和具体方法（不使用abstract修饰的方法）
               继承该抽象类的所有子类都必须实现该抽象类中的所有抽象方法（除非子类也是抽象类）。
    final      如果类被 final 修饰，则不允许被继承。


属性的声明
    [public|protected|private] [static] [final] <type> <variable_name>

    final   表示将该成员变量声明为常量，其值无法更改

    成员变量初始化默认值
        整数型（byte、short、int 和 long）的基本类型变量的默认值为 0
        单精度浮点型（float）的基本类型变量的默认值为 0.0f
        双精度浮点型（double）的基本类型变量的默认值为 0.0d
        字符型（char）的基本类型变量的默认值为 '\u0000'即' '
        布尔型的基本类型变量的默认值为 false
        引用数据类型变量的默认值为 null   如果创建了数组变量的实例，但没有为每个元素赋值，则采用数组数据类型对应的默认值。


方法的声明

    [public|protected|private] [abstract|final] [static] <void|return_type> <method_name>([paramList]) {
        // 方法体
    }
        static：表示限定该成员方法为静态方法。
        final：表示限定该成员方法不能被重写或重载。
        abstract：表示限定该成员方法为抽象方法。抽象方法不提供具体的实现，并且所属类型必须为抽象类。

        paramList   例如 String[] args  int a  或者空值，与return_type无关
        return_type 返回值类型 需与return a;的值类型相同

        方法中形参值的改变不会影响到传参的实参(基本数据类型) 值传递
        引用数据类型 https://www.bilibili.com/video/BV1CJ411m7gg?p=47

        方法中可以调用方法但不能定义方法  比如 main方法
        同一个类中方法可以直接调用 不需要new实例化对象

        类中的方法可以直接访问类中的成员变量 (static方法只能访问类变量)

        方法个数可变形参的传递

            方法的声明(可变形参放在所有形参的最后)
            public return_type methodName(paramType... paramName){
            }
            方法的调用
            methodName();

            例如
            public void getInfo(String x, int... intArray){
                for(int i : intArray){
                    System.out.println(x + i);
                }
            }
            getInfo("这个数字是", 1, 2, 3);
            其实是转化成了数组

方法的重载

    同一个类中允许存在同名方法，只要参数个数和参数类型不同即可(传参顺序不同也可)


类的实例化(创建对象)

    ClassName objectName = new ClassName();
    声明一个CLassName类型的变量，变量名为objectName，并进行初始化，赋值为CLassName的一个实例(new CLassName)

    objectName.attribute = ;    给属性赋值
    objectName.method(param);   调用方法


匿名对象    new CLassName().method();
        只进行一次方法的调用，不对该对象进行赋值等操作
        作为实参 传递给一个方法调用


构造方法    创建对象的原理

    默认方法 隐式无参构造
        CLassName objectName = new ClassName()    调用了一个默认函数 public CLassName(){}
        默认构造方法 对象的权限和类的权限相同(public 缺省)

    显式定义构造方法    自己在CLassName类内写一个构造方法
        CLassName objectName(paramList){

        }



    */
    }
}
