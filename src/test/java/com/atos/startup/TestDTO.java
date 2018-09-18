package com.atos.startup;

import java.awt.EventQueue;

import com.atos.startup.dto.BoardDTO;

public class TestDTO {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new BoardDTO();
			}
		});
		
	}
}


