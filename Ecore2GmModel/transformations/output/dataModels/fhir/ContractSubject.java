/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ContractSubject of the Data Model fhir.
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
{@link role}, 

* It provides of then following operations (getters and setters)
{@link getReference},
{@link getRole},
{@link setReference},
{@link setRole},
 */

@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")

public interface ContractSubject extends GenericEntity, fhir.BackboneElement {

	EntityType<ContractSubject> T = EntityTypes.T(ContractSubject.class);

	/* Constants for each property name. */
	java.lang.String reference = "reference";
	java.lang.String role = "role";

	@Description("The entity the action is performed or not performed on or for.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReference();
	void setReference(java.util.List<com.braintribe.model.generic.GenericEntity> reference);

	@Description("Role type of agent assigned roles in this Contract.")
	@Mandatory
	fhir.CodeableConcept getRole();
	void setRole(fhir.CodeableConcept role);
}
