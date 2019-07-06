/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationDispenseSubstitution of the Data Model fhir.
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
{@link type}, 
{@link reason}, 
{@link responsibleParty}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getReason},
{@link getResponsibleParty},
{@link setType},
{@link setReason},
{@link setResponsibleParty},
 */

@Description("Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.")

public interface MedicationDispenseSubstitution extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationDispenseSubstitution> T = EntityTypes.T(MedicationDispenseSubstitution.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String reason = "reason";
	java.lang.String responsibleParty = "responsibleParty";

	@Description("A code signifying whether a different drug was dispensed from what was prescribed.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Indicates the reason for the substitution (or lack of substitution) from what was prescribed.")
	
	java.util.List<fhir.CodeableConcept> getReason();
	void setReason(java.util.List<fhir.CodeableConcept> reason);

	@Description("The person or organization that has primary responsibility for the substitution.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getResponsibleParty();
	void setResponsibleParty(java.util.List<com.braintribe.model.generic.GenericEntity> responsibleParty);

}
