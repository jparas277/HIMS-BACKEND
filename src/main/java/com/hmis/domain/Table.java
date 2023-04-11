package com.hmis.domain;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Table {

	private String tableName;
	private ArrayList<String> columnName;
	private ArrayList<String> columnData;
	public Table(String tableName, ArrayList<String> columnName, ArrayList<String> columnData) {
		super();
		this.tableName = tableName;
		this.columnName = columnName;
		this.columnData = columnData;
	}
	@Override
	public String toString() {
		return "Table [tableName=" + tableName + ", columnName=" + columnName + ", columnData=" + columnData + "]";
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public ArrayList<String> getColumnName() {
		return columnName;
	}
	public void setColumnName(ArrayList<String> columnName) {
		this.columnName = columnName;
	}
	public ArrayList<String> getColumnData() {
		return columnData;
	}
	public void setColumnData(ArrayList<String> columnData) {
		this.columnData = columnData;
	}
	
}
