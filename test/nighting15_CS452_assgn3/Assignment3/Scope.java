/** This should pass **/
class Main {

	public void main() {

		{
			int a = 0;
			int b = 1;
			{
				int c = 0;
				super.printInt(c);
				super.printInt(b);
			}
			super.printStr("Hi!");
			{
				int c = 12;
				super.printInt(a);
				super.printInt(c);
			}
		}
	
	}

}

