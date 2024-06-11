package com.Stepdefinatuion;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class AdditionOfNumbers {
	int x, y, sum;

	@Given("Add {int} and {int}")
	public void add_and(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@Given("get the sum")
	public void get_the_sum() {
		sum = x + y;
		System.out.println(sum);
	}

	@Given("i have a string {string}")
	public void i_have_a_string(String string) {
		System.out.println(string);

	}

	@Given("i  have a word {word}")
	public void i_have_a_word(String string) {
		System.out.println(string);

	}

	@Given("i have a following list:")
	public void i_have_a_following_list(DataTable table) {
		List<String> list = table.asList();
		System.out.println(list);
		for (String FruitList : list) {
			System.out.println(FruitList);
            
		}

	}

	@Given("i have a following list of fruits  and is Quantity:")
	public void i_have_a_following_list_of_fruits_and_is_quantity(DataTable table) {
		Map<String, String> map = table.asMap();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + "" + val);

		}

	}

}
