/*
 * Test expressions with ( <exp> ) in them
 */

class a {

    public void main() {
        int b = 2;

        //Doesn't compile
        //int c = (int) -2;

        ;

        int c = (int) (-2);

        int d = (b + c) * 3;

        d = d + (d + d);
    }

}
