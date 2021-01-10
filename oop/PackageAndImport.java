package oop;

public class PackageAndImport {
    public static void main(String[] args){
        /*
        包相当于文件夹的概念，可以有多级包的嵌套
        包的命名一般为全小写，用”.“命名分割多级包
        不同包之间文件可以重名

        import写在package下    用于引入其他包中的类
        import package.subpackage.Class;
        import package.subpackage.*;        引入全部的Class
        同一个包下的类 import可以省略


    封装和隐藏

        对不能让调用者随意使用的属性进行封装和隐藏
        声明变量的时候权限改为private
        再声明public的 get和set方法 用于进行对属性的操作


    访问权限修饰符

        类的成员有四种访问权限

            private             只能在该类内部使用
            (缺省)               可以在同一个包中使用，但不能用于子类
            protected           可以在同一个包和子类中使用
            public              全部

        类只有两种访问权限

            public              全部
            (缺省)               只能被同一个包中的类访问


        */
    }
}
