/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type VerificationResultPrimarySource of the Data Model fhir.
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
{@link who}, 
{@link type}, 
{@link communicationMethod}, 
{@link validationStatus}, 
{@link canPushUpdates}, 
{@link pushTypeAvailable}, 

* It provides of then following operations (getters and setters)
{@link getWho},
{@link getType},
{@link getCommunicationMethod},
{@link getValidationStatus},
{@link getCanPushUpdates},
{@link getPushTypeAvailable},
{@link setWho},
{@link setType},
{@link setCommunicationMethod},
{@link setValidationStatus},
{@link setCanPushUpdates},
{@link setPushTypeAvailable},
 */

@Description("Describes validation requirements, source(s), status and dates for one or more elements.")

public interface VerificationResultPrimarySource extends GenericEntity, fhir.BackboneElement {

	EntityType<VerificationResultPrimarySource> T = EntityTypes.T(VerificationResultPrimarySource.class);

	/* Constants for each property name. */
	java.lang.String who = "who";
	java.lang.String type = "type";
	java.lang.String communicationMethod = "communicationMethod";
	java.lang.String validationStatus = "validationStatus";
	java.lang.String canPushUpdates = "canPushUpdates";
	java.lang.String pushTypeAvailable = "pushTypeAvailable";

	@Description("Reference to the primary source.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getWho();
	void setWho(com.braintribe.model.generic.GenericEntity who);
	@Description("Type of primary source (License Board; Primary Education; Continuing Education; Postal Service; Relationship owner; Registration Authority; legal source; issuing source; authoritative source).")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("Method for communicating with the primary source (manual; API; Push).")
	
	java.util.List<fhir.CodeableConcept> getCommunicationMethod();
	void setCommunicationMethod(java.util.List<fhir.CodeableConcept> communicationMethod);

	@Description("Status of the validation of the target against the primary source (successful; failed; unknown).")
	@Mandatory
	fhir.CodeableConcept getValidationStatus();
	void setValidationStatus(fhir.CodeableConcept validationStatus);
	@Description("Ability of the primary source to push updates/alerts (yes; no; undetermined).")
	@Mandatory
	fhir.CodeableConcept getCanPushUpdates();
	void setCanPushUpdates(fhir.CodeableConcept canPushUpdates);
	@Description("Type of alerts/updates the primary source can send (specific requested changes; any changes; as defined by source).")
	
	java.util.List<fhir.CodeableConcept> getPushTypeAvailable();
	void setPushTypeAvailable(java.util.List<fhir.CodeableConcept> pushTypeAvailable);

}
