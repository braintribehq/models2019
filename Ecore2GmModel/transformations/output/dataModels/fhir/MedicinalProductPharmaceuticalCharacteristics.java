/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductPharmaceuticalCharacteristics of the Data Model fhir.
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
{@link code}, 
{@link status}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getStatus},
{@link setCode},
{@link setStatus},
 */

@Description("A pharmaceutical product described in terms of its composition and dose form.")

public interface MedicinalProductPharmaceuticalCharacteristics extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductPharmaceuticalCharacteristics> T = EntityTypes.T(MedicinalProductPharmaceuticalCharacteristics.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String status = "status";

	@Description("A coded characteristic.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The status of characteristic e.g. assigned or pending.")
	@Mandatory
	fhir.CodeableConcept getStatus();
	void setStatus(fhir.CodeableConcept status);
}
