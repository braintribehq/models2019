/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductUndesirableEffect of the Data Model fhir.
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
{@link symptomConditionEffect}, 
{@link classification}, 
{@link frequencyOfOccurrence}, 
{@link population}, 

* It provides of then following operations (getters and setters)
{@link getSubject},
{@link getSymptomConditionEffect},
{@link getClassification},
{@link getFrequencyOfOccurrence},
{@link getPopulation},
{@link setSubject},
{@link setSymptomConditionEffect},
{@link setClassification},
{@link setFrequencyOfOccurrence},
{@link setPopulation},
 */

@Description("Describe the undesirable effects of the medicinal product.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicinalProductUndesirableEffect extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicinalProductUndesirableEffect> T = EntityTypes.T(MedicinalProductUndesirableEffect.class);

	/* Constants for each property name. */
	java.lang.String subject = "subject";
	java.lang.String symptomConditionEffect = "symptomConditionEffect";
	java.lang.String classification = "classification";
	java.lang.String frequencyOfOccurrence = "frequencyOfOccurrence";
	java.lang.String population = "population";

	@Description("The medication for which this is an indication.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSubject();
	void setSubject(java.util.List<com.braintribe.model.generic.GenericEntity> subject);

	@Description("The symptom, condition or undesirable effect.")
	@Mandatory
	fhir.CodeableConcept getSymptomConditionEffect();
	void setSymptomConditionEffect(fhir.CodeableConcept symptomConditionEffect);
	@Description("Classification of the effect.")
	@Mandatory
	fhir.CodeableConcept getClassification();
	void setClassification(fhir.CodeableConcept classification);
	@Description("The frequency of occurrence of the effect.")
	@Mandatory
	fhir.CodeableConcept getFrequencyOfOccurrence();
	void setFrequencyOfOccurrence(fhir.CodeableConcept frequencyOfOccurrence);
	@Description("The population group to which this applies.")
	
	java.util.List<fhir.Population> getPopulation();
	void setPopulation(java.util.List<fhir.Population> population);

}
