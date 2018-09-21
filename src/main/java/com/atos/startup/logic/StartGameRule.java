package com.atos.startup.logic;

import java.util.Collections;
import java.util.List;

import com.atos.startup.model.Player;

public class StartGameRule implements GameRule<List<Player>, List<Player>>{

	@Override
	public List<Player> useRule(List<Player> list) {
		Collections.shuffle(list);
		
		return list;
	}

}
