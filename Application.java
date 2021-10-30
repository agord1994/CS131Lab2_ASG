public class Application {

	public static void main(String[] args) {
		
		Wizard wiz1=new Wizard();//tests empty argument constructor invoking to String method
		
		System.out.println(wiz1.toString());//tests preffered argument constructor invoking to String method
				
		Wizard wiz2=new Wizard("Gandalf");//creates new wizard object
		
		System.out.println(wiz2.toString());
		
		// setter tests
		
		wiz2.setName("Dumbledore");//replaces Gandalf with Dumbledore
		wiz2.setHealth(100);//replaces 0 health with 100
		wiz2.setKey(2);//replaces 0 with 2
		wiz2.isLocked();//switches is Locked to true
		
		System.out.println(wiz2.toString());
		
		
		wiz2.takeDamage(27);//wizard is not locked thus Dumbledore should take 27 damage health of 73
		
		System.out.println(wiz2.toString());
		
		wiz2.lock(2);//locking the wizard 
		System.out.println(wiz2.toString());//wizard is now locked and damage should not be taken
		
		wiz2.takeDamage(45);
		System.out.println(wiz2.toString());//no damage taken to Dumbledore
		
		wiz2.unlock(2);//unlocking the wizard
		
		//getter test
		if(wiz2.isLocked()== true) {
		System.out.println("The Wizard "+wiz2.getName()+" has "+wiz2.getHealth()+" health, a key of "+wiz2.getKey()+" this wizard is locked and cannot receive damage.");
		}
		else{
		System.out.println("The Wizard "+wiz2.getName()+" has "+wiz2.getHealth()+" health, a key of "+wiz2.getKey()+" this wizard is unlocked and can receive damage.");	
		}
	}
	
}