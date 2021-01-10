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



属性的声明
    [public|protected|private] [static] [final] <type> <variable_name>


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

        paramList   例如 String[] args  int a  或者空值，与return_type无关
        return_type 返回值类型 需与return a;的值类型相同

        方法中形参值的改变不会影响到传参的实参(基本数据类型) 值传递
        对于形参为引用数据类型 https://www.bilibili.com/video/BV1CJ411m7gg?p=47

        方法中可以调用方法但不能定义方法  比如 main方法
        同一个类中方法可以直接调用 不需要new实例化对象

        同一个类中的方法可以直接访问类中的成员变量 (static方法只能访问类变量)

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




类的实例化(创建对象)

    ClassName objectName = new ClassName();
    声明一个CLassName类型的变量，变量名为objectName，并进行初始化，赋值为CLassName的一个实例(new CLassName)

    objectName.attribute = ;    给属性赋值
    objectName.method(param);   调用方法


匿名对象    new CLassName().method();
        只进行一次方法的调用，不对该对象进行赋值等操作
        作为实参 传递给一个方法调用


构造方法    创建对象的原理 new对象实际是调用类的构造方法

    默认方法 隐式无参构造
        CLassName objectName = new ClassName()    调用了一个默认函数 public CLassName(){}
        默认构造方法 对象的权限和类的权限相同(public 缺省)

    显式定义构造方法    自己在CLassName类内写一个构造方法 用于给类的属性初始化
        public CLassName (paramList){
            //方法体
        }


    子类会默认调用父类的无参构造方法
    如果父类中没有无参的构造器 必须显式构造一个构造器 并放在第一行

    同样可以重载

this 关键字        用于指代当前类的对象的成员变量或者方法，没有则从父类中查找
    this.attribute    this.method
    this(param);调用构造器   放在首行    至少要有一个构造器不含this()


super 关键字        用于指代父类中的成员变量或者方法
    super不仅限于调用直接父类 可以调用所有父类层级
    super();调用父类构造器    放在首行

static 关键字 用于属性和方法
        实例变量         不用static修饰  在类实例化成对象后才可以使用
        类(静态)变量     使用static修饰  直接(只能)通过CLassName.staticAttribute就可以调用

        类变量比如static String name;相当于类的固有属性 被该类的所有实例化对象所公有
        公有!
        静态方法也是一样的 可以直接(只能)通过ClassName.staticMethod调用

        由于不需要实例就可以访问static方法 因此static方法内部不能有this和super


final 关键字
    final表示最终
    被final修饰的类不能被继承
    被final修饰的属性不能被修改 即常量
    被final修饰的方法不能被子类重写 可以重载


abstract 抽象类

    含有抽象方法的类必须被声明为抽象类 可以含有非抽象类
    抽象类不能被实例化 是用来被继承的
    抽象类的子类必须重写抽象类的所有方法并提供方法体 否则仍为抽象类

    声明抽象方法 abstract return_type methodName(paramList);  不包含{}和方法体

    abstract不能用于属性 私有方法 静态方法 final方法 构造方法


JavaBean  属性私有 有set和get方法 默认构造器的一种类


代码块(初始化块)       类中用{}括起来的一段代码
    用于对java对象进行初始化

    非静态代码块  {
                    //这里可以调用静态和非静态代码块
                }
    静态代码块   static{
                    //这里只能使用静态的属性和方法
               }
    每次new对象 非静态代码块都会被执行 但静态代码块只会被执行第一次

    程序执行顺序: 成员变量(属性)的初始化  多个静态代码块被依次执行  多个非静态代码块被依次执行  构造器被执行


    */
    }
}
