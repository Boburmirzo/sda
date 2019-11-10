package com.sda.tasks;

import com.sda.tasks.common.FileIO;
import com.sda.tasks.common.ResourceReader;
import com.sda.tasks.domain.PersonInfo;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		ResourceReader resourceReader = new ResourceReader();
		FileIO fileIO = new FileIO();
		List<PersonInfo> personInfos = fileIO.readFile(resourceReader.getInput());
		System.out.println("List of people in the file: ");
		System.out.println(personInfos);

		Object object;
	}
}
