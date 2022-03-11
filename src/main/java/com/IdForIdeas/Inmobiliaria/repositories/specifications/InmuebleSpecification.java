package com.IdForIdeas.Inmobiliaria.repositories.specifications;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.IdForIdeas.Inmobiliaria.filters.InmuebleFiltersDTO;
import com.IdForIdeas.Inmobiliaria.models.Inmueble;

@Component
public class InmuebleSpecification{
	
	public Specification<Inmueble> getByFilters(InmuebleFiltersDTO filtersDTO){
		return (root, query, criteriaBuilder) -> {
			
			List<Predicate> predicates = new ArrayList<>();
			
			if(StringUtils.hasLength(filtersDTO.getNombre())) {
				predicates.add(
					criteriaBuilder.like(
							criteriaBuilder.lower(root.get("nombre")),"%"+filtersDTO.getNombre().toLowerCase()+"%")
					);
			}
			
			if(StringUtils.hasLength(filtersDTO.getCiudad())) {
				predicates.add(
					criteriaBuilder.like(
							criteriaBuilder.lower(root.get("ciudad")),"%"+filtersDTO.getCiudad().toLowerCase()+"%")
					);
			}
			if(StringUtils.hasLength(filtersDTO.getContrato())) {
				predicates.add(
					criteriaBuilder.like(
							criteriaBuilder.lower(root.get("contrato")),"%"+filtersDTO.getContrato().toString().toLowerCase()+"%")
					);
			}
			if(filtersDTO.getAmbientesMin()!=null && filtersDTO.getAmbientesMin()!=0) {
				predicates.add(
						criteriaBuilder.greaterThanOrEqualTo(root.get("ambientes"), filtersDTO.getAmbientesMin())
						);
			}			
			if(filtersDTO.getAmbientesMax()!=null && filtersDTO.getAmbientesMax()!=0) {
				predicates.add(
						criteriaBuilder.lessThanOrEqualTo(root.get("ambientes"), filtersDTO.getAmbientesMax())
						);
			}		
			if(filtersDTO.getPrecioMin()!=null && filtersDTO.getPrecioMin()!=0) {
				predicates.add(
						criteriaBuilder.greaterThanOrEqualTo(root.get("precio"), filtersDTO.getPrecioMin())
						);
			}			
			if(filtersDTO.getPrecioMax()!=null && filtersDTO.getPrecioMax()!=0) {
				predicates.add(
						criteriaBuilder.lessThanOrEqualTo(root.get("precio"), filtersDTO.getPrecioMax())
						);
			}	
			
			/*
			if(filtersDTO.getAmbientes()!=null && filtersDTO.getAmbientes()!=0) {
				predicates.add(
						criteriaBuilder.like(criteriaBuilder.lower(root.get("ambientes").as(String.class)), filtersDTO.getAmbientes().toString())
						);
			}*/
			
			return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
		};
	}
	
	
	
	/*
	private SearchCriteria criteria;
	
	public InmuebleSpecification(SearchCriteria criteria) {
		this.criteria = criteria;
	}

	@Override
	public Predicate toPredicate(Root<Inmueble> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
		if (criteria.getOperation().equalsIgnoreCase(">")) {
			return builder.greaterThan(root.<String>get(criteria.getKey()), criteria.getValue().toString());			
		} else if(criteria.getOperation().equalsIgnoreCase("<")) {
			return builder.lessThan(root.<String> get(criteria.getKey()), criteria.getValue().toString());
		} else if (criteria.getOperation().equalsIgnoreCase(":")) {
            if (root.get(criteria.getKey()).getJavaType() == String.class) {
                return builder.like(
                  root.<String>get(criteria.getKey()), "%" + criteria.getValue() + "%");
            } else {
                return builder.equal(root.get(criteria.getKey()), criteria.getValue());
            }
        }
		return null;
	}
	*/
	

}
