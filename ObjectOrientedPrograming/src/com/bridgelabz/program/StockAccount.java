package com.bridgelabz.program;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockAccount {
	static String fileName;
	static double valueOf;
	static Scanner sc = new Scanner(System.in);
	
	public StockAccount(String fileName, double valueOf) throws FileNotFoundException, IOException, ParseException {
		this.fileName = fileName;
		this.valueOf = valueOf;
		JSONObject company = getCompany(fileName);
		if(company != null) 
			System.out.println("Company already exist");
		else {
			createStockAccont();
		}
	}
}
	