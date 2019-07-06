/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SpecimenDefinition of the Data Model fhir.
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
{@link identifier}, 
{@link typeCollected}, 
{@link patientPreparation}, 
{@link collection}, 
{@link typeTested}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getTypeCollected},
{@link getPatientPreparation},
{@link getCollection},
{@link getTypeTested},
{@link setIdentifier},
{@link setTypeCollected},
{@link setPatientPreparation},
{@link setCollection},
{@link setTypeTested},
 */

@Description("A kind of specimen with associated set of requirements.If the element is present, it must have either a @value, an @id, or extensions")

public interface SpecimenDefinition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<SpecimenDefinition> T = EntityTypes.T(SpecimenDefinition.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String typeCollected = "typeCollected";
	java.lang.String patientPreparation = "patientPreparation";
	java.lang.String collection = "collection";
	java.lang.String typeTested = "typeTested";

	@Description("A business identifier associated with the kind of specimen.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("The kind of material to be collected.")
	@Mandatory
	fhir.CodeableConcept getTypeCollected();
	void setTypeCollected(fhir.CodeableConcept typeCollected);
	@Description("Preparation of the patient for specimen collection.")
	
	java.util.List<fhir.CodeableConcept> getPatientPreparation();
	void setPatientPreparation(java.util.List<fhir.CodeableConcept> patientPreparation);

	@Description("The action to be performed for collecting the specimen.")
	
	java.util.List<fhir.CodeableConcept> getCollection();
	void setCollection(java.util.List<fhir.CodeableConcept> collection);

	@Description("Specimen conditioned in a container as expected by the testing laboratory.")
	
	java.util.List<fhir.SpecimenDefinitionTypeTested> getTypeTested();
	void setTypeTested(java.util.List<fhir.SpecimenDefinitionTypeTested> typeTested);

}
