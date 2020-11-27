package ua.profitsoft.task_5.subtask_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.gson.*;

public class JSONParser {
	public static void EmployeeToJSON(Programmer p) {
		try (Writer writer = new FileWriter("Output.json")) {
		    Gson gson = new GsonBuilder().create();
		    gson.toJson(p, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Programmer p1 = new Programmer("Tom", "Jackson");
		p1.setWorkedHours(147.);
		p1.setSalaryRate(1520.);
		EmployeeToJSON(p1);
	}
}
