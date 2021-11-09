package com.example.springcoredojo.controller;

import com.example.springcoredojo.dto.UnitDTO;
import com.example.springcoredojo.entity.Unit;
import com.example.springcoredojo.service.BarracksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/barracks")
public class BarracksController {

	@Autowired
	private BarracksService barracksService;

	@PostMapping("/byId")
	@ResponseStatus(HttpStatus.CREATED)
	public Unit create(@RequestBody int id) {
		return barracksService.createWithId(id);
	}

	@GetMapping(value = "/{id}")
	public UnitDTO findById(@PathVariable("id") Long id) {
		return barracksService.findById(id);
	}

	@GetMapping("/{id}/{name}")
	@ResponseBody
	public String getEmployeesByIdAndName(@PathVariable String id, @PathVariable String name) {
		return "ID: " + id + ", name: " + name;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UnitDTO create(@RequestBody UnitDTO resource) {
		return barracksService.create(resource);
	}

	@DeleteMapping("/delete")
	public void delete(@PathVariable("id") Long id) {
		barracksService.delete(id);
	}

	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	}

	@GetMapping("/age")
	public ResponseEntity<String> age(@RequestParam("yearOfBirth") int yearOfBirth) {
		if (isInFuture(yearOfBirth)) {
			return new ResponseEntity<>(
					"Year of birth cannot be in the future",
					HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>("Your age is " + calculateAge(yearOfBirth),
				HttpStatus.OK);
	}

	private int calculateAge(int yearOfBirth) {
		LocalDateTime localDateTime = LocalDateTime.now();
		return localDateTime.getYear() - yearOfBirth;
	}

	private boolean isInFuture(int year){
		LocalDateTime localDateTime = LocalDateTime.now();
		return localDateTime.getYear() - year < 0;
	}





}
