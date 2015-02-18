/*
 * This file tests expression.
 *  a) do they all work
 *  b) precedence levels
 */

class a {

    public void main() {

        int a = b[2].test();
        int a = b.test()[2];

        int a = !true && false || true == 3 > 1 + 3 - 2 * 3 / 5 % + - b.test()[2] + b.test2;
        int a = b.test2 + - + b[2].test() % 5 / 3 * 2 - 3 + 1 > 3 == !true || false && true;

        int a = !true && false || true == 3 > 1 + 3 - 2 * 3 / 5 % + - b;
        int a = - + b % 5 / 3 * 2 - 3 + 1 > 3 == !true || false && true;

        int a = !true && false || true == 3 > 1;
        int a = 3 + 2 - 1;

        int c = 'a';

        int a = 3.test();

        String a = new String();

        int[][] a = new int[3][];
        a[0] = new int[3];

        a = a instanceof test;

        int a = System.out.println();
        System.out.println();
        System.out.println("Hello");

        abc.foo().def.ghi(1,2,3).x[4] = 0;

        // exp().methodCall.methodCall
        (z[12].baz).myMethod(3).print();

        Object s = null;

        ++i;


    }

}
