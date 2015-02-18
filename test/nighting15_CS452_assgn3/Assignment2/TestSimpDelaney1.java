class Main { 
    /* this is a comment 		   jjh   		hhh   */
    /*/ this is another comment */
    /*   /* this is another comment */
    
    int instanceV1;
    Animal a2;
    public void main() {
        int b = 3;
        int n = 3+4*5/6-4;
        boolean nn = (Object)(String)(Object)z;
        int k = - - - -n;
        int unaryPlus = +1000;


        a = b instanceof c;
    }

    public void twoParameters(int p1, int p2)
    {
        int p3 = p1 + p2;
    }

    public int addAnimalsTogether(int p1, int p2)
    {
        int cats = p1 + 10;
        int dogs = -17;
        cats++;
        ++dogs;
        --cats;
        dogs--;
        if (cats > dogs)
        {
            cats = cats - 1;
            if (dogs > 0)
            {
                dogs = dogs - 1;
            }
        }
        return cats + dogs;
    }
    public void typeVsID(int a)
    {
        int value = (0);
        value = value + value;
        callThisMethod(one, two, three);
        methodWithParams(one, two, three);
        nestedFunctionCalls(f(x));
        parensInF(x*(x+4));
        value.member = 4 + (9 % 3);
        value.callFunc(f(f(x)));
        value = (value + value) + value;
        boolean bool = true && (false || true);
        while(bool)
        {
           value = (int)(value + value * value);
           bool = null;
        }
    }
}



class Cat extends Animal
{
    public Animal createNewSecond(something p1, Cat p2)
    {
        return p2;
    }

    public void danglingElse()
    {
        int x = -1;
        if (1 == 1)
            if (2 == 3)
                x = 0;
            else
                x=4;

    }
    public void forLoopTest()
    {
        for(int i = 0; i < 10; i++)
        {
            int theForLoopWorks = 9001;
            int wooHoo = 10; 
        }
    }
    public void thisAsIdentifierTest()
    {
        this.something = this + (this < 1400);
    }
    public String stringLiteralTest()
    {
        return "Hello, world!";
    }
    public boolean notTest()
    {
        return !!!!!true;
    }
    public boolean superTest()
    {
        super.test();
        ;
        ;
        ;;;;
        // super cannot be used as an expression
        //return super.test;
        return true;

    }
    
    public void testNew()
    {
        Cat k = new Cat();
        // not supposed to have arguments
        //Cat l = new Cat(dog, bob, elrond, gandalf);
    }
    public void testBreak()
    {
        int k = 0;
        for(int i = 0; i < 1400; i++)
        {
            k = i;
            if (k > 500)
            {
                break;
            }
        }
    }
    public void complexArrayType()
    {
        x = new int[foo + bar][][][][][];
    }
    
    public void testSwitch()
    {
        int x = 0;
        switch(x) {
        case 3: case 4: y++; break;
        case 2: z++; break;
        default: i++; break;
        case 0: break;
        case "hello": break;
        }
    }
    
    public void testDoWhile()
    {
        int x = 0;
        do {
            x++;
        } while (x < 20);
    }
}