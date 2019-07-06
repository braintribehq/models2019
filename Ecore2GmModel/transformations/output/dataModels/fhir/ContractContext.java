/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ContractContext of the Data Model fhir.
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
{@link reference}, 
{@link code}, 

* It provides of then following operations (getters and setters)
{@link getReference},
{@link getCode},
{@link setReference},
{@link setCode},
 */

@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")

public interface ContractContext extends GenericEntity, fhir.BackboneElement {

	EntityType<ContractContext> T = EntityTypes.T(ContractContext.class);

	/* Constants for each property name. */
	java.lang.String reference = "reference";
	java.lang.String code = "code";

	@Description("Asset context reference may include the creator, custodian, or owning Person or Organization (e.g., bank, repository),  location held, e.g., building,  jurisdiction.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReference();
	void setReference(com.braintribe.model.generic.GenericEntity reference);
	@Description("Coded representation of the context generally or of the Referenced entity, such as the asset holder type or location.")
	
	java.util.List<fhir.CodeableConcept> getCode();
	void setCode(java.util.List<fhir.CodeableConcept> code);

}
