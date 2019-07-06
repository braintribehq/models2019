/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type OperationOutcomeIssue of the Data Model fhir.
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
{@link details}, 

* It provides of then following operations (getters and setters)
{@link getDetails},
{@link setDetails},
 */

@Description("A collection of error, warning, or information messages that result from a system action.")

public interface OperationOutcomeIssue extends GenericEntity, fhir.BackboneElement {

	EntityType<OperationOutcomeIssue> T = EntityTypes.T(OperationOutcomeIssue.class);

	/* Constants for each property name. */
	java.lang.String details = "details";

	@Description("Additional details about the error. This may be a text description of the error or a system code that identifies the error.")
	@Mandatory
	fhir.CodeableConcept getDetails();
	void setDetails(fhir.CodeableConcept details);
}
