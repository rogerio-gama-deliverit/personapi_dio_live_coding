package one.digitalinnovation.personapi.mapper;


import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    @Mapping(target = "lastName", source = "lastName")
    Person toModel(PersonDTO personDTO);
    //toModel precisa obrigatoriamente ter esse nome para ser corretamente executado e converter um objeto DTO para objeto de banco de dados

    PersonDTO toDTO(Person person);
}
