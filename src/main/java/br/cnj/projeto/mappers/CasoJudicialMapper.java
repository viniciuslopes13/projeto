package br.cnj.projeto.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.cnj.projeto.DTO.CasoJudicialDTO;
import br.cnj.projeto.models.CasoJudicial;

@Mapper
public interface CasoJudicialMapper {

    CasoJudicialMapper INSTANCE = Mappers.getMapper(CasoJudicialMapper.class);

    @Mapping(source = "numero", target = "numero")
    @Mapping(source = "decisao", target = "decisao")
    @Mapping(source = "descricao", target = "descricao")
    CasoJudicialDTO casoJudicialToDTO(CasoJudicial casoJudicial);

    @Mapping(source = "numero", target = "numero")
    @Mapping(source = "decisao", target = "decisao")
    @Mapping(source = "descricao", target = "descricao")
    CasoJudicial dtoToCasoJudicial(CasoJudicialDTO casoJudicialDTO);

}
