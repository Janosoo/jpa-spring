package specifications;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.example.demo.Customer;

public class CustomerSpecification implements Specification<Customer> {
	
    private SearchCriteria criteria;
    
	@Override
	public Predicate toPredicate
	  (Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
	
	    if (criteria.getOperation().equalsIgnoreCase(">")) {
	        return builder.greaterThanOrEqualTo(
	          root.<String> get(criteria.getKey()), criteria.getValue().toString());
	    } 
	    else if (criteria.getOperation().equalsIgnoreCase("<")) {
	        return builder.lessThanOrEqualTo(
	          root.<String> get(criteria.getKey()), criteria.getValue().toString());
	    } 
	    else if (criteria.getOperation().equalsIgnoreCase(":")) {
	        if (root.get(criteria.getKey()).getJavaType() == String.class) {
	            return builder.like(
	              root.<String>get(criteria.getKey()), "%" + criteria.getValue() + "%");
	        } else {
	            return builder.equal(root.get(criteria.getKey()), criteria.getValue());
	        }
	    }
	    return null;
	    
}
	
	


	public CustomerSpecification() {
	}


	public CustomerSpecification(SearchCriteria criteria) {
		this.criteria = criteria;
	}




	public SearchCriteria getCriteria() {
		return criteria;
	}




	public void setCriteria(SearchCriteria criteria) {
		this.criteria = criteria;
	}
	
	
	
	

}