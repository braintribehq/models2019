/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ConceptMapTarget of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link dependsOn}, 
{@link product}, 

* It provides of then following operations (getters and setters)
{@link getDependsOn},
{@link getProduct},
{@link setDependsOn},
{@link setProduct},
 */

@Description("A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.")

public interface ConceptMapTarget extends GenericEntity, fhir.BackboneElement {

	EntityType<ConceptMapTarget> T = EntityTypes.T(ConceptMapTarget.class);

	/* Constants for each property name. */
	java.lang.String dependsOn = "dependsOn";
	java.lang.String product = "product";

	@Description("A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value.")
	
	java.util.List<fhir.ConceptMapDependsOn> getDependsOn();
	void setDependsOn(java.util.List<fhir.ConceptMapDependsOn> dependsOn);

	@Description("A set of additional outcomes from this mapping to other elements. To properly execute this mapping, the specified element must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on.")
	
	java.util.List<fhir.ConceptMapDependsOn> getProduct();
	void setProduct(java.util.List<fhir.ConceptMapDependsOn> product);

}
