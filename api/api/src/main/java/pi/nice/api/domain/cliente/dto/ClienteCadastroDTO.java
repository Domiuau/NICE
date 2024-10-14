package pi.nice.api.domain.cliente.dto;

import pi.nice.api.domain.endereco.dto.EnderecoDTO;
import pi.nice.api.domain.genero.Genere;
import pi.nice.api.domain.grupo.Grupo;

import java.util.Date;
import java.util.List;

public record ClienteCadastroDTO(
        String nome,
        String cpf,
        String email,
        String senha,
        Grupo grupoId,
        Date dataDeNascimento,
        Genere genere,
        EnderecoDTO enderecoDeFaturamento,
        List<EnderecoDTO> enderecosDeEntrega
) {
}
