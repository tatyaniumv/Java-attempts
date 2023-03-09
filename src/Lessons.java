import java.net.SocketOption;
import java.util.Arrays;
import static java.lang.System.arraycopy;
import static java.lang.System.out;

public class Lessons {
         public static void main(String[] args) {
            Lessons lessons = new Lessons(); //экземпляр класса внешнего
            Lessons.MyClass myClass1 = lessons.new MyClass(); //экземпляр класс внутреннего
            var myClass2 = lessons.new MyClass(); //экземпляр класса внутреннго
            myClass2.age = 5;
            myClass1.age = 5;
            int agism = 45;
            MyClass.Say("");
            //out.println(myClass1.equals(myClass2));
            Lessons.MyClass[] classes = {myClass1, myClass2};
            boolean r = myClass1.equalsInt(5, 6);

            //out.println(classes[0].getClass().getCanonicalName());
            for (int i = 0; i < classes.length; i++)
                out.println(classes[i].equalsInt(i,0));
        }
        class MyClass {
            private int age = 0; //поле типа инт с модификатором доступа паблик со значением 0
            public boolean equals (MyClass myClass) { //метод класс Обджект возвращает буевое значение, переодпредели
                return this.age == myClass.age;
            }
            public boolean equalsInt(int a, int b){
                return (a>b)?true:false;
            }

            static void Say(String s) { out.println(s);}
        }
    }

