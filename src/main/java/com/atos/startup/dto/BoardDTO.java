package com.atos.startup.dto;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoardDTO extends JFrame{
	
	
	private JButton redField;
	private JButton greenField;
	private JButton yellowField;
	private JButton prison;
	private JButton parking;
	private JButton tax;
	private JButton chance;
	private JButton blueField;
	private JButton startField;
	private JButton greyField;
	private JButton lightBlueField;
	private JButton violetField;
	private JButton fieldWithTriangle;
	private JButton fieldWithCircle;
	
	public BoardDTO() {
		super("Monopoly");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(100,300);
		setLocation(50,50);
		setLayout(new GridLayout(11,11));
		
		
		redField = new JButton("red field");
		greenField = new JButton("red field");
//		private JButton yellowField;
//		private JButton prison;
//		private JButton parking;
//		private JButton tax;
//		private JButton chance;
//		private JButton blueField;
//		private JButton startField;
//		private JButton greyField;
//		private JButton lightBlueField;
//		private JButton violetField;
//		private JButton fieldWithTriangle;
//		private JButton fieldWithCircle;
		
		
		add(new JButton("parking"));
		add(new JButton("red field"));
		add(new JButton("chance"));
		add(new JButton("red field"));
		add(new JButton("red field"));
		add(new JButton("field with circle"));
		add(new JButton("yellow field"));
		add(new JButton("yellow field"));
		add(new JButton("field with triangle"));
		add(new JButton("yellow field"));
		add(new JButton("prison"));
		
		add(new JButton("orange field"));
		for(int i = 1; i < 10; i++ ) {
			add(new JButton("free space"));
		
		}
		add(new JButton("green field"));
		
		add(new JButton("orange field"));
		for(int i = 1; i < 10; i++ ) {
			add(new JButton("free space"));
			
		}
		add(new JButton("green field"));
		
		add(new JButton("chance"));
		for(int i = 1; i < 10; i++ ) {
			add(new JButton("free space"));
		}
		add(new JButton("chance"));
		
		add(new JButton("orange field"));
		for(int i = 1; i < 10; i++ ) {
			add(new JButton("free space"));
		}
		add(new JButton("green field"));
		
		add(new JButton("field with circle"));
		for(int i = 1; i < 10; i++ ) {
			add(new JButton("free space"));
		}
		add(new JButton("field with circle"));
		
		add(new JButton("violet field"));
		for(int i = 1; i < 10; i++ ) {
			add(new JButton("free space"));
		}
		add(new JButton("chance"));
		
		add(new JButton("violet field"));
		for(int i = 1; i < 10; i++ ) {
			add(new JButton("free space"));
		}
		add(new JButton("blue field"));
		
		add(new JButton("field with triangle"));
		for(int i = 1; i < 10; i++ ) {
			add(new JButton("free space"));
		}
		add(new JButton("tax"));
		
		add(new JButton("violet field"));
		for(int i = 1; i < 10; i++ ) {
			add(new JButton("free space"));
		}
		add(new JButton("blue field"));
		
		add(new JButton("prison"));
		add(new JButton("lightblue field"));
		add(new JButton("lightblue field"));
		add(new JButton("chance"));
		add(new JButton("lightblue field"));
		add(new JButton("field with circle"));
		add(new JButton("tax"));
		add(new JButton("grey field"));
		add(new JButton("chance"));
		add(new JButton("grey field"));
		add(new JButton("start"));
	
		
		setVisible(true);
	}
	

}
