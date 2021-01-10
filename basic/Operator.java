package basic;

public class Operator {
    public static void main(String[] args){
        /*

        算术赋值运算符 += -= *= /= %=
            n += 100;  相当于 n = n + 100;
            n -= 100;  相当于 n = n - 100;

        自增 自减   ++n表示先加1再使用n，n++表示先使用n再加1   例： int n = 3;
                                                            int a = 2 + (n++);
                                                            a = 2 + 3 = 5;n = 3 + 1 = 4;

                                                            int n = 3;
                                                            int a = 2 + (++n);
                                                            n = 3 + 1 = 4; a = 2 + (3 + 1) = 6;
        三目运算符   a ? x : y
        public class Absolute{
            public static void main(String[] args){
                int n;
                int x = n >= 0 ? n : -n;  n和-n类型必须相同
                System.out.println(x);

            }
        }


        逻辑运算符           操作和返回的都是boolean型变量

        !a    逻辑非     取反

        a&b   逻辑与     皆对则对
        a&&b  短路与     在&的基础上 如果左边的变量为false 则直接返回false
        a|b   逻辑或     皆错则错
        a||b  短路或     在|的基础上 如果左边的变量为true 则直接返回true
        a^b   逻辑异或   若a != b 则返回true

        */
    }
}
