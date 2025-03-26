package br.jus.tream.lontra.repositories;

import org.springframework.data.jpa.domain.Specification;
import br.jus.tream.lontra.domain.Cliente;
import br.jus.tream.lontra.domain.DTO.ParamsDTO;
import jakarta.persistence.criteria.Predicate;

public class ClienteSpecification {
    public static Specification<Cliente> filterByParams(ParamsDTO params) {
        return (root, query, criteriaBuilder) -> {
            Predicate predicate = criteriaBuilder.conjunction();
            if (params.getId() != null) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("id"), params.getId()));
            }else {
                if ( !params.getNome().isBlank()) {
                    predicate = criteriaBuilder.and(
                            predicate, criteriaBuilder.like(root.get("nome"), "%" + params.getNome().toUpperCase() + "%")
                    );
                }
                if (!params.getCelular().isBlank()) {
                    predicate = criteriaBuilder.and(predicate, criteriaBuilder.like(root.get("celular"), "%" + params.getCelular() + "%"));
                }
                if (!params.getCep().isBlank()) {
                    predicate = criteriaBuilder.and(predicate, criteriaBuilder.like(root.get("cep"), "%" + params.getCep() + "%"));
                }
            }
            return predicate;
        };
    }
}
