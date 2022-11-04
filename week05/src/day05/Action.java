package day05;

/*
 * What is a functional interface?
 * 
 * 
 * Definition -- an interface that only has ONE method
 * 
 * Used for -- to use a lambda, I need a functional interface type declared
 * 
 * Best Practice - annotate the interface with @FunctionalInterface -- this is like our @Override
 */
@FunctionalInterface
public interface Action {

	// method
	int act(int num);
}
