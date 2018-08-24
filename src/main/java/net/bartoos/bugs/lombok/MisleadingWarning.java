package net.bartoos.bugs.lombok;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MisleadingWarning {
    private final String foo;

    public static void main(String[] args) {
        MisleadingWarning main = new MisleadingWarning("bar");
        main.showFoo();
    }

    private void showFoo() {
        System.out.printf("Foo is: '%s'", foo);
    }
}
