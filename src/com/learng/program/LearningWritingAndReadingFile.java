package com.learng.program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class LearningWritingAndReadingFile {

	public static void main(String[] args) throws IOException {
		/*File file = new File("temp.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello");
		bw.newLine();
		bw.write("Hello World");
		bw.flush();*/
		File file = new File("temp.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello");
		bw.newLine();
		bw.write("Hello World");
		bw.flush();
		//Reading File
		/*FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr) ;
		System.out.println(br.readLine());
		System.out.println(br.readLine());*/
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
	}

}
