/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductIndication of the Data Model fhir.
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
{@link diseaseSymptomProcedure}, 
{@link diseaseStatus}, 
{@link comorbidity}, 
{@link intendedEffect}, 
{@link duration}, 
{@link otherTherapy}, 
{@link undesirableEffect}, 
{@link population}, 

* It provides of then following operations (getters and setters)
{@link getSubject},
{@link getDiseaseSymptomProcedure},
{@link getDiseaseStatus},
{@link getComorbidity},
{@link getIntendedEffect},
{@link getDuration},
{@link getOtherTherapy},
{@link getUndesirableEffect},
{@link getPopulation},
{@link setSubject},
{@link setDiseaseSymptomProcedure},
{@link setDiseaseStatus},
{@link setComorbidity},
{@link setIntendedEffect},
{@link setDuration},
{@link setOtherTherapy},
{@link setUndesirableEffect},
{@link setPopulation},
 */

@Description("Indication for the Medicinal Product.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicinalProductIndication extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicinalProductIndication> T = EntityTypes.T(MedicinalProductIndication.class);

	/* Constants for each property name. */
	java.lang.String subject = "subject";
	java.lang.String diseaseSymptomProcedure = "diseaseSymptomProcedure";
	java.lang.String diseaseStatus = "diseaseStatus";
	java.lang.String comorbidity = "comorbidity";
	java.lang.String intendedEffect = "intendedEffect";
	java.lang.String duration = "duration";
	java.lang.String otherTherapy = "otherTherapy";
	java.lang.String undesirableEffect = "undesirableEffect";
	java.lang.String population = "population";

	@Description("The medication for which this is an indication.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSubject();
	void setSubject(java.util.List<com.braintribe.model.generic.GenericEntity> subject);

	@Description("The disease, symptom or procedure that is the indication for treatment.")
	@Mandatory
	fhir.CodeableConcept getDiseaseSymptomProcedure();
	void setDiseaseSymptomProcedure(fhir.CodeableConcept diseaseSymptomProcedure);
	@Description("The status of the disease or symptom for which the indication applies.")
	@Mandatory
	fhir.CodeableConcept getDiseaseStatus();
	void setDiseaseStatus(fhir.CodeableConcept diseaseStatus);
	@Description("Comorbidity (concurrent condition) or co-infection as part of the indication.")
	
	java.util.List<fhir.CodeableConcept> getComorbidity();
	void setComorbidity(java.util.List<fhir.CodeableConcept> comorbidity);

	@Description("The intended effect, aim or strategy to be achieved by the indication.")
	@Mandatory
	fhir.CodeableConcept getIntendedEffect();
	void setIntendedEffect(fhir.CodeableConcept intendedEffect);
	@Description("Timing or duration information as part of the indication.")
	@Mandatory
	fhir.Quantity getDuration();
	void setDuration(fhir.Quantity duration);
	@Description("Information about the use of the medicinal product in relation to other therapies described as part of the indication.")
	
	java.util.List<fhir.MedicinalProductIndicationOtherTherapy> getOtherTherapy();
	void setOtherTherapy(java.util.List<fhir.MedicinalProductIndicationOtherTherapy> otherTherapy);

	@Description("Describe the undesirable effects of the medicinal product.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getUndesirableEffect();
	void setUndesirableEffect(java.util.List<com.braintribe.model.generic.GenericEntity> undesirableEffect);

	@Description("The population group to which this applies.")
	
	java.util.List<fhir.Population> getPopulation();
	void setPopulation(java.util.List<fhir.Population> population);

}
