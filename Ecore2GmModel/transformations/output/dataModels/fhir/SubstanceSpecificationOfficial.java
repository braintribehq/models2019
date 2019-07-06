/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSpecificationOfficial of the Data Model fhir.
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
{@link authority}, 
{@link status}, 

* It provides of then following operations (getters and setters)
{@link getAuthority},
{@link getStatus},
{@link setAuthority},
{@link setStatus},
 */

@Description("The detailed description of a substance, typically at a level beyond what is used for prescribing.")

public interface SubstanceSpecificationOfficial extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceSpecificationOfficial> T = EntityTypes.T(SubstanceSpecificationOfficial.class);

	/* Constants for each property name. */
	java.lang.String authority = "authority";
	java.lang.String status = "status";

	@Description("Which authority uses this official name.")
	@Mandatory
	fhir.CodeableConcept getAuthority();
	void setAuthority(fhir.CodeableConcept authority);
	@Description("The status of the official name.")
	@Mandatory
	fhir.CodeableConcept getStatus();
	void setStatus(fhir.CodeableConcept status);
}
