package com.example.springcoredojo.service;

import com.example.springcoredojo.dto.UnitDTO;
import com.example.springcoredojo.entity.Unit;
import com.example.springcoredojo.repository.BarracksRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BarracksService {

    @Autowired
    private BarracksRepository barracksRepository;

    @Autowired
    private ModelMapper modelMapper;

    public UnitDTO findById(Long id) {
        Unit unit = barracksRepository.findById(id);
        return this.convertUnitDTOtoUnit(unit);
    }

    public UnitDTO convertUnitDTOtoUnit(Unit unit){
        UnitDTO unitDTO = new UnitDTO();
        unitDTO.setName(unit.getName());
        return unitDTO;
    }

    public UnitDTO create(UnitDTO unitDTO) {
        UnitDTO militiaDTO = new UnitDTO();
        militiaDTO.setArmor(1);
        militiaDTO.setAttack(4);
        militiaDTO.setDescription("All-purpose infantry unit. Strong vs. buildings and infantry. Weak vs. archers at long range.");
        militiaDTO.setName("Militia");
        militiaDTO.setRange(0);
        militiaDTO.setHp(450);
        barracksRepository.getList().add(null);
        return militiaDTO;
    }

    public Unit createWithId(int id) {
        Unit unit = new Unit();
        unit.setId(id);
        unit.setName("unidad-"+id);
        barracksRepository.getList().add(unit);
        return unit;
    }

    public void delete(Long id) {
        barracksRepository.delete(id);
    }

    private UnitDTO convertToDto(Unit unit) {
        return modelMapper.map(unit, UnitDTO.class);
    }

    private Unit convertToEntity(UnitDTO unit) {
        return modelMapper.map(unit, Unit.class);
    }

}
