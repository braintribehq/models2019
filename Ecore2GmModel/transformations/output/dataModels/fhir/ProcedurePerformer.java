/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ProcedurePerformer of the Data Model fhir.
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
{@link function}, 
{@link actor}, 
{@link onBehalfOf}, 

* It provides of then following operations (getters and setters)
{@link getFunction},
{@link getActor},
{@link getOnBehalfOf},
{@link setFunction},
{@link setActor},
{@link setOnBehalfOf},
 */

@Description("An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.")

public interface ProcedurePerformer extends GenericEntity, fhir.BackboneElement {

	EntityType<ProcedurePerformer> T = EntityTypes.T(ProcedurePerformer.class);

	/* Constants for each property name. */
	java.lang.String function = "function";
	java.lang.String actor = "actor";
	java.lang.String onBehalfOf = "onBehalfOf";

	@Description("Distinguishes the type of involvement of the performer in the procedure. For example, surgeon, anaesthetist, endoscopist.")
	@Mandatory
	fhir.CodeableConcept getFunction();
	void setFunction(fhir.CodeableConcept function);
	@Description("The practitioner who was involved in the procedure.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getActor();
	void setActor(com.braintribe.model.generic.GenericEntity actor);
	@Description("The organization the device or practitioner was acting on behalf of.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOnBehalfOf();
	void setOnBehalfOf(com.braintribe.model.generic.GenericEntity onBehalfOf);
}
