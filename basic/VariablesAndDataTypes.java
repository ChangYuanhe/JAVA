package basic;

public class VariablesAndDataTypes {
    public static void main(String[] args){
        /*
        命名规范  以 字母 _ $(美元符号)开头,
        后接字母 _ $ 数字
        不能使用关键字命名  可以使用中文
        一般采用驼峰命名法
        类名以大写字母开头, 与文件名相同
        方法名以小写字母开头

        基本数据类型(八种)     整型      byte一个字节   short两个字节   int四个字节    long八个字节
                            浮点数    float四个字节  double八个字节
                            布尔类型   boolean四个字节
                            字符型    char两个字节


        引用类型    除基本数据类型之外全部为引用类型
                  引用类型的变量类似于C语言的指针，它内部存储一个“地址”，指向某个对象在内存的位置
                  String (注意大写)    数组     class


        标识符 identifier 即变量名

        常量  定义变量时加上final修饰符，这个变量就变成了常量  常量名通常全部大写  不可以重新赋值
                    final int PI = 3.14;

        尾缀     大小写皆可
                float a = 3.14e-32f
                long i = 20L
                浮点数默认类型为double  整数默认类型为int 故double 和 ing 可以不添加尾缀

        int age = 12;
        boolean isAdult = age >18;

    注意 char类型使用单引号'，且仅有一个字符，要和双引号"的字符串类型区分开。

    变量的分类
        成员变量    有默认初始化值
            实例变量        不用static修饰  在类实例化成对象后才可以使用
            类(静态)变量     使用static修饰  直接通过CLassName.attribute就可以调用

        局部变量    没有默认初始化值，必须显性初始化（形参除外） 不需要指定权限修饰符(public private)
            形参            方法中paramList的变量
            方法局部变量      定义在方法中的变量
            代码块局部变量    定义在大括号之间的变量

    变量作用域
        静态变量 static


    类型自动提升与强制转型
        自动转型     如果参与运算的两个数类型不一致，那么计算结果为较大类型的整型(自动转型只能由低升高)
            数值型数据的转换：byte → short → int → long → float → double
            字符型转换为整型：char → int    表示对应的unicode码

            short s = 1234;
            int i = 123456;
            int x = s + i; // s自动转型为int
            short y = s + i; // 编译错误!

        强制转型
            int i = 12345;
            short s = (short) i; // 12345
            强制转型优先级高于四则运算   (int) a * b 和 (int)(a * b) 不同
            浮点数向整数强制转型  采用逻辑是丢掉小数部分(向下取整)




     转义字符     \" 表示字符"
                \' 表示字符'
                \\ 表示字符\
                \n 表示换行符
                \r 表示回车符
                \t 表示Tab
                \b 表示退格
                \u#### 表示一个Unicode编码的字符  \u4e2d '中'

    判断变量相等

            对于值类型, 直接运用  ==

            对于引用类型 ==会用于判断“引用是否相等”, 即是否指向同一对象
            要判断内容是否相等, 需要使用equals()
            String s1 = "hello";
            String s2 = "HELLO".toLowerCase();
            boolean X = s1 == s2;        //结果是false
            boolean Y = s1 equals(s2);   //结果是true

            对于浮点数, 由于浮点数转化成二进制很多时候是不精确的, 因而浮点数运算常常产生误差, 导致两个值相同的浮点数有时会是！=
            正确做法是判断差的绝对值是否小于一个很小的数

            double r = Math.abs(x - y);
            if (r < 0.000001){

            }

        */
    }
}
