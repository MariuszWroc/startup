package com.atos.startup.controller.website.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atos.startup.dto.PlayerDTO;
import com.atos.startup.model.Player;
import com.atos.startup.service.IGenericServiceImpl;

@RestController
public class PlayerRestController {

	@Autowired
	private IGenericServiceImpl GenericService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<PlayerDTO> getPlayer() {
		List<PlayerDTO> players = GenericService.findAll();
		return players;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public void addPlayer(@RequestBody PlayerDTO playerDTO) {

		GenericService.add(playerDTO);
	}

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public void updatePlayer(@PathVariable("id") long id, @RequestBody PlayerDTO playerDTO) {

		Object newPlayer = GenericService.findById(id);
		((PlayerDTO) newPlayer).setName(playerDTO.getName());
		((PlayerDTO) newPlayer).setColour(playerDTO.getColour());
		((PlayerDTO) newPlayer).setMoney(playerDTO.getMoney());

		GenericService.update(newPlayer);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePlayer(@PathVariable("id") long id) {
		GenericService.delete(id);
	}

}
