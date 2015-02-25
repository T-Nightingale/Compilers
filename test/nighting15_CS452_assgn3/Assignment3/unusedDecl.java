/** this is for an enhancement **/
//can't have unused local variables, parameters, or classes
//unused instanceVariables are totally okay.

class Main extends usedClass{

    int unusedInstVar;
    int usedInstVar;

    public void main() {

        this.usedInstVar = 0;
        usedInstVar = 1;


        usedClass uc = new usedClass();
        uc.a = 4;

        int unusedLocalVar = 0;
    }

    public void unusedMethod() {



    }

}

class unusedClass {

}

class usedClass {

    int a;


}