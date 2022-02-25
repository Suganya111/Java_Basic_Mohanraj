package com.aaludra.directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryRun {

	public static void main(String[] args) throws IOException {
		
		// Directory
		// Files.list(path).forEach(System.out::println); 
		/*Path path = Paths.get(".");*/
		
		// Filter Files and Folders 
		/*Files.walk(path, 9).forEach(System.out::println);*/
		
		// Search
		/*Path pathDirectory = Paths.get(".");
		Predicate<? super Path> predicate = path ->String.valueOf(path).contains("collections");
		Files.walk(pathDirectory, 9).filter(predicate)
		.forEach(System.out::println);*/
		
		//data.txt
	/*	Path pathDirectory = Paths.get("./resources./data.txt");
		Files.lines(pathDirectory).forEach(System.out::println);*/ 
	
		// To print only paths --> Files
		Path pathDirectory = Paths.get(".");
		BiPredicate<Path, BasicFileAttributes> matcher = (paths,attributes) ->String.valueOf(paths).contains("collections");
		Files.find(pathDirectory, 4, matcher ).forEach(System.out::println);
		
		// Attributes --> Directory 
	/*	Predicate<? super Path> predicate = path ->String.valueOf(path).contains("collections");
		Path pathDirectory = Paths.get(".");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (paths,attributes) -> attributes.isDirectory();
		Files.find(pathDirectory, 3, directoryMatcher ).forEach(System.out::println);*/
		
		

	}

}
