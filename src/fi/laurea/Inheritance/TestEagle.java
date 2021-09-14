package fi.laurea.Inheritance;

public class TestEagle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle myEagle = new Eagle();

		System.out.println("Name: " + myEagle.name);
		System.out.println("Reproduction: " + myEagle.reproduction);
		System.out.println("Outer covering: " + myEagle.outerCovering);
		System.out.println("Lifespan: " + myEagle.lifespan); 		
		myEagle.flyUp();
		myEagle.flyDown(); 	
	}
}
