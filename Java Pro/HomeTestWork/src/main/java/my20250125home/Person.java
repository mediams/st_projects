package my20250125home;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@JsonSerializable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @JsonElement (value = "Eugen")
    private  String name;
    @JsonElement
    private  int age;

    {
        name = "Igor";
    }

    public void print() {
        System.out.println(this.name + " " + this.age);
    }

    public void sayHello() {
        System.out.printf("Привет, меня зовут %s", this.name);
    }

    public static void test(){
        System.out.println("Test");
    }
}
