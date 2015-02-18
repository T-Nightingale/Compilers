/**
 * Test08.java
 *
 * For testing switch / do-while
 */

class Main {
    public void main() {

        do {
            i = j - i;
        } while (i < 100);


        switch (n) {

        }

        switch(n) {
            case 0:
            case 1: x++; break;
            case 2: System.out.println("Hello");
            case 3: y++; break;
            default: break;
            case 100: x = 0; break;
            case 4:
                switch (x) {

                }
        }
        switch(true) {
            case "balls":
                break; break;
            case false:
                y++;
                y--;
            case 1: System.out.println("Hello");
        }

        switch (n) {
            case 1:
                s = "one";
                break;
            case 2:
                s = "two";
                break;
            default:
                s = "NaN";
        }

    }

}

