package git.snippet;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my.hello")
public class HelloProperties {
    private String name;
    private int age;
    private String hometown;
    @Override
    public String toString() {
        return "HelloProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                '}';
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
