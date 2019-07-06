/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Population of the Data Model fhir.
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
{@link ageRange}, 
{@link ageCodeableConcept}, 
{@link gender}, 
{@link race}, 
{@link physiologicalCondition}, 

* It provides of then following operations (getters and setters)
{@link getAgeRange},
{@link getAgeCodeableConcept},
{@link getGender},
{@link getRace},
{@link getPhysiologicalCondition},
{@link setAgeRange},
{@link setAgeCodeableConcept},
{@link setGender},
{@link setRace},
{@link setPhysiologicalCondition},
 */

@Description("A populatioof people with some set of grouping criteria.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface Population extends GenericEntity, fhir.BackboneElement {

	EntityType<Population> T = EntityTypes.T(Population.class);

	/* Constants for each property name. */
	java.lang.String ageRange = "ageRange";
	java.lang.String ageCodeableConcept = "ageCodeableConcept";
	java.lang.String gender = "gender";
	java.lang.String race = "race";
	java.lang.String physiologicalCondition = "physiologicalCondition";

	@Description("")
	@Mandatory
	fhir.Range getAgeRange();
	void setAgeRange(fhir.Range ageRange);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getAgeCodeableConcept();
	void setAgeCodeableConcept(fhir.CodeableConcept ageCodeableConcept);
	@Description("The gender of the specific population.")
	@Mandatory
	fhir.CodeableConcept getGender();
	void setGender(fhir.CodeableConcept gender);
	@Description("Race of the specific population.")
	@Mandatory
	fhir.CodeableConcept getRace();
	void setRace(fhir.CodeableConcept race);
	@Description("The existing physiological conditions of the specific population to which this applies.")
	@Mandatory
	fhir.CodeableConcept getPhysiologicalCondition();
	void setPhysiologicalCondition(fhir.CodeableConcept physiologicalCondition);
}
