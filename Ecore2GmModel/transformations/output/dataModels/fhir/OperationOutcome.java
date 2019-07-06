/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type OperationOutcome of the Data Model fhir.
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
{@link issue}, 

* It provides of then following operations (getters and setters)
{@link getIssue},
{@link setIssue},
 */

@Description("A collection of error, warning, or information messages that result from a system action.If the element is present, it must have either a @value, an @id, or extensions")

public interface OperationOutcome extends GenericEntity, fhir.FhirDomainResource {

	EntityType<OperationOutcome> T = EntityTypes.T(OperationOutcome.class);

	/* Constants for each property name. */
	java.lang.String issue = "issue";

	@Description("An error, warning, or information message that results from a system action.")
	
	java.util.List<fhir.OperationOutcomeIssue> getIssue();
	void setIssue(java.util.List<fhir.OperationOutcomeIssue> issue);

}
