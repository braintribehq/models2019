/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductInteraction of the Data Model fhir.
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
{@link subject}, 
{@link interactant}, 
{@link type}, 
{@link effect}, 
{@link incidence}, 
{@link management}, 

* It provides of then following operations (getters and setters)
{@link getSubject},
{@link getInteractant},
{@link getType},
{@link getEffect},
{@link getIncidence},
{@link getManagement},
{@link setSubject},
{@link setInteractant},
{@link setType},
{@link setEffect},
{@link setIncidence},
{@link setManagement},
 */

@Description("The interactions of the medicinal product with other medicinal products, or other forms of interactions.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicinalProductInteraction extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicinalProductInteraction> T = EntityTypes.T(MedicinalProductInteraction.class);

	/* Constants for each property name. */
	java.lang.String subject = "subject";
	java.lang.String interactant = "interactant";
	java.lang.String type = "type";
	java.lang.String effect = "effect";
	java.lang.String incidence = "incidence";
	java.lang.String management = "management";

	@Description("The medication for which this is a described interaction.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSubject();
	void setSubject(java.util.List<com.braintribe.model.generic.GenericEntity> subject);

	@Description("The specific medication, food or laboratory test that interacts.")
	
	java.util.List<fhir.MedicinalProductInteractionInteractant> getInteractant();
	void setInteractant(java.util.List<fhir.MedicinalProductInteractionInteractant> interactant);

	@Description("The type of the interaction e.g. drug-drug interaction, drug-food interaction, drug-lab test interaction.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The effect of the interaction, for example 'reduced gastric absorption of primary medication'.")
	@Mandatory
	fhir.CodeableConcept getEffect();
	void setEffect(fhir.CodeableConcept effect);
	@Description("The incidence of the interaction, e.g. theoretical, observed.")
	@Mandatory
	fhir.CodeableConcept getIncidence();
	void setIncidence(fhir.CodeableConcept incidence);
	@Description("Actions for managing the interaction.")
	@Mandatory
	fhir.CodeableConcept getManagement();
	void setManagement(fhir.CodeableConcept management);
}
