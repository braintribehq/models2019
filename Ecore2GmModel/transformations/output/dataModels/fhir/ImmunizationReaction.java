/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ImmunizationReaction of the Data Model fhir.
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
{@link detail}, 

* It provides of then following operations (getters and setters)
{@link getDetail},
{@link setDetail},
 */

@Description("Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.")

public interface ImmunizationReaction extends GenericEntity, fhir.BackboneElement {

	EntityType<ImmunizationReaction> T = EntityTypes.T(ImmunizationReaction.class);

	/* Constants for each property name. */
	java.lang.String detail = "detail";

	@Description("Details of the reaction.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDetail();
	void setDetail(com.braintribe.model.generic.GenericEntity detail);
}
