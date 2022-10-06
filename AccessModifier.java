package Test;

public class AccessModifier {
	public static void main(String[] args) {
		testAccessModifier main=new testAccessModifier();
		
		//public access modifier 
		main.publicModifier("public modifier", "accessible from anywhere");
		System.out.println(main.name+" "+main.description);
		
		/*protected access modifier (can only access within the package 
		 * and out side the package through inheritance only
		 */
		main.protectedMod("protected modifier","accessible only in the package");
		System.out.println(main.name+" "+main.description);
		
		/*can not access private variable and 
		 * method here can access by getter and setter*/
		
		//default access modifier can accessible within the package
		main.defaultMod("default modifier", "can access within package");
		System.out.println(main.name+" "+main.description);
	}
}

class testAccessModifier{
		public String name;
		public String description;
		
		//public access modifier accessible from anywhere
		public void publicModifier(String name,String description) {
			this.name=name;
			this.description=description;
				
		}
		
		//private access modifier not accessible out of the class only inside the class is accessible 
		private void privateMod(String name,String description) {
			this.name=name;
			this.description=description;
		}
		
		//protected access modifier accessible within the package and out side the package through inheritance
		protected void protectedMod(String name,String description) {
			this.name=name;
			this.description=description;
			
		}
		
		//default access modifier accessible within package only
		void defaultMod(String name,String description) {
			this.name=name;
			this.description=description;
		}
}
