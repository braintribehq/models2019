/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ProcedureFocalDevice of the Data Model fhir.
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
{@link action}, 
{@link manipulated}, 

* It provides of then following operations (getters and setters)
{@link getAction},
{@link getManipulated},
{@link setAction},
{@link setManipulated},
 */

@Description("An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.")

public interface ProcedureFocalDevice extends GenericEntity, fhir.BackboneElement {

	EntityType<ProcedureFocalDevice> T = EntityTypes.T(ProcedureFocalDevice.class);

	/* Constants for each property name. */
	java.lang.String action = "action";
	java.lang.String manipulated = "manipulated";

	@Description("The kind of change that happened to the device during the procedure.")
	@Mandatory
	fhir.CodeableConcept getAction();
	void setAction(fhir.CodeableConcept action);
	@Description("The device that was manipulated (changed) during the procedure.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getManipulated();
	void setManipulated(com.braintribe.model.generic.GenericEntity manipulated);
}
