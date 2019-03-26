package jdk8.Demo;

@FunctionalInterface
public interface MyPredicate<T> {

	public boolean test(T t);
	
}
